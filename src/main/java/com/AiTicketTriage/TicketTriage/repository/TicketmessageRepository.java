package com.AiTicketTriage.TicketTriage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AiTicketTriage.TicketTriage.entity.TicketMessage;

public interface TicketmessageRepository extends JpaRepository<TicketMessage, Long> {}
