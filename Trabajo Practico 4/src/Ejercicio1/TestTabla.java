package Ejercicio1;

public class TestTabla {
    public static void main(String[] args) {
        TablaEscaladeSueldos tabla = new TablaEscaladeSueldos();
        double[][] tablaSueldo = {{28.16,54.98,91.18,134.10},{32.18,59.67,97.89,160.91},{38.89,64.37,101.91,187.73},{44.92,70.40,108.21,214.55},{48.27,75.09,115.32,268.16}};
        tabla.agregarSueldos(tablaSueldo);
        System.out.println(tabla.toString());
        //Segundo punto
        /*System.out.println("Promedio grado 0: "+tabla.promPagaHabilidad(0));
        System.out.println("Promedio grado 1: "+tabla.promPagaHabilidad(1));
        System.out.println("Promedio grado 2: "+tabla.promPagaHabilidad(2));
        System.out.println("Promedio grado 3: "+ tabla.promPagaHabilidad(3));*/
        //Tercer punto
        System.out.println("Diferencia de mayor y menor paga horaria de grado 0: "+tabla.diferenciaMayorMenor(0));
        System.out.println("Diferencia de mayor y menor paga horaria de grado 1: "+tabla.diferenciaMayorMenor(1));
        System.out.println("Diferencia de mayor y menor paga horaria de grado 2: "+tabla.diferenciaMayorMenor(2));
        System.out.println("Diferencia de mayor y menor paga horaria de grado 3: "+tabla.diferenciaMayorMenor(3));
        //Ultimo punto
        tabla.aumentarPrecio(0, 20);
        System.out.println(tabla);
    }
}
