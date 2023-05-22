package Ejercicio3;

import java.util.ArrayList;

public class Router extends Dispositivos {
    private int n;//cantidad de puertos
    private ArrayList<Dispositivos> listaDis;
     

    public Router(Direccion dire,int n){
        super(dire);
        this.n = n;
        this.listaDis = new ArrayList<Dispositivos>();
    }
    public void conectar(Dispositivos dis){
        if(this.listaDis.size() < this.n){
            this.listaDis.add(dis);
        }else{
            System.out.println("Todos los puertos estan ocupados.");
        }
    }
    
    public String toString(){
        String cad = "Direccion: " + super.toString() +"\nLista de dispositivos conectados a este router: ";
        for(int i =0; i < this.listaDis.size();i++){
            if(this.listaDis.get(i) instanceof Red){
                cad += "\nRed: (" + this.listaDis.get(i).getDireccion() + ",0)";
            }else{
                cad += "\nRouter: (" + this.listaDis.get(i).getDireccion() + ",0)";
            }
        }
        return cad;
    }
}
