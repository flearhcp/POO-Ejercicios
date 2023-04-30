package Ejercicio1;
import java.util.ArrayList;
public class NumerosReales {
    protected ArrayList<Double> numeros;
    protected int n;

    public NumerosReales(int tam){
        this.numeros = new ArrayList<Double>();
        this.n= tam;
    }
    public void agregarNumero(double numero){
        if(this.numeros.size() <= this.n ){
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
        for(int i=0; i < this.numeros.size(); i++){
            //double elem = this.numeros.get(i);
            int contNum = 0;
            int j = i++;
            while(j <= this.numeros.size()){
                if(this.numeros.get(i) == this.numeros.get(j)){
                    contNum++; 
                }
                j++;
            }
            if(contNum > contGlobal){
                elem = this.numeros.get(i);
                contGlobal = contNum;
            }
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
    public 
}
