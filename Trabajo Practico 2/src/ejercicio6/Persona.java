package ejercicio6;

public class Persona {
    protected String nombre;
    protected boolean condicion;

    protected Persona(String nombre){
        this.nombre = nombre;
        this.condicion = false;
    }
    protected void setNombre(String nombre){
        this.nombre = nombre;
    }
    protected void setCondicion(boolean condicion){
        this.condicion = condicion;
    }
    public String getNombre(){
        return this.nombre;
    }
    public boolean getCondicion(){
        return this.condicion;
    }

}
