package Ejercicio1;

public class Linea implements Relacion {
    private double x1,x2;
    private double y1,y2;

    public Linea(double x1,double y1,double x2,double y2){
        this.x1 = x1; this.y1 = y1;
        this.x2 = x2; this.y2 = y2;
    }
    public double getLongitud(){
        return Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2)));
    }
    public boolean esMasgrande(Object otro){
        if(this.getLongitud() > ((Linea)otro).getLongitud()){
            return true;
        }else{
            return false;
        }
    }
    public boolean esMasChico(Object otro){
        if(this.getLongitud() < ((Linea)otro).getLongitud()){
            return true;
        }else{
            return false;
        }
    }
    public boolean esIgual(Object otro){
        if(this.getLongitud() == ((Linea)otro).getLongitud()){
            return true;
        }else{
            return false;
        }
    }
}
