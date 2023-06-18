package Ejercicio2;

public class Circulo extends Figura {
    protected double radio;

    public Circulo(){
        super();
        this.radio = 0;
    }
    public Circulo(double radio){
        super();
        this.radio = radio;
    }
    public Circulo(String color,boolean relleno,double radio){
        super(color,relleno);
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getArea(){
        return (Math.PI * Math.pow(getRadio(), 2));
    }   
    public double getPerimetro(){
        return ((Math.PI*2)*getRadio());
    }
    public String toString(){
        return super.toString() + "\nRadio: "+ getRadio()+"\nArea: "+getArea()+"\nPerimetro: "+getPerimetro();
    }
}
