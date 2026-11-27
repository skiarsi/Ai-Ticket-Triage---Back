package com.AiTicketTriage.TicketTriage.service;

import org.springframework.stereotype.Service;

import com.AiTicketTriage.TicketTriage.repository.TicketMessageRepository;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor
public class TicketMessageService {
  private final TicketMessageRepository repository;
}
