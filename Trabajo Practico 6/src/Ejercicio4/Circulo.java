package Ejercicio4;

public class Circulo implements ObjetoGeometrico {
    protected double radio;

    public Circulo(double radio){
        this.radio = radio;
    }
    public double getArea(){
        return Math.PI * Math.pow(radio, 2);
    }
    public double getPerimetro(){
        return (2 * Math.PI * this.radio);
    }
}
