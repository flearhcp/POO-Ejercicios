package ejercicio6;

public class Alumno extends Persona{
    protected boolean regular;
    protected int materiasRendidas;

    public Alumno(String nombre){
        super(nombre);
        this.regular = false;
        this.materiasRendidas = 0;
    }
    public void setRegular(boolean regular){
        this.regular = regular;
    }


}
