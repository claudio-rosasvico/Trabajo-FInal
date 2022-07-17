
package main;


public class Proyectos {
    
    public int id_proyecto;
    public String titulo_proyecto;
    public String descripción;
    public int idPersona;

    public Proyectos(int id_proyecto, String titulo_proyecto, String descripción, int idPersona) {
        this.id_proyecto = id_proyecto;
        this.titulo_proyecto = titulo_proyecto;
        this.descripción = descripción;
        this.idPersona = idPersona;
    }

    public int getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getTitulo_proyecto() {
        return titulo_proyecto;
    }

    public void setTitulo_proyecto(String titulo_proyecto) {
        this.titulo_proyecto = titulo_proyecto;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    
    
}
