package com.AiTicketTriage.TicketTriage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AiTicketTriage.TicketTriage.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {}
