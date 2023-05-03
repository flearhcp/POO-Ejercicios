package Ejercicio1;
import java.util.ArrayList;

public class NumerosReales {
    protected ArrayList<Double> numeros;
    protected int n;

    public NumerosReales(int tam){
        this.numeros = new ArrayList<Double>();
        this.n= tam;
    }
    public int getTam(){return this.n;}
    public double getValor(int i){return this.numeros.get(i);}
    public void setValor(int i, double valor){this.numeros.set(i,valor);}
    public void agregarNumero(double numero){
        if(this.numeros.size() <= this.n){
            this.numeros.add(numero);
        }else{
            System.out.println("No se pueden cargar mas numeros.");
        }
    }
    public boolean existe(double numero){
        if(this.numeros.indexOf(numero)!= -1){
            return true;
        }else{
            return false;
        }
    }
    public double sumarLista(){
        double sum = 0;
        for(int i=0;i < this.numeros.size();i++){
            sum += this.numeros.get(i);
        }
        return sum;
    }
    public double menorElemento(){
        double men = 0;
        for(int i=0; i < this.numeros.size(); i++){
            if(this.numeros.get(i)<= men){
                men = this.numeros.get(i);
            }
        }
        return men;
    }
    public double mayorElemento(){
        double may = 0;
        for(int i=0; i < this.numeros.size(); i++){
            if(this.numeros.get(i)>= may){
                may = this.numeros.get(i);
            }
        }
        return may;
    }
    public double elementoFrecuente(){
        int contGlobal = 0;
        double elem = 0;
        for(int i=0; i <= this.n/*this.numeros.size()*/; i++){
            //double elem = this.numeros.get(i);
            int contNum = 0;
            int j = i++;
            while(j < this.n /*this.numeros.size()-1*/){
                if(this.numeros.get(i) == this.numeros.get(j)){
                    if(contNum >= contGlobal){
                        elem = this.numeros.get(i);
                        contGlobal = contNum;
                    }else{
                        contNum++;
                    }
                 
                }
                j++;
            }
            /*if(contNum > contGlobal){
                elem = this.numeros.get(i);
                contGlobal = contNum;
            }*/
        }
        return elem;
    }
    public double promElementos(){
        double sum= 0;
        for(int i=0; i < this.numeros.size();i++){
            sum += this.numeros.get(i);
        }
        return sum / this.numeros.size();
    }
    public NumerosReales sumar(NumerosReales lista){
        if(lista.getTam()==this.numeros.size()){
            Double suma;
            for(int i=0;i<this.numeros.size();i++){
                suma = this.numeros.get(i) + lista.getValor(i);
                lista.setValor(i, suma);            }
        }
        return lista;
    }
    public NumerosReales multiplicar(NumerosReales lista){
        if(lista.getTam()==this.numeros.size()){
            for(int i=0; i < lista.getTam();i++){
                lista.setValor(i, this.numeros.get(i)*lista.getValor(i));
            }
        }
        return lista;
    }
    public ArrayList<Double> multiplicar(double num){
        ArrayList<Double> lista = new ArrayList<Double>();
        for(int i=0; i < this.numeros.size();i++){
            lista.add(i, this.numeros.get(i)*num);
        }
        return lista;
    }
    public double sumar(int pos1, int pos2){
        double suma =0;
        suma = this.numeros.get(pos1) + this.numeros.get(pos2);
        return suma;
    }
    //falta ordenar de menor a mayor
    public String toString(){
        String cadena = this.numeros.toString();
        return cadena;
    }
}
