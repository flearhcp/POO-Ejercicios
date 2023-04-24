package Equipo;

public class TestEquipo {
    public static void main(String[] args) {
        Equipo team1 = new Equipo();
        Jugador j1 = new Jugador(42211210,"Mauro Gabriel Vargas");
        Jugador j2 = new Jugador(20421320,"Burgos pedro");
        Jugador j3 = new Jugador(30432304,"Pablo Quispe");

        team1.agregarJugador(j1);
        team1.agregarJugador(j2);
        team1.agregarJugador(j3);
        System.out.println(team1.toString());
        team1.eliminarJugador(j2);
        System.out.println(team1.toString());
        j1.setFechaNac(17, 01, 2000);
        System.out.println(j1);
        
    }
}
