
package main;


public class Nivel_formacion {
    
    public int idNivel_formacion;
    public String nombre;

    public Nivel_formacion(int idNivel_formacion, String nombre) {
        this.idNivel_formacion = idNivel_formacion;
        this.nombre = nombre;
    }

    public int getIdNivel_formacion() {
        return idNivel_formacion;
    }

    public void setIdNivel_formacion(int idNivel_formacion) {
        this.idNivel_formacion = idNivel_formacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
