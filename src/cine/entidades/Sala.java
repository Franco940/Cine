package cine.entidades;

import java.util.List;

public class Sala {
    private int [][] sala = new int[8][6];
    private Pelicula pelicula;
    private int cantEspectadores;
    private int precioEntrada;
    private List<Espectador> espectadores;

    public Sala(){
        
    }
    
    public Sala(Pelicula pelicula, int precioEntrada){
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
    }
    
    public int[][] getSala() {
        return sala;
    }

    public void setSala(int[][] sala) {
        this.sala = sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int getCantEspectadores() {
        return cantEspectadores;
    }

    public void setCantEspectadores(int cantEspectadores) {
        this.cantEspectadores = cantEspectadores;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public List<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(List<Espectador> espectadores) {
        this.espectadores = espectadores;
    }
}
