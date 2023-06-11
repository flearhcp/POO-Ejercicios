package FormaDePago;

public class PagoFacil implements FormaDePago{
    public double pagar (double monto){
        return monto + ((monto * 10)/100);
    }
}
