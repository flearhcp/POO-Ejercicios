public class Mesa {
    private int sombreros[];
    private Dueno dueno;
    private Jugador jugador;

    public Mesa(){
        this.sombreros = new int[3];
        for(int i=0;i <= this.sombreros.length;i++){
            this.sombreros[i] = 0;
        }
    }
    public void setMoneda(int posicion){
        this.dueno.setPos(posicion);
        this.sombreros[this.dueno.getPos()] = 1;
    }
    public void jugar(int apuesta){
        if(this.sombreros[this.jugador.getPos()]==1){
            System.out.println("¡Jugador a ganado!");
            this.jugador.gano(apuesta);
        }else{
            System.out.println("Jugador a perdido :(");
            this.dueno.ganoDueno(apuesta);
        }
    }
}
