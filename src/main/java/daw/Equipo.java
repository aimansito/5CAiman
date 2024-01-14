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
public class Equipo {
    private String nomEquipo ; 
    private String dt; 
    private String estadio;
    private String alineacion;
    private ArrayList<String> jugadores;
    private int puntos;
    private int puesto;

    public Equipo(String nomEquipo, String dt, String estadio, String alineacion, ArrayList<String> jugadores, int puntos, int puesto) {
        this.nomEquipo = nomEquipo;
        this.dt = dt;
        this.estadio = estadio;
        this.alineacion = alineacion;
        this.jugadores = jugadores;
        this.puntos = puntos;
        this.puesto = puesto;
    }

    public Equipo() {
    }
    
    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public String getNomEquipo() {
        return nomEquipo;
    }

    public void setNomEquipo(String nomEquipo) {
        this.nomEquipo = nomEquipo;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getAlineacion() {
        return alineacion;
    }

    public void setAlineacion(String alineacion) {
        this.alineacion = alineacion;
    }

    public ArrayList<String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nomEquipo);
        hash = 37 * hash + Objects.hashCode(this.dt);
        hash = 37 * hash + Objects.hashCode(this.estadio);
        hash = 37 * hash + Objects.hashCode(this.alineacion);
        hash = 37 * hash + Objects.hashCode(this.jugadores);
        hash = 37 * hash + this.puntos;
        hash = 37 * hash + this.puesto;
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
        final Equipo other = (Equipo) obj;
        if (this.puntos != other.puntos) {
            return false;
        }
        if (this.puesto != other.puesto) {
            return false;
        }
        if (!Objects.equals(this.nomEquipo, other.nomEquipo)) {
            return false;
        }
        if (!Objects.equals(this.dt, other.dt)) {
            return false;
        }
        if (!Objects.equals(this.estadio, other.estadio)) {
            return false;
        }
        if (!Objects.equals(this.alineacion, other.alineacion)) {
            return false;
        }
        return Objects.equals(this.jugadores, other.jugadores);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Equipo{");
        sb.append("nomEquipo=").append(nomEquipo);
        sb.append(", dt=").append(dt);
        sb.append(", estadio=").append(estadio);
        sb.append(", alineación=").append(alineacion);
        sb.append(", jugadores=").append(jugadores);
        sb.append(", puntos=").append(puntos);
        sb.append(", puesto=").append(puesto);
        sb.append('}');
        return sb.toString();
    }
}
