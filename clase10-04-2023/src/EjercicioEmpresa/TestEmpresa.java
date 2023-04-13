package EjercicioEmpresa;

public class TestEmpresa {
    public static void main(String[] args) {
        Empleado sup1= new Empleado("Mamani alberto",20423213,"B° Santa ana",10,"+543876213290",1200000,100000);
        Secretario s1 = new Secretario("Jose Alberto Mamani",20399483,"B°las lomas ",6,"+543874329832",1200000,100000,"Despacho A","3432332");
        Vendedor v1= new Vendedor("Pablo Quispe", 20325580, "B° Inta Cerrillos", 3, "+543875329045", 1500000, 123000, "+543875329045", "AA 128 BCZ", "Volkswagen", "Gol Trend Full 2020");
        s1.setSupervisor(sup1);
        /*System.out.println(s1);
        System.out.println(s1.getSalario());
        s1.incrementarSalario();
        System.out.println(s1.getSalario());*/
        v1.setSupervisor(s1);
        System.out.println(v1);
        System.out.println(v1.getVehiculo());
        System.out.println(v1.getSalario());
        v1.incrementarSalario();
        System.out.println(v1.getSalario());
    }
}
