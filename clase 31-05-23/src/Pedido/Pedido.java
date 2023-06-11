package Pedido;
import PiezaCeramica.*;
import FormaDePago.*;
import java.util.ArrayList;

public class Pedido {
    private ArrayList<PiezaCeramica> piezas;
    private FormaDePago formaDePago;

    public Pedido(){
        this.piezas = new ArrayList<PiezaCeramica>();
    }

    public void agregarPieza(PiezaCeramica pieza){
        this.piezas.add(pieza);
    }
    public void setFormaDePago(FormaDePago formaDePago){
        this.formaDePago = formaDePago;
    }
    public double calcularTotal(){
        double total = 0;
        for(int i=0;i<this.piezas.size();i++){
            total = this.piezas.get(i).precioFinal();
        }
        return total;
    }
    public void pagar(){
        double total = 0;
        System.out.println("Total a pagar: "+ calcularTotal());
        total = this.formaDePago.pagar(calcularTotal());
        System.out.println("Total pagado con "+this.formaDePago+": "+total);
    }
}
