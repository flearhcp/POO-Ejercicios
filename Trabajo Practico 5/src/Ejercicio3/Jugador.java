package Ejercicio3;

public abstract class Jugador extends Persona {
    private String idJugador;
    protected Fecha fchInicio;

    public Jugador(String nombre,String apellido,int edad,String id,Fecha fchIni){
        super(nombre,apellido,edad);
        this.idJugador = id;
        this.fchInicio = fchIni;
    }

    public String getIdJugador() {
        return idJugador;
    }
    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }
    public abstract double importeNomina(Fecha hasta);
    public String toString(){
        return "Jugador:\n"+super.toString()+" "+"ID: "+getIdJugador()+" "+"Fecha de inicio de contrato: "+ this.fchInicio;
    }
}
