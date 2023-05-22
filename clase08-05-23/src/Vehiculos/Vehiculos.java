package Vehiculos;

public abstract class Vehiculos {
    private int ID;
    protected double peso;
    protected double maxVel;
    protected String nombre;
    private static int proxID = 1;

    public Vehiculos(double peso, double maxVel, String nombre){
        this.ID = proxID ++;
        this.peso = peso;
        this.maxVel = maxVel;
        this.nombre = nombre;
    }
    public abstract double getIndiceSeguridad();
    public double getMaxEnergia(){
        return 0.5 * this.peso * Math.pow(this.maxVel,2);
    }
    public final int getID(){
        return this.ID;
    }

}
