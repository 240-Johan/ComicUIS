package com.example.comicUis.repository;

import java.io.Serializable;
import java.util.List;

import com.example.comicUis.entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("usuarioRepository")
public interface UsuarioRepository extends JpaRepository<Usuario,Serializable> {
    public List<Usuario> findByCorreoAndPassword(String correo, String password);

    
}
