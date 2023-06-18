package Ejercicio2;

public class Cuadrado extends Rectangulo {
    protected double lado;
    
    public Cuadrado(){
        super();
        this.lado = 0;
    }
    public Cuadrado(double lado){
        super(lado,lado);
    }
    public Cuadrado(double lado,String color,boolean relleno){
        super(lado,lado,color,relleno);
    }
    public double getLado(){
        return this.lado;
    }
    public void setLado(double lado){
        this.lado=lado;
    }
    public void setAltura(double altura){
        super.setAltura(altura);
    }
    public void setBase(double base){
        super.setBase(base);
    }
    public String tostString(){
        return super.toString() + "Lado: " +getLado(); 
    }

}
