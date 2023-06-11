package PiezaCeramica;

public class Azulejo extends PiezaCeramica{
    private int medida;

    public Azulejo(int codigo, double precioBase, int medida){
        super(codigo,precioBase);
        this.medida = medida;
    }
    public double precioFinal(){
        return precioBase() + (medida * 3.05);
    }
}
