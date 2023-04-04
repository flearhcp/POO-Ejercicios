public class Dueno {
    private int plata;
    private int pos;

    Dueno(){
        this.plata=0;
        this.pos=0;
    }
    public void setPlata(int plata){
        this.plata=plata;
    }
    public int getPlata(){
        return this.plata;
    }
    public void setPos(int pos){
        this.pos=pos;
    }
    public int getPos(){
        return this.pos;
    }
    public void ganoDueno(int plataPerdedor){
        //this.plata = this.plata + plataPerdedor;
        setPlata(this.plata + plataPerdedor);
    }
    
}
