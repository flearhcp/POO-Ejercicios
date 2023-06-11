package FormaDePago;

public class TarjetaDeCredito implements FormaDePago {
    public double pagar(double monto){
        return monto + 240;
    }
    public String toString(){
        return "Tarjeta de credito";
    }
}
