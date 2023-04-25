package Libro;
import java.util.ArrayList;
import Autor.Autor;
import Formato.*;
import java.lang.Math;
public class Libro {
    private int isbn;
    private ArrayList<Autor> autores;
    private Formato formato;
    private double precioNominal;

    public Libro(int isbn, ArrayList<Autor> autores, Formato formato, double precioNominal) {
        this.isbn = isbn;
        this.autores = autores;
        this.formato = formato;
        this.precioNominal = precioNominal;
    }
    public int getIsbn() {
        return this.isbn;
    }
    public ArrayList<Autor> getAutores(){
        return this.autores;
    }
    public Formato getFormato() {
        return this.formato;
    }
    public double getPrecio(){
        double precio = 0;
        if(getFormato() instanceof Papel){
            if(this.formato.getTipo() == "tapa dura"){
                precio = Math.abs(this.precioNominal + (this.precioNominal *20)/100);
            }else if(this.formato.getTipo() == "tapa blanda"){
                precio = this.precioNominal;
            }
            /*switch(this.formato.getTipo()){
                case "tapa dura": precio = Math.abs(this.precioNominal + (this.precioNominal *100)/20);
                default: precio = this.precioNominal;
            }*/
        }else if(getFormato() instanceof Digital){
            if(this.formato.getTipo() == "mobi"){
                precio = Math.abs(this.precioNominal - (this.precioNominal *5)/100);
            }else{
                precio = Math.abs(this.precioNominal - (this.precioNominal * 15)/100);
            }
            /*switch(this.formato.getTipo()){
                case "mobi": precio = Math.abs(this.precioNominal - (this.precioNominal *100)/5);
                default : precio = Math.abs(this.precioNominal - (this.precioNominal * 100)/15);
            }*/
        }
        return precio;
    }
    public boolean equals(Libro otro){
        return this.isbn == otro.getIsbn();
    }

}
