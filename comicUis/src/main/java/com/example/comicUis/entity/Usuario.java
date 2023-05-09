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
@Table(name = "usuario")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Usuario implements Serializable {

    private static final long serialVersionUID=2L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private int idUsuario;

    private String nombres;
    private String apellidos;
    private String correo;
    private String password;
    private String rol;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.MERGE, mappedBy = "usuario")
    private List<Comentarios> comentarios;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.MERGE, mappedBy = "usuario")
    private List<ProgresoLectura> progresoLecturas;


    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idRol) {
        this.idUsuario = idRol;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

 

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public List<Comentarios> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentarios> comentarios) {
        this.comentarios = comentarios;
    }

    public List<ProgresoLectura> getProgresoLecturas() {
        return progresoLecturas;
    }

    public void setProgresoLecturas(List<ProgresoLectura> progresoLecturas) {
        this.progresoLecturas = progresoLecturas;
    } 

    

    
    
    
}
