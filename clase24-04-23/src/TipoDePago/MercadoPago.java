package TipoDePago;

public class MercadoPago extends TipoDePago {
    public double pagar(double valor){
        return valor + (valor *15)/100;    
    }
}
