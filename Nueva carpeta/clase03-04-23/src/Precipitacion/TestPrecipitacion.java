package Precipitacion;
import java.util.Scanner;
public class TestPrecipitacion {
    public static void main(String[] args) {
        PrecipitacionAnual p1 = new PrecipitacionAnual();
        Scanner sc = new Scanner(System.in);
        Scanner indice = new Scanner(System.in);
        System.out.println("Ingrese precipitacion del mes actual: ");
        p1.cargarPrecipitacionActual(sc.nextDouble());
        System.out.println("Ingrese mes a cargar: ");
        indice.nextInt();
        System.out.println("Ingrese Precipitacion a cargar: ");
        p1.cargarPrecipitacionMes(indice.nextInt(), sc.nextDouble());
        System.out.println("Promedio actual: " + p1.calcularPromedioActual());
        System.out.println("Promedio anual:"+ p1.calcularPromedioAnual());
        System.out.println("Lista de desvios :"+p1.calcularListaDesvios());
    }
}
