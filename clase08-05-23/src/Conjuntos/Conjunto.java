package Conjuntos;
import java.util.ArrayList;

public abstract class Conjunto {
    private ArrayList<Object> conjunto;
    private int cantidad;

    public Conjunto(){
        this.conjunto = new ArrayList<Object>();
        this.cantidad = this.conjunto.size();
    }
    
    //Metodos abstractos
    
    public abstract boolean esIgual(Object a, Object b);
    public abstract Conjunto clone();
    public abstract Conjunto instanciar();
    
    //Metodos concretos

    public void agregar(Object e){
        if(buscar(e) == -1){
            this.conjunto.add(e);
        }else{
            System.out.println("No se pueden agregar elementos repetidos.");
        }
    }
    private int buscar(Object e){
        int pos =0,i = 0;
        while(i < this.cantidad || pos != i){
            if(this.conjunto.get(i).equals(e)){
                pos = i;
            }else{
                i++;
            }
        }
        if(pos == i){
            return pos;
        }else{
            return -1;
        }
    }
    public int cardinalidad(){
        return this.cantidad;
    }
    public void eliminar(Object e){
        if(buscar(e) != -1){
            this.conjunto.remove(e);
        }else{
            System.out.println("El objeto no se encuentra ");
        }
    }
    public boolean pertenece(Object e){
        if(buscar(e)!= -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean vacio(){
        if(this.cantidad == 0){
            return true;
        }else{
            return false;
        }
    }
    public Conjunto union(Conjunto c){
        Conjunto aux = instanciar();
        if(c.vacio() == false){
            for(int i=0; i < this.cantidad;i++){
                aux.agregar(this.conjunto.get(i));
            }
            for(int j=0; j < c.cardinalidad() ;j++){
                aux.agregar(c.conjunto.get(j));
            }
            return aux;
        }else{
            return aux = this;
        }
    }
    public Conjunto interseccion(Conjunto c){
        Conjunto aux = instanciar();
        if(c.vacio() == false){
            int i = 0;
            while(i < this.cantidad || i < c.cardinalidad()){
                if(esIgual(this.conjunto.get(i), c.conjunto.get(i))){
                    aux.agregar(this.conjunto.get(i));
                    i++;
                }else{
                    i++;
                }
            }
            return aux;
        }else{
            return aux;
        }
    }
    public Conjunto diferencia(Conjunto c){
        Conjunto aux = instanciar();
        if(c.vacio() == false){
            int i = 0;
            Object a;
            while(i < this.cantidad || i < c.cardinalidad()){
                a = this.conjunto.get(i);
                if(this.pertenece(a)== true && c.pertenece(a) == false){
                    aux.agregar(a);
                    i++;
                }else{
                    i++;
                }
            }
            return aux;
        }else{
            return aux;
        }
    }

    public String toString(){
        String cadena = this.conjunto.toString();
        return cadena;
    }
}
