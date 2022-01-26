package cine.entidades;

public class Pelicula {
    private String nombre;
    private int duracion;
    private int edadMinima;
    private String director;

    
    public Pelicula(){
        
    }
    
    public Pelicula(String nombre, int duracion, int edadMinima, String director){
        this.nombre = nombre;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", duracion=" + duracion + ", edadMinima=" + edadMinima + ", director=" + director + '}';
    }
    
}
