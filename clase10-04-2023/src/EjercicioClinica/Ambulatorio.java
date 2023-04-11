package EjercicioClinica;

public class Ambulatorio extends Paciente {
    private String observaciones;

    public Ambulatorio(String nombre, int dni, String domicilio, String telofono) {
        super(nombre, dni, domicilio, telofono);
        this.observaciones = ""; 
    }
    public String getObservaciones(){
        return this.observaciones;
    }
    public void setObservaciones(String observaciones){
        this.observaciones = observaciones;
    }

    public String toString(){
        String cadena = "";
        cadena = super.toString() + " \nObeservaciones del paciente: " + this.getObservaciones();
        return cadena;
    }
}
