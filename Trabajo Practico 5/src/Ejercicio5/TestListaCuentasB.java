package Ejercicio5;

public class TestListaCuentasB {
    public static void main(String[] args) {
        ListaCuentaBancaria lista = new ListaCuentaBancaria();
        lista.meter(new CuentaBancaria(1, "Mauro Gabriel Vargas", 23000, 10, 1));
        lista.meter(new CuentaBancaria(2, "Helga Celina Gradin",22500, 10, 3));
        lista.meter(new CuentaBancaria(3,"Jose Alejandro Vargas", 230000,30,20));
        lista.mostrar();
        System.out.println(lista.estaOrdenada());
        lista.ordenar();
        lista.mostrar();
        System.out.println(lista.estaOrdenada());
    }
}
