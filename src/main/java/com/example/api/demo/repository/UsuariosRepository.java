package com.example.api.demo.repository;

import com.example.api.demo.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuariosRepository extends JpaRepository <Usuarios, Integer>{
    Optional<Usuarios> findByLogin(String login);
    Optional<Usuarios> findByEmail(String username);
}
