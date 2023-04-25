package Auto;
import Conductor.Conductor;
public class Auto {
    private Conductor conductor;
    private Motor motor;
    private Tanque tanque;
    private double distanciaRecorrida;

    public Auto(Motor motor, Tanque tanque){
        this.motor = motor;
        this.tanque = tanque;
        this.distanciaRecorrida = 0;
    }

    public void setConductor(Conductor conductor){
        this.conductor = conductor;
    }

    public void mover(){
        if(this.tanque.getVacio() != true && this.tanque.getCapActual() > this.motor.getConsumoXmin()){
            this.motor.cambiarEstado(true);
            System.out.println("Moviendose...");
            this.distanciaRecorrida += this.motor.retornarDistancia(this.tanque.getCapActual());
            this.tanque.gastaNafta(this.motor.consumir(this.tanque.getCapActual()));  
            if(this.tanque.getCapActual() < this.motor.getConsumoXmin()){
                System.out.println("Poca nafta, debe llenar el tanque. Recargando tanque.");
                cargarNafta(100);//100 = valor maximo del tanque.
            }
            /*this.motor.cambiarEstado(true);
            this.distanciaRecorrida = this.motor.retornarDistancia(this.tanque.getCapActual());
            this.tanque.gastaNafta(this.motor.consumir(this.tanque.getCapActual()));*/
            /*this.motor.cambiarEstado(false);
            System.out.println("Poca nafta, debe llenar el tanque. Apagando motores...");*/
        }else{
            System.out.println("Debe cargar nafta antes de moverse.");
        }
    }
    public void cargarNafta(double cantidad){
        this.tanque.cargarNafta(cantidad);
    }
    public double getDistanciaRecorrida(){return this.distanciaRecorrida;}
    
    public String toString(){
        String cadena ="";
        cadena = "Conductor: "+ this.conductor.toString();
        return cadena;
    }
}