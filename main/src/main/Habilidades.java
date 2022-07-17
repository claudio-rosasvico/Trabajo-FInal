
package main;


public class Habilidades {
    
    public int id_habiliades;
    public int trabajo_grupal;
    public int creatividad;
    public int organización;
    public int nivel_ingles;
    public int idPersona;

    public Habilidades(int id_habiliades, int trabajo_grupal, int creatividad, int organización, int nivel_ingles, int idPersona) {
        this.id_habiliades = id_habiliades;
        this.trabajo_grupal = trabajo_grupal;
        this.creatividad = creatividad;
        this.organización = organización;
        this.nivel_ingles = nivel_ingles;
        this.idPersona = idPersona;
    }

    public int getId_habiliades() {
        return id_habiliades;
    }

    public void setId_habiliades(int id_habiliades) {
        this.id_habiliades = id_habiliades;
    }

    public int getTrabajo_grupal() {
        return trabajo_grupal;
    }

    public void setTrabajo_grupal(int trabajo_grupal) {
        this.trabajo_grupal = trabajo_grupal;
    }

    public int getCreatividad() {
        return creatividad;
    }

    public void setCreatividad(int creatividad) {
        this.creatividad = creatividad;
    }

    public int getOrganización() {
        return organización;
    }

    public void setOrganización(int organización) {
        this.organización = organización;
    }

    public int getNivel_ingles() {
        return nivel_ingles;
    }

    public void setNivel_ingles(int nivel_ingles) {
        this.nivel_ingles = nivel_ingles;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    
    
}
