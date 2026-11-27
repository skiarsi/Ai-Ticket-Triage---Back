package com.AiTicketTriage.TicketTriage.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;

@Entity 
@Table(name = "ticket_message")
@Data 
public class TicketMessage {
  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ticket_id", nullable = false)
  private Ticket ticket;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  @Column(nullable = false, columnDefinition = "TEXT")
  private String message;

  @Column(name="is_ai_generated", nullable = false)
  private boolean aiGenerated = false;

  @Column(name= "created_at", updatable = false)
  private LocalDateTime createdAt;

  @PrePersist 
  protected void onCreate(){
    this.createdAt = LocalDateTime.now();
  }
}
