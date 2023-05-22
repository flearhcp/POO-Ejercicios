package Ejercicio4;

public class TestComercio {
    public static void main(String[] args) {
        Comercio c1 = new Comercio();
        c1.nuevoMovimiento(1, new Venta(20000));
        c1.nuevoMovimiento(1,new Venta(3000));
        c1.nuevoMovimiento(2, new Venta(20000));
        c1.nuevoMovimiento(3 , new Venta(500));
        System.out.println("Total recaudacion de las cajas: "+ c1.totalVentas());
        c1.totalCadaCaja();
        System.out.println("Caja con menos ventas: "+c1.menorVentas());
        

    }
}
