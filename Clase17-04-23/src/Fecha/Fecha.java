package Fecha;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
    private LocalDate fechaYhora;
    
    public Fecha() {
        this.fechaYhora = LocalDate.now();
    }
    public Fecha(int dia,int mes,int anio){
        this.fechaYhora = LocalDate.of(anio, mes, dia);
    }
    //Getters y setters
    public void setFecha(int dia, int mes, int anio){
        this.fechaYhora = LocalDate.of(anio, mes, dia);
    }
    public int getAnio(){
        return fechaYhora.getYear();
    }
    public void setAnio(int anio){
        this.fechaYhora = this.fechaYhora.withYear(anio);
    }
    public int getDia(){
        return this.fechaYhora.getDayOfMonth();
    }
    public void setDia(int dia){
        this.fechaYhora = this.fechaYhora.withDayOfMonth(dia);
    }
    public int getMes(){
        return this.fechaYhora.getMonthValue();
    }
    public void setMes(int mes){
        this.fechaYhora = this.fechaYhora.withMonth(mes);
    }
    
    public String toString(){
        String cadena = "";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        cadena = this.fechaYhora.format(formato);
        return cadena;
    }
}
