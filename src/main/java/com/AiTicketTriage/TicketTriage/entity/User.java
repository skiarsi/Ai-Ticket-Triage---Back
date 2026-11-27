package com.AiTicketTriage.TicketTriage.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.AiTicketTriage.TicketTriage.enums.UserRole;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data 
@Table(name = "users")
public class User {

  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String name;
  
  @Column(unique = true, nullable = false)
  private String email;

  @Column(nullable = false)
  private String password;


  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private UserRole role = UserRole.USER;


  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Ticket> tickets = new ArrayList<>();  

  // @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
  // private List<TicketMessage> messages = new ArrayList<>();


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
