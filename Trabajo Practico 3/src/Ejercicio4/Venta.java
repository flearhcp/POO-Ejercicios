package Ejercicio4;

public class Venta {
    private double venta;
    private int ID;
    private static int proxID = 1;

    public Venta(double venta){
        this.ID = proxID++;
        this.venta = venta;
    }
    public final int getID(){
        return this.ID;
    }
    public double getVenta(){
        return this.venta;
    }
    
}
