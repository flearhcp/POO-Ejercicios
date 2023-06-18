package Ejercicio1;

public class TestEmpleado {
    public static void main(String[] args) {
        EmpleadoAdministrativo empleado1 = new EmpleadoAdministrativo("Jorge", "Porcel", 30, 230400, 1500);
        EmpleadoComercial empleado2 = new EmpleadoComercial("Agustin","Carajal", 30, 130000, 200);
        System.out.println(empleado1.imprimir());
        empleado1.plus(3500);
        System.out.println(empleado1.imprimir());
        System.out.println(empleado2.imprimir());
        empleado2.plus(4500);
        System.out.println(empleado2.imprimir());        
    }
}
