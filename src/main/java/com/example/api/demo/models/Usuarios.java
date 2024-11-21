package com.example.api.demo.models;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table (name = "usuarios")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Usuarios {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    
    private Integer id;
    private String nome;
    private Date dataNascimento;
    private String email;
    private String senha;

}
