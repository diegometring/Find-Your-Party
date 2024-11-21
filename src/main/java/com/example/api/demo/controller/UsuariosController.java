package com.example.api.demo.controller;

import com.example.api.demo.models.Usuarios;
import com.example.api.demo.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    UsuariosRepository usuariosRepository;

    @PostMapping("/criarConta")
    public ResponseEntity<Usuarios> criarConta(@RequestBody Usuarios usuarios) {
        Usuarios user = usuariosRepository.save(usuarios);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    /*@PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginRequestDTO body) {
        Usuarios usuarios = this.usuariosRepository.findByEmail(body.email())
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado"));

        if (passwordEncoder.matches(body.senha(), usuarios.getSenha())) {
            String token = this.tokenService.generateToken(usuarios);
            return ResponseEntity.ok(new ResponseDTO(usuarios.getNome(), token));
        }
        return ResponseEntity.badRequest().build();
    }*/

    /*@GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<List<Usuarios>> getAll() {
        List<Usuarios> todosUsuarios = usuariosRepository.findAll();
        return new ResponseEntity<List<Usuarios>>(todosUsuarios, HttpStatus.OK);
    }*/
}
