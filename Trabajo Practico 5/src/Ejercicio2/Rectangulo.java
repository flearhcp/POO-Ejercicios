package Ejercicio2;

public class Rectangulo extends Figura{
    protected double base;
    protected double altura;

    public Rectangulo(){
        super();
    }
    public Rectangulo(double base,double altura){
        super();
        this.base = base;
        this.altura = altura;
    }
    public Rectangulo(double base,double altura,String color,boolean relleno){
        super(color,relleno);
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    } 
    public double getPerimetro(){
        return ((getAltura()*2)+(getBase()*2));
    }
    public double getArea(){
        return (getAltura() * getBase());
    }
    public String toString(){
        return super.toString() + "\nBase: " +getBase()+"\nAltura: "+getAltura()+" "+"Area: "+getArea()+" "+"Perimetro: "+getPerimetro();
    }
}
