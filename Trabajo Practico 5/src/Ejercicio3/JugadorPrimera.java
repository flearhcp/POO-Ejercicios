package Ejercicio3;

public class JugadorPrimera extends Jugador {
    private Fecha fchFin;

    public JugadorPrimera(String nombre,String apellido,int edad,String id,Fecha fchInicio,Fecha fchFin){
        super(nombre, apellido, edad, id, fchInicio);
        this.fchFin = fchFin;
    }
    public Fecha getFchFin(){
        return this.fchFin;
    }
    public double importeNomina(Fecha hasta){
        return Math.sqrt((hasta.getMes() - this.fchFin.getMes())*25000);
    }
    public String toString(){
        return super.toString();
    }
}
