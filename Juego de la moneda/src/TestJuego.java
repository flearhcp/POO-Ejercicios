public class TestJuego {
    public static void main(String[] args) {
        Jugador j1 = new Jugador(1200);
        Mesa m1 = new Mesa();
        m1.setMoneda(2);
        j1.setPos(2);
        m1.jugar(j1.apostar(200));
    }
}
