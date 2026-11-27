package com.AiTicketTriage.TicketTriage.service;

import org.springframework.stereotype.Service;

import com.AiTicketTriage.TicketTriage.repository.AuditLogRepository;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor 
public class AuditLogService {
  private final AuditLogRepository repository;


  
}
