package Ejercicio5.Libro;

import Ejercicio5.Fecha;
import Ejercicio5.Autor.Autor;;

public abstract class Libro {
    private String codigo;
    private String titulo;
    private Autor autor;
    private Fecha fchPublicacion;
    private Fecha fchIngreso;

    public Libro(String codigo, String titulo, Autor autor, Fecha fchPublicacion, Fecha fchIngreso){
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.fchPublicacion = fchPublicacion;
        this.fchPublicacion = fchIngreso;
    }

    public String getCodigo() {return codigo;}
    public String getTitulo() {return titulo;}
    public Autor getAutor() {return autor;}
    public Fecha getFchPublicacion() {return fchPublicacion;}
    public Fecha getFchIngreso() {return fchIngreso;}
    
    public String toString(){
        String cadena = "Codigo: "+getCodigo()+"\nTitulo: "+getTitulo()+"\nAutor: "+getAutor()+"\nFecha de Publicacion: "+getFchPublicacion()+"\nFecha de Ingreso: "+getFchIngreso();
        return cadena;
    }
}
