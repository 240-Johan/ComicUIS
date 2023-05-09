package com.example.comicUis.entity;



import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Table(name = "comic")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Comic implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private int idComic;

    private String tituloComic;
    private String descripcionComic;
    private int numeroComic;
    private String rutaImagen;
    private Boolean estado;
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.MERGE, mappedBy = "usuario")
    private List<ProgresoLectura> progresoLecturas;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.MERGE, mappedBy = "usuario")
    private List<Comentarios> comentarios;


    

    public List<Comentarios> getComentarios() {
        return comentarios;
    }
    public void setComentarios(List<Comentarios> comentarios) {
        this.comentarios = comentarios;
    }
    public int getIdComic() {
        return idComic;
    }
    public void setIdComic(int idComic) {
        this.idComic = idComic;
    }
    public String getTituloComic() {
        return tituloComic;
    }
    public void setTituloComic(String tituloComic) {
        this.tituloComic = tituloComic;
    }
    public String getDescripcionComic() {
        return descripcionComic;
    }
    public void setDescripcionComic(String descripcionComic) {
        this.descripcionComic = descripcionComic;
    }
    public int getNumeroComic() {
        return numeroComic;
    }
    public void setNumeroComic(int numeroComic) {
        this.numeroComic = numeroComic;
    }
    public String getRutaImagen() {
        return rutaImagen;
    }
    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public List<ProgresoLectura> getProgresoLecturas() {
        return progresoLecturas;
    }
    public void setProgresoLecturas(List<ProgresoLectura> progresoLecturas) {
        this.progresoLecturas = progresoLecturas;
    }


}