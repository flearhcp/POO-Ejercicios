package Ejercicio2;

public abstract class Figura {
    protected String color;
    protected boolean relleno;

    public Figura(){
        this.color = "";
        this.relleno = false;
    }
    public Figura(String color,boolean relleno){
        this.color = color;
        this.relleno = relleno;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean estaRelleno() {
        return relleno;
    }
    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }
    public abstract double getArea();
    public abstract double getPerimetro();
    public String toString(){
        return "Color: "+this.color+"\nRelleno: "+this.relleno;
    }
}
