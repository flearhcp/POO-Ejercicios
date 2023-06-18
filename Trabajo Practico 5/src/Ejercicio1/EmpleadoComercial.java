package Ejercicio1;

public class EmpleadoComercial extends Empleado{
    protected double comision;

    public EmpleadoComercial(String nombre,String apellido,int edad,int salario,double comision){
        super(nombre,apellido,edad,salario);
        this.comision = comision;
    }
    public boolean plus(double sueldoPlus){
        if(this.comision < 1000){
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
