package Ejercicio4;

public class Estudiante extends Persona {
    protected long LU;
    protected String facultad;
    protected String carrera;
    protected int anioIngreso;

    public Estudiante(String nombre,char sexo,long dni,long LU,String facultad,String carrera,int anioIngreso){
        super(nombre, sexo, dni);
        this.LU = LU;
        this.facultad = facultad;
        this.carrera = carrera;
        this.anioIngreso = anioIngreso;
    }
    public long getLU(){return this.LU;}
    public String getFacultad() {return facultad;}
    public String getCarrera() {return carrera;}
    public int getAnioIngreso() {return anioIngreso;}
}
