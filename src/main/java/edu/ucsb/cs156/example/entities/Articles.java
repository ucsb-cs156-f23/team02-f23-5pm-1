package edu.ucsb.cs156.example.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import lombok.Data;
import javax.persistence.GeneratedValue;
import lombok.NoArgsConstructor;
import javax.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "ucsbarticles")
public class Articles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String title;
    private String url;
    private String explanation;
    private String email;
    private LocalDateTime dateAdded;
}