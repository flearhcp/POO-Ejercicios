package Ejercicio4;

public class Persona {
    private String nombre;
    private char sexo;
    private long dni;

    public Persona(String nombre,char sexo,long dni){
        this.nombre = nombre;
        this.sexo = sexo;
        this.dni = dni;
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public char getSexo() {return sexo;}

    public long getDni() {return dni;}
    
}
