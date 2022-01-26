package cine.servicios;

import cine.entidades.Pelicula;
import java.util.ArrayList;
import java.util.List;

public class ServicioPelicula {
    
    // Crea 5 peliculas diferentes y luego se elige una al azar
    public Pelicula crearPelicula(){
        List<Pelicula> peliculas = new ArrayList();
        
        Pelicula peli1 = new Pelicula("Spider-Man: No Way Home", 148, 13, "Jon Watts");
        Pelicula peli2 = new Pelicula("Titanic", 194, 13, "James Cameron");
        Pelicula peli3 = new Pelicula("Rápido y Furiosos 9", 145, 18, "Justin Lin");
        Pelicula peli4 = new Pelicula("Iron man 3", 130, 16, "Shane Black");
        Pelicula peli5 = new Pelicula("Lalaland", 128, 0, "Damien Chazelle");
        
        peliculas.add(peli1);
        peliculas.add(peli2);
        peliculas.add(peli3);
        peliculas.add(peli4);
        peliculas.add(peli5);
        
        return peliculas.get((int)(Math.random() * 5));
    }
}
