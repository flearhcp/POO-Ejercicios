package Ejercicio1;

public class testNumeros {
    public static void main(String[] args) {
        NumerosReales lista = new NumerosReales(5);
        lista.agregarNumero(1);lista.agregarNumero(0);lista.agregarNumero(4);lista.agregarNumero(4);lista.agregarNumero(5);
        lista.agregarNumero(6);
        System.out.println(lista.toString());
        System.out.println("¿Esta en la lista el numero?:" + lista.existe(6));
        System.out.println("Resultado de sumar los elementos de la Lista: "+ lista.sumarLista());
        System.out.println("El menor elemento de la lista: "+ lista.menorElemento());
        System.out.println("El mayor elemento de la lista: "+lista.mayorElemento());
        System.out.println("El elemento mas frecuente:"+ lista.elementoFrecuente());
        System.out.println("Promedio de la lista: "+lista.promElementos());
        NumerosReales lista2 = new NumerosReales(5);
        lista2.agregarNumero(6);lista2.agregarNumero(7);lista2.agregarNumero(8);lista2.agregarNumero(9);lista2.agregarNumero(10);
        System.out.println(lista2.toString());
        System.out.println("Resultado de sumar dos listas: "+ lista.sumar(lista2));
        System.out.println("Resultado de multiplicar dos listas: "+ lista.multiplicar(lista2));
        System.out.println("Resultado de multiplicar todos los elementos por un numero: "+ lista.multiplicar(2));
        System.out.println("Resultado de sumar dos elementos dada una posicion determinada: "+ lista.sumar(0, 4));

    }
}
