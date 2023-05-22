package Ejercicio5.Libro;

import Ejercicio5.Autor.Autor;
import Ejercicio5.Fecha;

public class Fisico extends Libro {
    private int paginas;
    private int peso;

    public Fisico(String codigo,String titulo, Autor autor,Fecha fchPublicacion, Fecha fchIngreso,int paginas, int peso){
        super(codigo, titulo, autor, fchPublicacion, fchIngreso);
        this.paginas = paginas;
        this.peso = peso;
    }

    public int getPaginas() {return paginas;}
    public int getPeso() {return peso;}

    public String toString(){
        String cadena = super.toString() + "\nTotal de paginas: "+getPaginas()+"\nPeso: "+getPeso();
        return cadena;
    }
}
