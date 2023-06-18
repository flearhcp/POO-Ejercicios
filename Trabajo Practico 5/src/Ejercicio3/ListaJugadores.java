package Ejercicio3;
import java.util.ArrayList;

public class ListaJugadores {
    private ArrayList<Jugador> listado;

    public ListaJugadores(){
        this.listado = new ArrayList<Jugador>();
    }

    public void agregarJugador(Jugador jugador){
        this.listado.add(jugador);
    }
    public void imprimirListado(){
        for(int i=0;i<this.listado.size();i++){
            if(this.listado.get(i) instanceof JugadorPrimera){
                System.out.println(this.listado.get(i).toString() + " Fecha de Fin de contrato: " +((JugadorPrimera)this.listado.get(i)).getFchFin());
            }else{
                System.out.println(this.listado.get(i).toString());
            }
        }
    }
    public double importeTotalNominaJugadores(Fecha hasta){
        double total=0;
        for(int i=0;i<this.listado.size();i++){
            total += this.listado.get(i).importeNomina(hasta);
        }
        return total;
    }
}
