package com.example.comicUis.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "progresoLectura")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class ProgresoLectura implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private int idProgreso;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
    private Usuario usuario;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
    private Comic comic;

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public int getIdProgreso() {
        return idProgreso;
    }
    public void setIdProgreso(int idProgreso) {
        this.idProgreso = idProgreso;
    }
    public Comic getComic() {
        return comic;
    }
    public void setComic(Comic comic) {
        this.comic = comic;
    }
  

}
