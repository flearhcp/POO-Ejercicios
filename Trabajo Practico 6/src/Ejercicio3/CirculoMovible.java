package Ejercicio3;

public class CirculoMovible implements Movible {
    private int radio;
    private PuntoMovible centro;

    public CirculoMovible(int x,int y,int xVel,int yVel,int radio){
        this.centro.setX(x); this.centro.setY(y);
        this.centro.setxVel(xVel); this.centro.setyVel(yVel);
        this.radio = radio;
    }
    public void moverArriba(){
        double mover = (Math.pow(1 - this.centro.getX(), 2) + Math.pow(1 - this.centro.getY(), 2));
        if(mover <= radio && centro.getyVel() < radio){
            centro.moverArriba();
        }else{
            System.out.println("Se salio del Centro.");
        }
    }
    public void moverAbajo(){
        double mover = (Math.pow(1 - this.centro.getX(), 2) + Math.pow(1 - this.centro.getY(), 2));
        if(mover <= radio && centro.getyVel() < radio){
            centro.moverAbajo();
        }else{
            System.out.println("Se salio del Centro.");
        }
    }
    public void moverDerecha(){
        double mover = (Math.pow(1 - this.centro.getX(), 2) + Math.pow(1 - this.centro.getY(), 2));
        if(mover <= radio && centro.getyVel() < radio){
            centro.moverDerecha();
        }else{
            System.out.println("Se salio del Centro.");
        }
    }
    public void moverIzquierda(){
        double mover = (Math.pow(1 - this.centro.getX(), 2) + Math.pow(1 - this.centro.getY(), 2));
        if(mover <= radio && centro.getyVel() < radio){
            centro.moverIzquierda();
        }else{
            System.out.println("Se salio del Centro.");
        }}
}
