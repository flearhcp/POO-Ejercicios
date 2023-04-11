package EjercicioClinica;
import Fecha.Fecha;

public class Internado extends Paciente {
    private Fecha FechaAlta;

    public Internado(String nombre, int dni, String domicilio, String telefono){
        super(nombre, dni, domicilio, telefono);
        this.FechaAlta= new Fecha();
    }
    public void setFechaAlta(int dia,int mes, int anio, int hora, int min){
        this.FechaAlta.setFecha(dia, mes, anio, hora, min);
    }
    public void setFechaEntrada(int dia,int mes, int anio, int hora, int min){
        this.setFecha(dia, mes, anio, hora, min);
    }
    public String getFechaAlta(){
        return this.FechaAlta.toString();
    }
    
    public String toString(){
        String cadena ="";
        cadena = super.toString() + "\nFecha de Alta: "+ getFechaAlta() + "\n";
        return cadena;
    }

}
