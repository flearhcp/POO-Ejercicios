package Equipo;
import Tecnico.Tecnico;

import java.util.ArrayList;

public class Equipo {
    private ArrayList<Jugador> equipo;
    private Tecnico tecnico;
    private String nombre;
    

    public Equipo(){
        this.equipo = new ArrayList<Jugador>();
        this.tecnico = new Tecnico();
    }
    public Equipo(String nombre){
        this();
        this.nombre = nombre;
    }

    public String getNombre(){return this.nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    public void agregarJugador(Jugador jugador){
        if(this.equipo.size()<24){
            this.equipo.add(jugador);
        }else{
            System.out.println("No se pueden agregar mas jugadores.");
        }
    }
    public void eliminarJugador(Jugador jugador){
        this.equipo.remove(jugador);
    }
    public void agregarCompetencia(String competencia){
        this.tecnico.cargarCompetencias(competencia);
    }
    public String toString(){
        String cadena = "Jugadores: ";
        cadena = this.equipo.toString();
        return cadena;
    }
}
