package Equipo;
import Fecha.*;
public class Jugador {
    private int dni;
    private String nombre;
    private Fecha fechNac;

    public Jugador(int dni, String nombre, Fecha fechNac){
        this.dni = dni;
        this.nombre = nombre;
        this.fechNac = fechNac;
    }
    public Jugador(int dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
        this.fechNac = new Fecha(01,01,0000);
    }
    //getters Y setters
    public int getDni(){return this.dni;}
    public void setDni(int dni){this.dni = dni;}
    public String getNombre(){return this.nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setFechaNac(int dia, int mes, int anio){this.fechNac.setFecha(dia, mes, anio);}
    public Fecha getFechNac(){return this.fechNac;}
    
    public String toString(){
        String cadena = "";
        if(this.fechNac.toString() != "01/01/0001"){
            cadena = "Nombre: " + getNombre() + "\nDni: "+ getDni() + "\nFecha de Nacimiento: " + getFechNac();
        }else{
            cadena = "Nombre: " + getNombre() + "\nDni: "+ getDni();
        }
        return cadena;
    }
}
