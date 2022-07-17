
package main;


public class Domicilio {
    
    public int id_domicilio;
    public String calle;
    public int numeracion;
    public String tipo_domicilio;
    public int idPersona;
    public int idLocalidad;

    public Domicilio(int id_domicilio, String calle, int numeracion, String tipo_domicilio, int idPersona, int idLocalidad) {
        this.id_domicilio = id_domicilio;
        this.calle = calle;
        this.numeracion = numeracion;
        this.tipo_domicilio = tipo_domicilio;
        this.idPersona = idPersona;
        this.idLocalidad = idLocalidad;
    }

    public int getId_domicilio() {
        return id_domicilio;
    }

    public void setId_domicilio(int id_domicilio) {
        this.id_domicilio = id_domicilio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(int numeracion) {
        this.numeracion = numeracion;
    }

    public String getTipo_domicilio() {
        return tipo_domicilio;
    }

    public void setTipo_domicilio(String tipo_domicilio) {
        this.tipo_domicilio = tipo_domicilio;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }
    
    
}
