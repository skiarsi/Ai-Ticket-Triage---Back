package com.AiTicketTriage.TicketTriage.service;

import org.springframework.stereotype.Service;

import com.AiTicketTriage.TicketTriage.repository.TicketRepository;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor
public class TicketService {
  private final TicketRepository repository;
}
