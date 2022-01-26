/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.servicios;

import cine.entidades.Espectador;
import cine.entidades.Sala;
import java.util.ArrayList;
import java.util.List;

public class ServicioSala {
    
    private ServicioPelicula servicioPelicula = new ServicioPelicula();
    private ServicioEspectador servicioEspectador = new ServicioEspectador();
    
    public Sala crearSala(){
        int precioEntrada = (int)(Math.random() * (150-800+1) + 800);
        return new Sala(servicioPelicula.crearPelicula(), precioEntrada);
    }
    
    public void ingresarEspectadores(Sala sala){
        List<Espectador> listaGente = servicioEspectador.crearEspectadores(); // Crea el 100% de espectadores, con atributos al azar
        List<Espectador> listaCumplen = new ArrayList();
        int fila, columna;
        
        // Chequea si cumplen con los requisitos para ver la película
        for (Espectador e : listaGente) {
            if(e.getEdad() >= sala.getPelicula().getEdadMinima() && e.getDineroDisponible() >= sala.getPrecioEntrada()){
                listaCumplen.add(e);
            }
        }
        sala.setEspectadores(listaCumplen);
        sala.setCantEspectadores(listaCumplen.size());
        
        // Pone X en distintos lugares, dependiendo de la cantidad de espectadores
        // 20 espectadores = 20 X aleatoriamente
        for(int i = 0; i < sala.getCantEspectadores(); i ++){
            do{
                fila = (int)(Math.random() * 8);
                columna = (int)(Math.random() * 6);
            }while(sala.getSala()[fila][columna] == 1);
            
                sala.getSala()[fila][columna] = 1;
        }
    }
    
    public void mostrarEspectadores(Sala sala){
        System.out.println("-----Información de los espectadores-----");
        for (Espectador e : sala.getEspectadores()) {
            System.out.println(e.toString());        
        }
    }
    
    public void mostrarSala(Sala sala){
        String [] letrasAsientos = {"A", "B", "C", "D", "E", "F"};
        int fila = 8;
        
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 6; j++){
                if(sala.getSala()[i][j] == 0){
                    System.out.print(fila + letrasAsientos[j] + "   | ");
                }else{
                    System.out.print(fila + letrasAsientos[j] + " X | ");
                }
            }
            fila--;
            System.out.println("");
        }
    }
}
