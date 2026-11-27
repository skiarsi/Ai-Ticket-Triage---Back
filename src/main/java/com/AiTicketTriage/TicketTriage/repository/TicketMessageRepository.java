package com.AiTicketTriage.TicketTriage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AiTicketTriage.TicketTriage.entity.TicketMessage;

@Repository 
public interface TicketMessageRepository extends JpaRepository<TicketMessage, Long> {}
