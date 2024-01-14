/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import static daw.Catalogo.cambiarElemento;
import static daw.Catalogo.estaVacio;
import static daw.Catalogo.numeroElementos;
import static daw.Catalogo.verElemento;
import java.util.ArrayList;

/**
 *
 * @author aiman
 */
public class Main {
    public static void main(String[] args) {
        //lista para los jugadores
        ArrayList<String> jugadoresBarca = new ArrayList<>();
        ArrayList<String> jugadoresMadrid = new ArrayList<>();
        ArrayList<String> jugadoresCity = new ArrayList<>();
        //objeto catalogo
        Catalogo c1 = new Catalogo();
        //objetos equipo 
        Equipo e1 = new Equipo("FC Barcelona","Xavi","Spotify Camp Nou","4-3-3",jugadoresBarca,70,3);
        Equipo e2 = new Equipo("Real Madrid CF","Ancelotti","Santiago Bernabeu","4-3-3",jugadoresMadrid,60,2);
        Equipo e3 = new Equipo("Manchester City CF","Pep Guardiola","Etihad Stadium","4-3-3",jugadoresCity,90,1);
        //añado jugador a la lista de jugadores 
        jugadoresBarca.add("Pedri");
        jugadoresMadrid.add("Bellingham");
        jugadoresCity.add("De Bruyne");
        //añado el objeto equipo al objeto catalogo
        c1.getEquipo().add(e1);
        c1.getEquipo().add(e2);
        //muestro
        System.out.println(c1);
        System.out.println("----------------");
        //metodo 1
        System.out.println("Número de elementos: "+numeroElementos());
        //metodo 2
        System.out.println("¿La lista está vacía? "+estaVacio());
        // metodo 3
        verElemento(0);
        // metodo 4
        Catalogo nuevo = new Catalogo();
        nuevo.getEquipo().add(e3);
        cambiarElemento(0,nuevo);   
    }
}
