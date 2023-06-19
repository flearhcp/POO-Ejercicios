package Ejercicio5;

public class TestEnteros {
    public static void main(String[] args) {
        ListaEnteros lista = new ListaEnteros();
        lista.meter(1);lista.meter(2);lista.meter(3);lista.meter(4);lista.meter(5);lista.meter(6);
        lista.mostrar();
        lista.setElemento(4, 1);
        lista.mostrar();
        System.out.println(lista.estaOrdenada());
        lista.ordenar();
        lista.mostrar();
        System.out.println(lista.estaOrdenada());
    }
}
