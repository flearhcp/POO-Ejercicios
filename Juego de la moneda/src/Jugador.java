public class Jugador {
    private int plata;
    private int pos;

    Jugador(int plata){
        this.plata = plata;
        this.pos = 0;
    }
    public void setPlata(int plata){
        this.plata = plata;
    }
    public int getPlata(){
        return this.plata;
    }
    public void setPos(int pos){
        this.pos = pos;
    }
    public int getPos(){
        return this.pos;
    }
    public int apostar(int cuanto){
        if(this.plata > 0){
            this.plata = this.plata - cuanto;
            return cuanto;
        }else{
            System.out.println("No hay fondos para apostar.");
            return 0;
        }
    }
    public void gano(int aposto){
        this.plata = this.plata + aposto * 2;
    }

}
