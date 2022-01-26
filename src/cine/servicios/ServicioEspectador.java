package cine.servicios;

import cine.entidades.Espectador;
import java.util.ArrayList;
import java.util.List;

public class ServicioEspectador {
    
    public List<Espectador> crearEspectadores(){
        Espectador espectador;
        List<Espectador> listaAux = new ArrayList();
        String []nombres = {"Franco", "Victoria", "John", "Pepe", "Facundo", 
            "Daniel", "Lorena", "Lulu", "Juan", "Tobias", "Silvina", "Mosho"};
        
        int []edades = {5, 7, 13, 15, 17, 18, 20, 21, 25, 27, 30, 40, 35, 42,
            45, 50, 55, 60};
        
        int []dineros = {50, 100, 150, 200, 250, 300, 500, 600, 700, 800, 900, 1000, 1200, 1400};
        
        // Se crean los objetos espectadores, con los datos de los vectores anteriores
        // Con un número al azar para cada vector, se llenan los atributos
        for(int i = 0; i < 48; i++){
            espectador = new Espectador(nombres[(int)(Math.random() * nombres.length)],
                    edades[(int)(Math.random() * edades.length)], dineros[(int)(Math.random() * dineros.length)]);
            listaAux.add(espectador);
        }
        
        return listaAux;
    }
}
