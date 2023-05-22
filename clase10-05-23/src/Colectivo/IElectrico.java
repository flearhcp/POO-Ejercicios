package Colectivo;

public interface IElectrico {
    public static double ALTO_VOLTAJE = 600,BAJO_VOLTAJE = 480;
    public abstract double getVoltaje();
}
