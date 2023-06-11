package FormaDePago;

public class MercadoPago implements FormaDePago {
    public double pagar(double monto){
        return monto - ((monto * 7)/100);
    }
}
