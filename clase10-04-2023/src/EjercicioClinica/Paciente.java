package EjercicioClinica;
import Fecha.Fecha;
public class Paciente {
    private String nombre;
    private int dni;
    private String domicilio;
    private String telefono;
    private Fecha fecha;
    
    
    public Paciente(String nombre, int dni, String domicilio, String telefono){
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.fecha = new Fecha();
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getDni(){
        return this.dni;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    public String getDomicilio(){
        return this.domicilio;
    }
    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public void setFecha(int dia,int mes,int anio,int hora,int min){
        this.fecha.setFecha(dia, mes, anio, hora, min);
    }
    public String toString(){
        String cadena = "";
        cadena = "Nombre: "+ this.nombre + "\nDni: "+ this.dni +"\nDomicilio: "+ this.domicilio + "\nTelefono: "+ this.telefono +"\nFecha de Ingreso: "+ this.fecha.toString();
        return cadena;

    }
}
