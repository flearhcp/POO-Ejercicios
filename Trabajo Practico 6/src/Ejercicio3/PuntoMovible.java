package Ejercicio3;

public class PuntoMovible implements Movible {
    private int x,y,xVel,yVel;

    public PuntoMovible(int x,int y,int xVel,int yVel){
        this.x = x;
        this.y = y;
        this.xVel = xVel;
        this.yVel = yVel;
    }

    public int getX() {return x;}
    public void setX(int x) {this.x = x;}
    public int getY() {return y;}
    public void setY(int y) {this.y = y;}
    public int getxVel() {return xVel;}
    public void setxVel(int xVel) {this.xVel = xVel;}
    public int getyVel() {return yVel;}
    public void setyVel(int yVel) {this.yVel = yVel;}
    public String toString(){
        return "x: "+getX()+" y: "+getY()+" Vel X: "+getxVel()+" Vel Y: "+getyVel(); 
    }
    public void moverArriba(){
        setY(this.y + getyVel());
    }
    public void moverAbajo(){
        setY(this.y - getyVel());
    }
    public void moverDerecha(){
        setX(this.x + getxVel());
    }
    public void moverIzquierda(){
        setX(this.x - getxVel());}
}
