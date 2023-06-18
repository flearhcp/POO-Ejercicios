package Ejercicio3;

public class TestListaJugadores {
    public static void main(String[] args) {
        ListaJugadores lista = new ListaJugadores();
        JugadorPrimera p1 = new JugadorPrimera("Lionel Andres", "Messi", 34,"1",new Fecha(10,6,2023), new Fecha(10, 6, 2025));
        lista.agregarJugador(p1);
        JugadorReserva r1 = new JugadorReserva("Jorge","Velazco",24,"2",new Fecha(23,5,2020));
        lista.agregarJugador(r1);
        JugadorPrimera p2 = new JugadorPrimera("Angel","Di Maria",34,"3",new Fecha(30, 3,2022),new Fecha());
        lista.agregarJugador(p2);
        JugadorReserva r2 = new JugadorReserva("Facundo","Velazco",25,"4",new Fecha(24,3, 2020));
        lista.agregarJugador(r2);
        System.out.println("Importe total nomina de Jugadores: "+lista.importeTotalNominaJugadores(new Fecha()));
        lista.imprimirListado();      

    }
}
