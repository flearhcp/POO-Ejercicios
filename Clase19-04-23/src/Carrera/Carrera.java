package Carrera;
import Auto.Auto;
import java.util.ArrayList;
public class Carrera {
    private ArrayList<Auto> autos;
    private double distancia;

    public Carrera(double distancia){
        this.autos = new ArrayList<Auto>();
        this.distancia = distancia;
    }

    public void AgregarAutos(Auto auto){
        this.autos.add(auto);
    }

    public void simular(){
        boolean terminoCarrera = false;
        while(!terminoCarrera){
            for(int i = 0; i < this.autos.size(); i++){
                autos.get(i).mover();
                if(autos.get(i).getDistanciaRecorrida() >= this.distancia){
                    terminoCarrera = true;
                    System.out.println("El corredor del auto"+ this.autos.get(i)+"ha terminado la carrera!");
                }
            }
        }

    }
}
