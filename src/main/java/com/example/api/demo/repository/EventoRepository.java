package com.example.api.demo.repository;

import com.example.api.demo.models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository <Evento, Integer> {
}
