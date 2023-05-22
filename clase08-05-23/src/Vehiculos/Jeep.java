package Vehiculos;

public class Jeep extends Vehiculos {
    private double maxGrado;

    public Jeep(double peso,double maxVel,String nombre,double maxGrado){
        super(peso,maxVel,nombre);
        this.maxGrado = maxGrado;
    }
    public double getIndiceSeguridad(){
        return Math.max((100-100*this.maxGrado-0.5*this.maxVel), 0);
    }
    public double getMaxEnergia(){
        return super.getMaxEnergia() + 9.8*peso*this.maxGrado*100;
    }
}
