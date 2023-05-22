package Ejercicio5.Prestamo;

import java.util.ArrayList;

import Ejercicio5.Libro.Libro;

public class TablaPrestamo {
    private ArrayList<Prestamo> prestamos;
    private int cantidad;
     
    public TablaPrestamo(){
        this.prestamos = new ArrayList<Prestamo>();
        this.cantidad = 0;
    }

    public void nuevoPrestamo(Prestamo p){
        this.prestamos.add(p);
        this.cantidad++;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public Prestamo getPrestamo(int pos){
        return this.prestamos.get(pos);
    }
    public boolean estaPrestado(Libro libro){
        boolean b = false;
        int i = 0;
        while(!b || i<this.cantidad ){
            if(this.prestamos.get(i).getLibro().equals(libro.getCodigo())){
                b =true;
            }else{
                i++;
            }

        }
        return b;
    }
    public boolean hayPrestamos(){
        if(this.cantidad > 0){
            return true;
        }else{
            return false;
        }
    }
}
