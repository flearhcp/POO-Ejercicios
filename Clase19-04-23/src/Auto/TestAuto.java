package Auto;

public class TestAuto {
    public static void main(String[] args) {
        Auto auto = new Auto(new Motor(0.3, 1),new Tanque(5, 0));
        auto.mover();
        auto.cargarNafta(6);
        auto.mover();
        System.out.println("Distancia recorrida: "+ auto.getDistanciaRecorrida()+".");
    }
}
