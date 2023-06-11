package PiezaCeramica;

public abstract class PiezaCeramica {
    private int codigo;
    private double precioBase;

    public PiezaCeramica(int codigo, double precioBase){
        this.codigo = codigo;
        this.precioBase = precioBase;
    }
    public double precioBase(){
        return this.precioBase;
    }
    public abstract double precioFinal();
    public int getCodigo(){return this.codigo;}
}
