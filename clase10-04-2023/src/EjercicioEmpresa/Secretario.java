package EjercicioEmpresa;

public class Secretario extends Empleado {
    private String despacho;
    private String fax;

    public Secretario(String nombre, int dni, String direccion,int aniosAntiguedad,String telefono,int salario,int salarioMensual,String despacho, String fax) {
        super(nombre,dni,direccion,aniosAntiguedad,telefono,salario,salarioMensual);
        this.despacho = despacho;
        this.fax = fax;
    }
    //getters y setters
    public String getDespacho(){
        return this.despacho;
    }
    public void setDespacho(String despacho){
        this.despacho = despacho;
    }
    public String getfax(){
        return this.fax;
    }
    public void setFax(String fax){
        this.fax = fax;
    }
    //
    public void incrementarSalario(){
        int aumento = (getSalarioMensual()*12)/100 + getAniosAntiguedad()*1000;
        setSalario(getSalario()+aumento*12); 
    }

    public String toString(){
        String cadena ="";
        cadena = "Datos del secretario:\n"+super.toString() + "\nDespacho: "+ getDespacho()+ "\nfax: " + getfax();
        return cadena; 
    }
}
