package com.example.comicUis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
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
    
}
