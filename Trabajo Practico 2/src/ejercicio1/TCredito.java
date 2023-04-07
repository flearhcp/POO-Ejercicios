package ejercicio1;

public class TCredito {
    private String numero;
    private String nombre;
    private String banco;
    private double balance;
    private double limite;

    public TCredito(String vnumero, String vnombre, String vbanco, double vbalance,double vlimite) {
        this.numero = vnumero;
        this.nombre = vnombre;
        this.banco = vbanco;
        this.balance = vbalance;
        this.limite = vlimite;
    }

    public String getNumero() {return this.numero;}
    public String getNombre(){return this.nombre;}
    public String getBanco(){return this.banco;}
    public double getBalance(){return this.balance;}
    public double getLimite(){return this.limite;}

    public boolean puedoComprar(double vprecio){
        if(this.balance + vprecio > this.limite){
            return false;
        }else{
            this.balance += vprecio;
            return true;
        }
    }
    public void pagarTarjeta(double vmonto){
        this.balance -= vmonto;
    }
    public void muestraDatos(){//modificado para el ejercicio c)
        System.out.println("Numero:"+getNumero());
        System.out.println("Nombre:"+getNombre());
        //Modificacion para el ejercicio c)
        System.out.println("Banco:"+getBanco());
        System.out.println("Balance:"+getBalance());
        System.out.println("Limite:"+getLimite());
    }
}
