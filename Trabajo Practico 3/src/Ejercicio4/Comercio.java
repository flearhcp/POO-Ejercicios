package Ejercicio4;

import java.util.ArrayList;

public class Comercio {
    private ArrayList<CajaRegistradora> cajas;

    public Comercio(){
        this.cajas = new ArrayList<CajaRegistradora>();
        for(int i = 0;i<3;i++){
            this.cajas.add(new CajaRegistradora());
        }
    }
    public void nuevoMovimiento(int id, Venta venta){//el ID tiene que ser != 0
        switch(id){
            case 1: this.cajas.get(0).agregarVenta(venta); break;
            case 2: this.cajas.get(1).agregarVenta(venta); break;
            case 3: this.cajas.get(2).agregarVenta(venta); break;
        }
    }
    public double totalVentas(){
        double suma = 0;
        for(int i =0;i< this.cajas.size();i++){
            suma += this.cajas.get(i).totalVentas();
        }
        return suma;
    }
    public int menorVentas(){
        int id = 0;
        for(int i =0;i<this.cajas.size()-1 ;i++){
            int j = i++;
            while(j < this.cajas.size()){
                if(this.cajas.get(i).totalVentas() < this.cajas.get(j).totalVentas()){
                    id = i;
                    j++;
                }else if(this.cajas.get(j).totalVentas() < this.cajas.get(i).totalVentas()){
                    id = j;
                    j++;
                }else{
                    j++;
                }
            }
        }
        return id + 1;
    }
    public void totalCadaCaja(){
        for(int i =0; i < this.cajas.size();i++){
            System.out.println("Total caja "+ i  +":"+ this.cajas.get(i).totalVentas());
        }
    }

}
