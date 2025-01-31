package br.jus.tse.ged.auditTrail;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

interface AuditLogDocumentDao extends  ElasticsearchRepository<AuditLogDocument, String> {
	
}
