package com.example.api.demo.repository;

import com.example.api.demo.models.Ingresso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngressoRepository extends JpaRepository <Ingresso, Integer> {
}
