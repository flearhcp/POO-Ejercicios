package CarritoDeCompra;
import Libro.Libro;
import TipoDePago.*;
import java.util.ArrayList;
public class CarritoDeCompra {

    private ArrayList<Libro> carrito;

    public CarritoDeCompra(){
        this.carrito = new ArrayList<Libro>();
    }
    public void agregarLibro(Libro libro){
        this.carrito.add(libro);
    }
    public void eliminarLibro(Libro libro){
        this.carrito.remove(libro);
    }
    public double calcularTotal(){
        double precioTotal = 0.0;
        for(int i=0; i<carrito.size(); i++){
            precioTotal += this.carrito.get(i).getPrecio();
        }
        return precioTotal;
    }
    public void pagar(TipoDePago tipoDePago){
        if(tipoDePago instanceof Efectivo){
            System.out.println("Monto total pagando con Efectivo: "+ tipoDePago.pagar(calcularTotal())); 
        }else if(tipoDePago instanceof MercadoPago){
            System.out.println("Monto total pagando con Mercado Pago: "+ tipoDePago.pagar(calcularTotal()));
        }else if(tipoDePago instanceof TarjetaDeCredito){
            System.out.println("Monto total pagando con Tarjeta de credito: "+ tipoDePago.pagar(calcularTotal()));
        }
    }

}
