
package main;


public class Localidad {
   
    public int id_localidad;
    public String localidad;
    public int idProvincia;

    public Localidad(int id_localidad, String localidad, int idProvincia) {
        this.id_localidad = id_localidad;
        this.localidad = localidad;
        this.idProvincia = idProvincia;
    }

    public int getId_localidad() {
        return id_localidad;
    }

    public void setId_localidad(int id_localidad) {
        this.id_localidad = id_localidad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }
    
    
}
