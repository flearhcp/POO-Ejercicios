package Auto;

public class Tanque {
    private double capTotal;
    private double capActual;
    private boolean vacio;

    public Tanque(double capTotal, double capActual){
        this.capTotal = capTotal;
        this.capActual = capActual;
        if(this.capActual > 0){
            this.vacio = false;
        }else{
            this.vacio = true;
        }
    }
    public double getCapActual(){
        return this.capActual;
    }
    public double getCapTotal(){
        return this.capTotal;
    }
    public boolean getVacio(){
        return this.vacio;
    }
    public void gastaNafta(double valor){
        this.capActual = valor;
    }
    public void cargarNafta(double valor){
        if(valor + this.capActual < this.capTotal){
            this.capActual = valor + this.capActual;
            this.vacio = false;
        }else if(valor + this.capActual >= this.capTotal){
            this.capActual = this.capTotal;
            this.vacio = false;
            System.out.println("Tanque lleno.");
        }
    }
}
