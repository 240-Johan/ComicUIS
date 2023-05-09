package com.example.comicUis.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.comicUis.entity.Comic;

@Repository("comicRepository")
public interface ComicRepository extends JpaRepository<Comic,Serializable>{
    
}
