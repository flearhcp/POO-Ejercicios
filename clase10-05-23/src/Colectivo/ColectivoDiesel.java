package Colectivo;

public class ColectivoDiesel extends Colectivo implements IDiesel{
    private double distancia;
    private double nivelContaminacion;

    public ColectivoDiesel(int capacidad, double costo, double distancia, double nivelContaminacion) {
        super(capacidad, costo);
        this.distancia = distancia;
        this.nivelContaminacion = nivelContaminacion;
    }
    public double getDistancia(){
        return this.distancia;
    }
    public double getNivelContaminacion(){
        return this.nivelContaminacion;
    }
    public double getAccel(){
        return 3.0;
    }
    
    
}
