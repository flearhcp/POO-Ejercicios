package Ejercicio3;

public abstract class Dispositivos {
    private Direccion dire;

    public Dispositivos(Direccion dire){
        this.dire = dire;
    }
    public int getDireccion(){
        return this.dire.getX();
    }
    
    public String toString(){
        String cad = dire.toString();
        return cad;
    }
}
