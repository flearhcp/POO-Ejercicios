package Ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class SimulacionSurtidor {
    public static void main(String[] args) {
        Surtidor s1 = new Surtidor();
        int n =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas veces desea repetir el algoritmo: " );
        n = sc.nextInt();
        Random a = new Random();//random para el switch
        for(int i=0; i < n; i++){
            int opc = 0;
            System.out.println("Cantidad de cada nafta en surtidor: ");
            System.out.println("Ultra Diesel: "+ s1.getCantUDiesel());
            System.out.println("Euro Diesel: "+ s1.getCantEDiesel());
            System.out.println("Super: "+ s1.getCantNSuper());
            System.out.println("Infinia: "+ s1.getCantInfinia());
            opc = (a.nextInt(1, 24));
            int cant = 0;
            Scanner sc1 = new Scanner(System.in);
            switch(opc){
                case 1,2,3,4,5: System.out.println("litros a cargar de Ultra Diesel: ");cant = sc1.nextInt();s1.cargarUDiesel(cant);break;
                case 6,7,8,9,10: System.out.println("Listos a cargar de  Euro Diesel: ");cant = sc1.nextInt();s1.cargarEDiesel(cant);break;
                case 11,12,13,14,15: System.out.println("Litros a cargar de Super: ");cant = sc1.nextInt();s1.cargarNSuper(cant);break;
                case 16,17,18,19,20: System.out.println("Litros a cargar de Infinia: ");cant = sc1.nextInt();s1.cargarNInfinia(cant);break;
                case 21: s1.llenarDepositoUDiesel();break;
                case 22: s1.llenarDepositoEDiesel();break;
                case 23: s1.llenarDepositoNSuper();break;
                case 24: s1.llenarDepositoNInfinia();break;
            }
        }
        System.out.println("Cantidad de cada nafta en surtidor: ");
        System.out.println("Ultra Diesel: "+ s1.getCantUDiesel());
        System.out.println("Euro Diesel: "+ s1.getCantEDiesel());
        System.out.println("Super: "+ s1.getCantNSuper());
        System.out.println("Infinia: "+ s1.getCantInfinia());
    }
}
