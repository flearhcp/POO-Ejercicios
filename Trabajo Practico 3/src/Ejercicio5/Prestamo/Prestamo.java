package Ejercicio5.Prestamo;

import Ejercicio5.Fecha;
import Ejercicio5.Libro.Libro;

public class Prestamo {
    private Libro libro;
    //private Sucursal destino;
    private Fecha fchDevolucion;

    public Prestamo(Libro libro, Fecha fchDevolucion){//falta hacer la clase sucursal.
        this.libro = libro;
        this.fchDevolucion = fchDevolucion;
    }
    
    public String getLibro(){return this.libro.getCodigo();}
    public Fecha getFchDevolucion() {return fchDevolucion;}
    
    public String toString(){//le falta agregar la sucursal
        String cadena = "Libro: "+ this.libro +"\nFecha de devolucion: "+getFchDevolucion();
        return cadena;
    }
}
