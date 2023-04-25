package TipoDePago;

public class TarjetaDeCredito extends TipoDePago {
    public double pagar(double valor){
        return valor + 100;
    }
}
