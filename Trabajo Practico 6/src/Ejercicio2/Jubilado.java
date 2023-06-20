package Ejercicio2;
//Falta terminar. Muy largo?
public class Jubilado implements InterfacePersona,IntefaceMortandad {
    private String nombre,apellido;
    private int edad;
    private double dineroAhorrado,jubilacionAnual;

    public Jubilado(String nombre,String apellido,int edad,double dineroAhorrado,double jubilacionAnual){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dineroAhorrado = dineroAhorrado;
        this.jubilacionAnual = jubilacionAnual;
    }
    public String getNombre(){
        return "Nombre:\n"+this.nombre + " "+this.apellido;
    }
    public double esperanzaDeVida(){
        double esperanza;

    }
}
