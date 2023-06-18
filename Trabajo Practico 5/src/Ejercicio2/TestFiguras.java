package Ejercicio2;

public class TestFiguras {
    public static void main(String[] args) {
        Circulo c1 = new Circulo("Rojo", true, 3);
        Rectangulo r1 = new Rectangulo(4, 6, "Verde", false);
        //Cuadrado c2 = new Cuadrado(3, "Amarillo", false);
        /*System.out.println("Area del Circulo: "+c1.getArea()+"\nPerimetro del Circulo: "+c1.getPerimetro());
        System.out.println("Area del Rectangulo: "+r1.getArea()+"\nPerimetro del Rectangulo: "+c1.getPerimetro());
        */System.out.println("Cuadrado:\n"+c1);
        System.out.println("Rectangulo:\n"+r1);
    }
}
