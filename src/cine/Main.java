package cine;

import cine.entidades.Sala;
import cine.servicios.ServicioSala;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("¡Bienvenido a FrancoCinema!");
        ServicioSala servicioSala = new ServicioSala();
        Sala sala = servicioSala.crearSala();
        
        System.out.println("Nombre de la película: " + sala.getPelicula().getNombre());
        System.out.println("Edad mínima: " + sala.getPelicula().getEdadMinima());
        System.out.println("Duración: " + sala.getPelicula().getDuracion() + " minutos");
        System.out.println("Precio de la entrada: " + sala.getPrecioEntrada());
        
        System.out.println("\nLos espectadores estan ingresando a la sala....");
        servicioSala.ingresarEspectadores(sala);
        System.out.println("Cantidad espectadores: " + sala.getCantEspectadores());
        System.out.println("\nLa disposición de los espectadores en la sala es");
        servicioSala.mostrarSala(sala);
        
        System.out.println("\n\n");
        servicioSala.mostrarEspectadores(sala);    
    }
    
}
