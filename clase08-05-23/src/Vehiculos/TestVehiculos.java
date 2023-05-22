package Vehiculos;

public class TestVehiculos {
    public static void main(String[] args) {
        Jeep j1 = new Jeep(2000,30,"jeep",0.2);
        System.out.println("Indice de Seguridad: "+ j1.getIndiceSeguridad());
        System.out.println("Maxima Energia: "+ j1.getMaxEnergia());
        System.out.println("ID del vehiculo: "+ j1.getID());
    }
}
