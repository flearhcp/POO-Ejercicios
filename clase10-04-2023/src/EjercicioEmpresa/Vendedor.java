package EjercicioEmpresa;

public class Vendedor extends Empleado{
    private String telefonoMovil;
    private Vehiculo vehiculo;

    public Vendedor(String nombre, int dni, String direccion, int aniosAntiguedad, String telefono, int salario,int salarioMensual ,String telefonoMovil, String matricula, String marca, String modelo){
        super(nombre,dni,direccion,aniosAntiguedad,telefono,salario,salarioMensual);
        this.vehiculo = new Vehiculo(matricula, modelo, marca);
    }
    //getters y setters 
    public String getVehiculo(){
        return this.vehiculo.toString();
    }
    public void setVehiculo(Vehiculo nVehiculo){
        this.vehiculo = nVehiculo;
    }    
    public String getTelefonoMovil(){
        return this.telefonoMovil;
    }
    public void setTelefonoMovil(String telofonoMovil){
        this.telefonoMovil = telofonoMovil;
    }
    public void incrementarSalario(){
        int aumento = (getSalarioMensual()*12)/200 + getAniosAntiguedad() * 1200;
        setSalario(getSalario()+aumento*12);   
    }

    public String toString(){
        String cadena = "";
        cadena = "Datos del vendedor:\n" + super.toString() + "\nTelefono Movil: " + getTelefonoMovil() + "\n Datos del auto: "+ vehiculo.toString();
        return cadena;
    }
}
