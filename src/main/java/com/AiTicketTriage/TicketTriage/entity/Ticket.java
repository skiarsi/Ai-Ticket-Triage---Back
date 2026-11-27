package com.AiTicketTriage.TicketTriage.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.AiTicketTriage.TicketTriage.enums.TicketCategory;
import com.AiTicketTriage.TicketTriage.enums.TicketPriority;
import com.AiTicketTriage.TicketTriage.enums.TicketStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data 
@Table(name = "tickets") 
public class Ticket {
  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  @OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<TicketMessage> messages = new ArrayList<>();

  @Column(nullable = false)
  private String subject;

  @Column(nullable = true, columnDefinition = "TEXT")
  private String description;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private TicketStatus status = TicketStatus.IN_PROGRESS;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private TicketPriority priority = TicketPriority.MEDIUM;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private TicketCategory category = TicketCategory.OTHER;

  @Column(name="ai_suggested_reply", nullable = true, columnDefinition = "TEXT")
  private String aiSuggestedReply;

  @Column(name= "created_at", updatable = false)
  private LocalDateTime createdAt;

  @Column(name= "updated_at")
  private LocalDateTime updatedAt;

  @PrePersist 
  protected void onCreate(){
    this.createdAt = LocalDateTime.now();
    this.updatedAt = LocalDateTime.now();
  }

  @PreUpdate 
  protected void onUpdate(){
    this.updatedAt = LocalDateTime.now();
  }
}
