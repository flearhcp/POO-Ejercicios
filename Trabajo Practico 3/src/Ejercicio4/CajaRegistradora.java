package Ejercicio4;
import java.util.ArrayList;

public class CajaRegistradora {
    private ArrayList<Venta> ventas;

    public CajaRegistradora(){
        this.ventas = new ArrayList<Venta>();
    }

    public void agregarVenta(Venta venta){
        this.ventas.add(venta);
    }
    public double totalVentas(){
        double suma = 0;
        for(int i = 0;i < this.ventas.size();i++){
            suma += this.ventas.get(i).getVenta();
        }
        return suma;
    }
    
}
