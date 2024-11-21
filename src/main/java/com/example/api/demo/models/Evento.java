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


@Table (name = "eventos")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Evento {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    
    private Integer id;
    private String nome;
    private String endereco;
    private String cidade;
    private Date data;
    private Boolean remoto;
    
    /*@OneToMany
    @JoinColumn(name = "evento_cupom")
    private Evento evento;
    
    @ManyToOne
    @JoinColumn(name = "evento_empresa")*/

}
