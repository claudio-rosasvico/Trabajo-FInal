
package main;

import java.time.Year;


public class Formacion {
    
    public int id_formacion;
    public String institucion_educativa;
    public String titulo;
    public Year año_inicio;
    public Year año_final;
    public boolean es_actual;
    public int idPersona;
    public int idNivelFormacion;

    public Formacion(int id_formacion, String institucion_educativa, String titulo, Year año_inicio, Year año_final, boolean es_actual, int idPersona, int idNivelFormacion) {
        this.id_formacion = id_formacion;
        this.institucion_educativa = institucion_educativa;
        this.titulo = titulo;
        this.año_inicio = año_inicio;
        this.año_final = año_final;
        this.es_actual = es_actual;
        this.idPersona = idPersona;
        this.idNivelFormacion = idNivelFormacion;
    }

    public int getId_formacion() {
        return id_formacion;
    }

    public void setId_formacion(int id_formacion) {
        this.id_formacion = id_formacion;
    }

    public String getInstitucion_educativa() {
        return institucion_educativa;
    }

    public void setInstitucion_educativa(String institucion_educativa) {
        this.institucion_educativa = institucion_educativa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Year getAño_inicio() {
        return año_inicio;
    }

    public void setAño_inicio(Year año_inicio) {
        this.año_inicio = año_inicio;
    }

    public Year getAño_final() {
        return año_final;
    }

    public void setAño_final(Year año_final) {
        this.año_final = año_final;
    }

    public boolean isEs_actual() {
        return es_actual;
    }

    public void setEs_actual(boolean es_actual) {
        this.es_actual = es_actual;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdNivelFormacion() {
        return idNivelFormacion;
    }

    public void setIdNivelFormacion(int idNivelFormacion) {
        this.idNivelFormacion = idNivelFormacion;
    }
    
    
}
