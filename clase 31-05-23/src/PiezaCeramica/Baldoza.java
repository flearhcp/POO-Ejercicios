package PiezaCeramica;

public class Baldoza extends PiezaCeramica {
    private int peso;

    public Baldoza(int codigo,double precioBase, int peso){
        super(codigo, precioBase);
        this.peso = peso;
    }

    public double precioFinal(){
        return precioBase() + (peso * 0.034);
    }
}
