package Tecnico;

public class TestTecnico {
    public static void main(String[] args) {
        Tecnico tec = new Tecnico();
        tec.cargarCompetencias("Champions");
        tec.cargarCompetencias("Libertadores");
        tec.cargarCompetencias("Federal A");
        tec.cargarCompetencias("LPF");
        tec.cargarCompetencias("Torneo de Barrios");
        System.out.println(tec.toString());
        tec.eliminarCompetencia();
        tec.eliminarCompetencia("Libertadores");
        System.out.println(tec.toString());
    }
}
