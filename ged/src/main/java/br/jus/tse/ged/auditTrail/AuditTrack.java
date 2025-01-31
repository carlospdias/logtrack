package br.jus.tse.ged.auditTrail;

import org.springframework.stereotype.Service;

@Service
public class AuditTrack {
	
	private AuditLogDocumentDao auditLogDocumentDao;

	public AuditTrack(AuditLogDocumentDao auditLogDocumentDao) {
		super();
		this.auditLogDocumentDao = auditLogDocumentDao;
	}
	
	public AuditLogDocument createDocumentLog(AuditLogDocument document) {
		AuditLogDocument auditLog = auditLogDocumentDao.save(document);
		
		return auditLog;
	}
}
