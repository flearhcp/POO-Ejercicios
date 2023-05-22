package Ejercicio5.Autor;

import Ejercicio5.Fecha;

public class Autor {
    private String nombre;
    private String nacionalidad;
    private Fecha fchNac;
    private Fecha fchFall;

    public Autor(String nombre, String nacionalidad, Fecha fchNac){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fchNac= fchNac;
    }
    public Autor(String nombre, String nacionalidad, Fecha fchNac,Fecha fchFall){
        this(nombre,nacionalidad,fchNac);
        this.fchFall = fchFall;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    public Fecha getFchNac() {
        return fchNac;
    }
    public Fecha getFchFall() {
        return fchFall;
    }
    public void setFchFall(Fecha fchFall){
        this.fchFall = fchFall;
    }
    public String getNombre(){
        return this.nombre;
    }

    public String toString(){
        String Cadena = "Nombre: "+ getNombre() + "\nNacionalidad: "+ getNacionalidad()+"\nFecha Nacimiento: "+getFchNac();
        if(getFchFall()!=null){
            Cadena += "\nFecha Fallecimiento: "+getFchFall();
        }
        return Cadena;
    }
}   
