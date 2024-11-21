package com.example.api.demo.repository;

import com.example.api.demo.models.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository <Empresa, Integer>{
}
