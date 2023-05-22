package Ejercicio5.Libro;
import Ejercicio5.Autor.Autor;
import Ejercicio5.Fecha;

public class Digital extends Libro {
    private String formato;
    private double peso;

    public Digital(String codigo, String titulo, Autor autor, Fecha fchPublicacion, Fecha fchIngreso,String formato, double peso){
        super(codigo, titulo, autor, fchPublicacion, fchIngreso);
        this.formato = formato;
        this.peso = peso;
    }

    public String getFormato() {return formato;}
    public double getPeso() {return peso;}
    
    public String toString(){
        String cadena = super.toString() + "\nFormato: "+ getFormato()+"\nPeso: "+getPeso();
        return cadena;
    }
}
