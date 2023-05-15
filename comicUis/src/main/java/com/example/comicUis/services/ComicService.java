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

import com.example.comicUis.entity.Comic;
import com.example.comicUis.repository.ComicRepository;

@RestController
@RequestMapping("/comic")
@CrossOrigin
public class ComicService {
    
    @Autowired
    ComicRepository comicRepository;

    @PostMapping("/guardar")
    public Comic saveComic(@RequestBody Comic comic) {
        return comicRepository.save(comic);
    }
    @PutMapping("/actualizar")
    public Comic actualizarUsuario(@RequestBody Comic comic ){
        return comicRepository.save(comic);
    }
    @DeleteMapping("/eliminar/{id}")
    public void deleteUsuario(@PathVariable("id") int id) {
        Optional<Comic> comic;
        comic = comicRepository.findById(id);
        if (comic.isPresent()) {
            comicRepository.delete(comic.get());
        }
    }
    @GetMapping("/buscar")
    public List<Comic> getAllComic() {
        return comicRepository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public Optional< Comic> findById(@PathVariable final Long id) {
        Optional<Comic> comic;
        comic = comicRepository.findById(id);
        return comic;
    }
}
