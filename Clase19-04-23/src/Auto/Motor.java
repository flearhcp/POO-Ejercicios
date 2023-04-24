package Auto;

public class Motor {
    private double consumoXmin;
    private double distanciaXLitro;
    private boolean encendido;

    public Motor(double consumoXmin, double distanciaXLitro){
        this.consumoXmin = consumoXmin;
        this.distanciaXLitro = distanciaXLitro;
        this.encendido = false;
    }
    public double getConsumoXmin() {
        return this.consumoXmin;
    }
    public double getDistanciaXLitro() {
        return this.distanciaXLitro;
    }
    public boolean getEncendido() {
        return this.encendido;
    }
    public double consumir(double capNafta){
        return capNafta = capNafta - (this.consumoXmin * this.distanciaXLitro);
    }
    public double retornarDistancia(double capNafta){
        return (capNafta - this.consumoXmin) * this.distanciaXLitro;
    }
    public void cambiarEstado(boolean estado){
        this.encendido = estado;
    }
}
