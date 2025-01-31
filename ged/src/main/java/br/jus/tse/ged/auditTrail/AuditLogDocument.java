package br.jus.tse.ged.auditTrail;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(createIndex = true, indexName = "auditlog")
public class AuditLogDocument {
	
	@Id
	private String id;
	
	@Field(type = FieldType.Text, name = "nome")
	private String nome;
	
	@Field(type = FieldType.Text, name = "destino")
	private String destino;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public String toString() {
		return "AuditLogDocument [id=" + id + ", nome=" + nome + ", destino=" + destino + "]";
	}
	
	
	
}
