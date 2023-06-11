package Colectivo;

public class ColectivoElectrico extends Colectivo implements IElectrico {
    protected double voltaje;

    public ColectivoElectrico(int capacidad, double costo, double voltaje) {
        super(capacidad, costo);
        this.voltaje = voltaje;
    }
    public double getAccel(){return 5.0;}
    public double getVoltaje() {return voltaje;}
    
}
