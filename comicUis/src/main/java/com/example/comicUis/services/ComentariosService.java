package com.example.comicUis.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.comicUis.entity.Comentarios;
import com.example.comicUis.entity.Usuario;
import com.example.comicUis.repository.ComentariosRepository;
import com.example.comicUis.repository.UsuarioRepository;

@RestController
@RequestMapping("/comentarios")
@CrossOrigin
public class ComentariosService {

    @Autowired
    ComentariosRepository comentarioRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping("/guardar/{idUsuario}")
    public Comentarios saveComentario(@RequestBody Comentarios comentario, @PathVariable("idUsuario") int idUsuario) {
        List<Usuario> usuarios = usuarioRepository.findAll();
        Usuario usuario = new Usuario();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getIdUsuario() == idUsuario) {
                usuario = usuarios.get(i);
            }
        }
        comentario.setUsuario(usuario);
        return comentarioRepository.save(comentario);
    }

    @PutMapping("/actualizar")
    public Comentarios actualizarComentario(@RequestBody Comentarios comentario ){
            return    comentarioRepository.save(comentario);
    }

    @GetMapping("/buscar")
    public List<Comentarios> getComentarios(){
        return comentarioRepository.findAll();
    }
    @GetMapping("/buscar/{id}")
    public Optional< Comentarios> findById(@PathVariable final Long id){
       Optional< Comentarios> comentario = comentarioRepository.findById(id);


        return comentario;
    }

    @DeleteMapping("/eliminar/{id}")
    public void deleteComentario(@PathVariable ("id") int id){
        Optional<Comentarios> comentario;
       comentario= comentarioRepository.findById(id);
             if(comentario.isPresent()){
            comentarioRepository.delete(comentario.get());
        }
    }

}
