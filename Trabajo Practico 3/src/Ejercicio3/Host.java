package Ejercicio3;

public class Host {
    private Direccion dire;
    private Red red;

    public Host(Direccion dire){
        this.dire = dire;
    }
    public int getDireccion(){
        return this.dire.getX();
    }
    public void conectar(Red red){
        if(this.dire.getX() == red.getDireccion()){
            this.red = red;
        }else{
            System.out.println("No se puede conectar.");
        }
    }

    public String toString(){
        String cad = dire.toString();
        return cad;
    }

}
