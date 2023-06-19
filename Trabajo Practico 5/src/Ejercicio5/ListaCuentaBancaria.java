package Ejercicio5;

public class ListaCuentaBancaria extends ListaAbs {
    public ListaCuentaBancaria(){
        super();
    }
    public boolean mayor(Object elemento,Object otroelemento){
        if(((CuentaBancaria)elemento).getSaldo() > ((CuentaBancaria)otroelemento).getSaldo()){
            return true;
        }else{
            return false;
        }
    }
    public boolean menor(Object elemento,Object otroelemento){
        if(((CuentaBancaria)elemento).getSaldo() < ((CuentaBancaria)elemento).getSaldo()){
            return true;
        }else{return false;}
    }
    public boolean iguales(Object elemento,Object otroelemento){
        if(((CuentaBancaria)elemento).getSaldo() == ((CuentaBancaria)elemento).getSaldo()){
            return true;
        }else{return false;}
    }
    public void imprimir(Object elemento){
        ((CuentaBancaria)elemento).mostrarDatos();
    }
}
