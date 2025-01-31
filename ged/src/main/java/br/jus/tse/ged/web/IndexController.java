package br.jus.tse.ged.web;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.jus.tse.ged.auditTrail.AuditLogDocument;
import br.jus.tse.ged.auditTrail.AuditTrack;
import net.datafaker.Faker;

@RestController
@RequestMapping("/log")
public class IndexController {
	
	private AuditTrack auditTrackService;
	
	
	public IndexController(AuditTrack auditTrackService) {
		super();
		this.auditTrackService = auditTrackService;
	}



	@GetMapping
	public Map<String,String> index() {
		
		
		AuditLogDocument doc = createDocument();
		System.out.println(doc);
		
		AuditLogDocument doc2 = auditTrackService.createDocumentLog(doc);
		System.out.println(doc2);
		Map<String,String>saudacao = new HashMap<>(2);
		saudacao.put("ola", "Tudo bem?");
		saudacao.put("hoje", LocalDate.now().toString());
		return saudacao;
	}
	
	private AuditLogDocument createDocument() {
		Faker faker = new Faker(new Locale("pt","BR"));
		
		AuditLogDocument auditLogDocument = new AuditLogDocument();
		auditLogDocument.setDestino(faker.naruto().village());
		auditLogDocument.setNome(faker.naruto().demon());
		
		return auditLogDocument;
	}

	
}
