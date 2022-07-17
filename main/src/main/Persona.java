package main;


import java.sql.Blob;
import java.util.Date;


public class Persona {
    public String id_persona;
    public String nombre;
    public String apellido;
    public Date fecha_nac;
    public String mail;
    public int telefono;
    public Blob foto_perfil; 
    public Blob foto_portada;
    public Usuario user;

    public Persona(String id_persona, String nombre, String apellido, Date fecha_nac, String mail, int telefono, Blob foto_perfil, Blob foto_portada, Usuario user) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.mail = mail;
        this.telefono = telefono;
        this.foto_perfil = foto_perfil;
        this.foto_portada = foto_portada;
        this.user = user;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    

    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Blob getFoto_perfil() {
        return foto_perfil;
    }

    public void setFoto_perfil(Blob foto_perfil) {
        this.foto_perfil = foto_perfil;
    }

    public Blob getFoto_portada() {
        return foto_portada;
    }

    public void setFoto_portada(Blob foto_portada) {
        this.foto_portada = foto_portada;
    }

    
    
    
}
