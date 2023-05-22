package Ejercicio3;

public class Direccion {
    protected int x;
    protected int y;

    public Direccion(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){return this.x;}
    public int getY(){return this.y;}
    
    public String toString(){
        String cad = "("+ this.x +","+this.y+")";
        return cad;
    }
}
