package TipoDePago;

public class Efectivo extends TipoDePago{
    public double pagar(double valor){
        double nValor = valor - (valor *10)/100;
        return nValor;
    }
}
