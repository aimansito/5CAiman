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
        //objeto catalogo
        Catalogo c1 = new Catalogo();
        //objetos equipo 
        Equipo e1 = new Equipo("FC Barcelona","Xavi","Spotify Camp Nou","4-3-3",jugadoresBarca,70,3);
        Equipo e2 = new Equipo("Real Madrid CF","Ancelotti","Santiago Bernabeu","4-3-3",jugadoresMadrid,70,2);
        jugadoresMadrid.add("Bellingham");
        //añado jugador a la lista de jugadores 
        jugadoresBarca.add("Pedri");
        //añado el objeto equipo al objeto catalogo
        c1.getEquipo().add(e1);
        c1.getEquipo().add(e2);
        //muestro
        System.out.println(c1);
        System.out.println("----------------");
        //metodo 1
        System.out.println("Número de elementos: "+numeroElementos(c1));
        //metodo 2
        System.out.println("¿La lista está vacía: "+estaVacio(c1));
        // metodo 3
        verElemento(1, c1);
        
        
    }
    //Atributo encapsulado
    private ArrayList<Equipo> equipo ;
    
    //constructor parametrizado con lista sin elementos 
    public Catalogo() {
        equipo = new ArrayList<>();
    }
    public static int numeroElementos(Catalogo c1){
        return c1.getEquipo().size();
    }
    public static boolean estaVacio(Catalogo c1){
        boolean vacio = false;
        if(c1.getEquipo().size()>1){
            vacio = true;
        }
        return vacio;
    }
    public static void verElemento(int num, Catalogo c1){
         System.out.println("Elemento de la posicion "+num+" es: "+ c1.getEquipo().get(num));
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
