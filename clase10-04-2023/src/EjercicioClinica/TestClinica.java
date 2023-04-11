package EjercicioClinica;

public class TestClinica {
    public static void main(String[] args) {
        Internado i1 = new Internado("Helga Gradin", 42079198, "Barrio Inta mza 5 casa 19", "+543874123921");
        Ambulatorio p1 = new Ambulatorio("Mauro vargas",42211210, "B° El Huaico mza 460c Casa 19","+543876854549");
        p1.setObservaciones("Se aplico vacuna del covid-19");
        System.out.println(p1);
        i1.setFechaAlta(19, 1, 2023, 19, 45);
        System.out.println(i1);
    }
}
