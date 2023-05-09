package com.example.comicUis.entity;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "comentarios")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Comentarios implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private int idComentario;

    private String contenidoComentario;
    private Date fechaComentario;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
    private Usuario usuario;
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    /**
     * @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
     *                  private Rol rol;
     */
    public int getIdComentario() {
        return idComentario;
    }
    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }
    public String getContenidoComentario() {
        return contenidoComentario;
    }
    public void setContenidoComentario(String contenidoComentario) {
        this.contenidoComentario = contenidoComentario;
    }
    public Date getFechaComentario() {
        return fechaComentario;
    }
    public void setFechaComentario(Date fechaComentario) {
        this.fechaComentario = fechaComentario;
    }

}
