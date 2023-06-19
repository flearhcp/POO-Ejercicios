package Ejercicio5;

public class ListaEnteros extends ListaAbs {
    
    public ListaEnteros(){
        super();
    }

    public boolean mayor(Object elemento,Object otroelemento){
        if((Integer)elemento > (Integer)otroelemento){
            return true;
        }else{
            return false;
        }
    }
    public boolean menor(Object elemento,Object otroelemento){
        if((Integer)elemento < (Integer)otroelemento){
            return true;
        }else{
            return false;
        }
    }
    public boolean iguales(Object elemento,Object otroelemento){
        if((Integer)elemento == (Integer)otroelemento){
            return true;
        }else{
            return false;
        }
    }
    public void imprimir(Object elemento){
        System.out.println((Integer)elemento);
    }
}
