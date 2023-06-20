package Ejercicio4;

public class CirculoRedimensionable extends Circulo implements Redimensionable {
    
    public CirculoRedimensionable(double radio){
        super(radio);
    }
    public void redimensionar(int porcentaje){
        this.radio = this.radio + (this.radio * porcentaje/100);
    }
    public String toString(){
        return "Circulo de radio: "+this.radio;
    }
}
