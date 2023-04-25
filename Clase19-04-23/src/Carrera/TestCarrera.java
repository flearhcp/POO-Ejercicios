package Carrera;
import Conductor.Conductor;
import Auto.Auto;
import Auto.Motor;
import Auto.Tanque;
public class TestCarrera {
    public static void main(String[] args) {
        Carrera c = new Carrera(50);
        Auto a1 = new Auto(new Motor(1, 5),new Tanque(10, 10));
    }
}
