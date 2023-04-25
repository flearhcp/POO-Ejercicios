package Conductor;

public class Conductor {
    private String nombre;
    private int edad;
    private int carreras;

    public Conductor(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.carreras = 0;
    }
    public Conductor(String nombre, int edad, int carreras){
        this(nombre, edad);
        this.carreras = carreras;
    }
    public String getNombre(){return this.nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public int getEdad(){return this.edad;}
    public void setEdad(int edad){this.edad = edad;}
    public int getCarreras(){return this.carreras;}
    public void setCarreras(int carreras){this.carreras = carreras;}

    public String toString(){
        String cadena ="";
        cadena = " Nombre: " + getNombre() + "\nEdad: "+ getEdad() + "\nCarreras: "+ getCarreras();
        return cadena;
    }
}
