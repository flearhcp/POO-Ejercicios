package EjercicioEmpresa;


public class Pasantes extends Empleado{
    protected int contrato;
    
    public Pasantes(String nombre, int dni, String direccion, int aniosAntiguedad, String telefono, int salario,int salarioMensual){
        super(nombre,dni, direccion, aniosAntiguedad, telefono,salario,salarioMensual);
        this.contrato = 90;
    }
    //getters y setters 
    public int getContrato(){
        return this.contrato;
    }
    public void setContrato(int contrato){
        this.contrato = contrato;
    } 
    public void incrementarSalario(){
        int aumento = (getSalarioMensual()*12)/50;
        setSalario(getSalario()+aumento*12);
    }

    public String toString(){
        String cadena ="";
        cadena="Datos del pasante:\n"+ super.toString()+ "\nTiempo de contrato: "+ getContrato() +"dias.";
        return cadena;
    }
}
