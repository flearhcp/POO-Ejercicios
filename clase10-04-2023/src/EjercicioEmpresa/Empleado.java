package EjercicioEmpresa;

public class Empleado{
    protected String nombre;
    protected int dni;
    protected String direccion;
    protected int aniosAntiguedad;
    protected String telefono;
    protected int salario;
    protected int salarioMensual;//parte del ejercicio de polimorfismo de la clase del 12/04
    protected Empleado supervisor;
    
    
    public Empleado(){
        this.nombre = "";
        this.salario = 0;
        this.direccion = "";
        this.aniosAntiguedad = 0;
        this.telefono = "";
        this.salario = 0;
        this.salarioMensual = 0;
    }
    public Empleado(String nombre, int dni, String direccion, int aniosAntiguedad, String telefono, int salario,int salarioMensual) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.aniosAntiguedad = aniosAntiguedad;
        this.telefono= telefono;
        this.salario = salario;
        this.salarioMensual = salarioMensual;
        this.supervisor = new Empleado();
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDni() {
        return this.dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getDireccion() {
        return this.direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getAniosAntiguedad() {
        return this.aniosAntiguedad;
    }
    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }
    public String getTelefono() {
        return this.telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public int getSalario() {
        return this.salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public Empleado getSupervisor() {
        return supervisor;
    }
    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }
    public int getSalarioMensual(){
        return this.salarioMensual;
    }
    public void setSalarioMensual(int salarioMensual){
        this.salarioMensual = salarioMensual;
    }
    //
    public void incrementarSalario(){
        this.salario++;
    }

    public String toString(){
        String cadena = "";
        cadena = "Nombre del Empleado: " + getNombre() +"\n Dni:"+ getDni() +"\n Años de antiguedad: " + getAniosAntiguedad() +"\n Telefono: "+ getTelefono() +"\n Salario :" + getSalario() +"\n Nombre del Supervisor: "+ this.supervisor.getNombre();
        return cadena;
    }

}
