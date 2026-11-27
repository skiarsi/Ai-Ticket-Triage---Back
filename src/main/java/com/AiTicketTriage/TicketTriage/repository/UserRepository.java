package com.AiTicketTriage.TicketTriage.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AiTicketTriage.TicketTriage.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> finByEmail(String email);
  boolean existByEmail(String email);
}
