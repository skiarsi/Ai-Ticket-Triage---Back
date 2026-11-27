package com.AiTicketTriage.TicketTriage.service;

import org.springframework.stereotype.Service;

import com.AiTicketTriage.TicketTriage.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor
public class UserService {
  private final UserRepository repository;

}
