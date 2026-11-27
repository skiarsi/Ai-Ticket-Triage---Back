package com.AiTicketTriage.TicketTriage.repository;

import org.hibernate.audit.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {}
