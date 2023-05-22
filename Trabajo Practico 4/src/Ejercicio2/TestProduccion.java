package Ejercicio2;

public class TestProduccion {
    public static void main(String[] args) {
        Produccion p1 = new Produccion();
        double[][] tablaProduccion = {{1,2,3,4,5,6,7,8,9,10,11,12},{13,14,15,16,17,18,19,20,21,22,23,24},{25,26,27,28,29,30,32,33,34,35,36,37},{37,38,39,40,41,42,43,44,45,46,47,48,59}};
        p1.agregarProd(tablaProduccion);
        System.out.println(p1);
        //Primer punto
        System.out.println("Promedio anual de arroz: "+p1.promedioAnual("arroz"));
        System.out.println("Promedio anual de avena: "+p1.promedioAnual("avena"));
        System.out.println("Promedio anual de cebada: "+p1.promedioAnual("cebada"));
        System.out.println("Promedio anual de trigo: "+p1.promedioAnual("trigo"));
        //Segundo y tercer punto
        System.out.println("Cosechas superiores al promedio anual: "+ p1.cosechasSuperiorAnual());
        System.out.println("Cosechas inferiores al promedio anual: "+ p1.cosechasInferiorAnual());
        //Cuarto punto
        p1.mayorToneladaxMes();
    
    }
}
