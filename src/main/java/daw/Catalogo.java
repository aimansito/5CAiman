/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author aiman
 */
public class Catalogo {
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
    //Atributo encapsulado
    private static  ArrayList<Equipo> equipo ;
    
    //constructor parametrizado con lista sin elementos 
    public Catalogo() {
        equipo = new ArrayList<>();
    }
    public static int numeroElementos(){
        return equipo.size();
    }
    public static boolean estaVacio(){
//        boolean vacio = false;
//        if(c1.getEquipo().size()>0){
//            vacio = true;
//        }
//        return vacio;
        return equipo.isEmpty();
    }
    public static void verElemento(int num){
         System.out.println("Elemento de la posicion "+num+" es: "+ equipo.get(num));
    }
    public static void cambiarElemento(int num,Catalogo nuevo){
        equipo.set(num, nuevo.getEquipo().get(num));
        nuevo.getEquipo().set(num, equipo.get(num));
        System.out.println("Objeto 1: "+equipo.get(num)+ "\n" + "Objeto 2: "+nuevo.getEquipo().get(num));
    }
    public ArrayList<Equipo> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Equipo> equipo) {
        this.equipo = equipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.equipo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Catalogo other = (Catalogo) obj;
        return Objects.equals(this.equipo, other.equipo);
    }

    @Override
    public String toString() {
        return "Catalogo{" + "equipo=" + equipo + '}';
    }
    
}
