package Ejercicio1;

public class EmpleadoAdministrativo extends Empleado {
    protected double comision;

    public EmpleadoAdministrativo(String nombre,String apellido,int edad,double salario, double comision){
        super(nombre,apellido,edad,salario);
        this.comision = comision;
    }
    public boolean plus(double sueldoPlus){
        if(this.comision < 2000){
            setSalario(getSalario() + sueldoPlus);
            return true;
        }else{
            return false;
        }
    }
    public String imprimir(){
        return super.toString();
    }
}
