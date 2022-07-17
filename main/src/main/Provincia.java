
package main;


public class Provincia {
    
    public int id_provincia;
    public String provincia;

    public Provincia(int id_provincia, String provincia) {
        this.id_provincia = id_provincia;
        this.provincia = provincia;
    }

    public int getId_provincia() {
        return id_provincia;
    }

    public void setId_provincia(int id_provincia) {
        this.id_provincia = id_provincia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    
}
