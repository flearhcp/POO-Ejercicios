package Ejercicio1;

public class TestLinea {
    public static void main(String[] args) {
        Linea l1 = new Linea(3, 1, 4, 2);
        Linea l2 = new Linea(1, 2, 3, 1);
        System.out.println("Linea 1 es mas grande que linea 2? "+l1.esMasgrande(l2));
        System.out.println("Linea 1 es mas chica que linea 2? "+l1.esMasChico(l2));
        System.out.println("Linea 1 es igual a linea 2? "+l1.esIgual(l2));  
    }
}
