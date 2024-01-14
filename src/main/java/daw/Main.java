/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;
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
        Equipo e1 = new Equipo("FC Barcelona","Xavi","Spotify Camp Nou","4-3-1",jugadoresBarca,70,3);
        Equipo e2 = new Equipo("Real Madrid CF","Ancelotti","Santiago Bernabeu","4-3-1",jugadoresMadrid,60,2);
        Equipo e3 = new Equipo("Manchester City CF","Pep Guardiola","Etihad Stadium","4-3-1",jugadoresCity,90,1);
        //añado jugador a la lista de jugadores 
        jugadoresBarca.add("Pedri");
        jugadoresMadrid.add("Bellingham");
        jugadoresCity.add("De Bruyne");
        //añado el objeto equipo al objeto catalogo
        c1.guardarElemento(e1);
        c1.guardarElemento(e2);
        c1.guardarElemento(e3);
        
        //muestro
        System.out.println(c1);
        System.out.println("----------------");
        //metodo 1
        System.out.println("Número de elementos: "+c1.numeroElementos());
        //metodo 2
        System.out.println("¿La lista está vacía? "+c1.estaVacio());
        System.out.println("");
        // metodo 3
//        verElemento(0);
        // metodo 4
        Catalogo nuevo = new Catalogo();
        nuevo.getEquipo().add(e3);
//        cambiarElemento(0,nuevo);
        //metodo 5 
        c1.guardarElemento(e1);
        //metodo 6 
        c1.eliminarElemento(e2);
        //metodo 7
        c1.eliminarPosicion(0);
        System.out.println(e1);
        //metodo 8
            //creo la lista y meto los equipos
            ArrayList<Equipo> equipo = new ArrayList<>();
            equipo.add(e1);
            equipo.add(e2);
        c1.eliminarElementos(equipo);
        System.out.println(c1);
        //eliminarTodos(), borra todos los objetos.
//        c1.eliminarTodo();
//        System.out.println(c1);
        //imprimirCatalogo (). Imprime los objetos contenidos en el catálogo
        System.out.println("-------");
        
        c1.imprimirCatalogos(c1);
        //buscarElemento(Objeto c), 
        //busca el objeto c en la lista  y devuelve la posición en la que se
        //encuentra. Usa el método indexOf. No usar búsqueda binaria.
        System.out.println("------");
        c1.guardarElemento(e2);
        c1.guardarElemento(e1);
        System.out.println(c1.buscarElemento(e2));
        //Incluye un par de métodos de ordenación usando el 
        //método Collections.sort de dos atributos de tu clase.
        System.out.println("--------------");
        c1.ordenacionPuntos();
        System.out.println(c1);
        System.out.println("--------------");
        c1.ordenacionNomEquipo();
        System.out.println(c1);
        System.out.println("---------------");
        System.out.println(c1.busquedaBinaria(c1));
    }
}
