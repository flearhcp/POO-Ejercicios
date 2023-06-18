package Ejercicio3;

public class JugadorReserva extends Jugador {
    
    public JugadorReserva(String nombre,String apellido,int edad,String id,Fecha fchIni){
        super(nombre, apellido, edad, id, fchIni);
    }
    public double importeNomina(Fecha hasta){
        double total = ((hasta.getMes() - super.fchInicio.getMes()) * 15000);
        return total;
    }
    
}
