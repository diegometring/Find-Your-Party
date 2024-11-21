package com.example.api.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table (name = "Empresa")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Empresa {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nome;
    private String email;
    private String senha;
    private String imagem;

}
