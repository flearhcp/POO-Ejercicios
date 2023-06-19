package Ejercicio5;

public class CuentaBancaria {
    private int numero;
    private String titular;
    private double saldo;
    private int maxExtr,cantExtr;

    public CuentaBancaria(int numero,String titular,double saldo,int maxExtr,int cantExtr){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.maxExtr = maxExtr;
        this.cantExtr = cantExtr;
    }
    public double getSaldo(){return this.saldo;}
    public void depositar(double monto){this.saldo += monto;}
    public boolean extraer(double monto){
        if(monto > saldo)
            return false;
        else{if (this.cantExtr != this.maxExtr){
                this.saldo -= monto;
                cantExtr +=1;
                return true;
            }else{
                System.out.println("Llego al limite maximo de extracciones.");
                return false;
            }
        }
    }
    public void mostrarDatos(){
        System.out.println("Numero de cuenta: "+this.numero);
        System.out.println("     Titular: "+this.titular);
        System.out.println("Saldo: "+getSaldo());
    }
}
