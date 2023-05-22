package Colectivo;

public abstract class Colectivo{
    private int ID;
    private int capacidad;
    private double costo;
    private static int sgteID = 1;

    public Colectivo(int capacidad, double costo){
        this.ID = sgteID++;
        this.capacidad = capacidad;
        this.costo = costo;
    }
    public abstract double getAccel();
    public final int getID(){return this.ID;}
    public int getCapacidad(){return this.capacidad;}
    public double getCosto(){return this.costo;}
    
}