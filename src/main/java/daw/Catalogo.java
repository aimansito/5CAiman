/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author aiman
 */
public class Catalogo {
    //Atributo encapsulado
    private ArrayList<Equipo> listaEquipos ;
    
    //constructor parametrizado con lista sin elementos 
    public Catalogo() {
        listaEquipos = new ArrayList<>();
    }
    public int numeroElementos(){
         return listaEquipos.size();
    }
    public boolean estaVacio(){
//        boolean vacio = false;
//        if(c1.getEquipo().size()>0){
//            vacio = true;
//        }
//        return vacio;
        return listaEquipos.isEmpty();
    }
    public Equipo verElemento(int num){
//         System.out.println("Elemento de la posicion "+num+" es: "+ listaEquipos.get(num));
         //hacer una condicion y controlarlo con excepciones
         return listaEquipos.get(num); 
    }
    public void cambiarElemento(int num,Equipo nuevo){
        //hacer una condicion  
        listaEquipos.set(num, nuevo);
        System.out.println("Objeto 1: "+listaEquipos.get(num));
    }
    public void guardarElemento(Equipo e1){
        listaEquipos.add(e1);
        System.out.println("Guardar elemento: "+e1);
    }
    public void eliminarPosicion(int num){
        listaEquipos.remove(num);
        System.out.println("Eliminar elemento: "+listaEquipos.get(num));
    }
    public void eliminarElemento(Equipo e1){
        listaEquipos.remove(e1);
        System.out.println("Eliminar elemento: "+e1);
    }
    public void eliminarElementos(ArrayList<Equipo> equipo){
        listaEquipos.removeAll(equipo);
        System.out.println("Eliminar elemento de la lista: "+equipo);
    }   
    public void eliminarTodo(){
        listaEquipos.clear();
    }
    public void imprimirCatalogos(Catalogo c1){
        listaEquipos.forEach(System.out::println);
    }
    public int buscarElemento(Equipo e1){
        return listaEquipos.indexOf(e1) ;
    }
    public void ordenacionPuntos(){
//        Collections.sort(listaEquipos,(k1,k2)->k1.getPuntos()-k2.getPuntos());
        Comparator<Equipo> criterio =(k1,k2)->k1.getPuntos()-k2.getPuntos();
        Collections.sort(listaEquipos,criterio.reversed());
    }
    public void ordenacionNomEquipo(){
        Collections.sort(listaEquipos,(e1,e2)->e1.getNomEquipo().compareToIgnoreCase(e2.getNomEquipo()));
    }
    public int  busquedaBinaria(ArrayList<Equipo> listEquipos){
        int posicion = Collections.binarySearch(listaEquipos, 
                listaEquipos.get(0),(e1,e2)->e1.getNomEquipo().compareToIgnoreCase(e2.getNomEquipo()));
        return posicion;
    }
    public ArrayList<Equipo> getEquipo() {
        return listaEquipos;
    }

    public void setEquipo(ArrayList<Equipo> equipo) {
        this.listaEquipos = equipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.listaEquipos);
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
        return Objects.equals(this.listaEquipos, other.listaEquipos);
    }

    @Override
    public String toString() {
        return "Catalogo{" + "equipo=" + listaEquipos + '}';
    }
    
}
