
package main;

import java.time.Year;


public class Experiencia_laboral {
    
    public int id_laboral;
    public String cargo;
    public String institución_laboral;
    public String descripción;
    public String localidad;
    public String país;
    public Year año_inicio;
    public Year año_final;
    public boolean es_actual;
    public int idPersona;

    public Experiencia_laboral(int id_laboral, String cargo, String institución_laboral, String descripción, String localidad, String país, Year año_inicio, Year año_final, boolean es_actual, int idPersona) {
        this.id_laboral = id_laboral;
        this.cargo = cargo;
        this.institución_laboral = institución_laboral;
        this.descripción = descripción;
        this.localidad = localidad;
        this.país = país;
        this.año_inicio = año_inicio;
        this.año_final = año_final;
        this.es_actual = es_actual;
        this.idPersona = idPersona;
    }

    public int getId_laboral() {
        return id_laboral;
    }

    public void setId_laboral(int id_laboral) {
        this.id_laboral = id_laboral;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getInstitución_laboral() {
        return institución_laboral;
    }

    public void setInstitución_laboral(String institución_laboral) {
        this.institución_laboral = institución_laboral;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
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
    
    
    
}
