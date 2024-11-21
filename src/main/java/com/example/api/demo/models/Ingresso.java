package com.example.api.demo.models;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table (name = "cupom")
@Entity
@Data
@AllArgsConstructor

public class Ingresso {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Integer id;
    private boolean valido;
    private LocalDateTime expira;
    private UUID codigo;

    public Ingresso(){
        this.expira = this.valido ? null : LocalDateTime.now();
        this.valido = LocalDateTime.now().isBefore(expira);
        this.codigo = UUID.randomUUID();
    }

    
}
