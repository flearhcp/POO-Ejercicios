package Fecha;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fecha {
    private LocalDateTime fechaYhora;
    
    public Fecha() {
        this.fechaYhora = LocalDateTime.now();
    }
    public Fecha(int dia,int mes,int anio,int hora,int min){
        this.fechaYhora = LocalDateTime.of(anio, mes, dia, hora, min);
    }
    //Getters y setters
    public void setFecha(int dia, int mes, int anio, int hora, int min){
        this.fechaYhora = LocalDateTime.of(anio, mes, dia, hora, min);
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
    public int getHora(){
        return this.fechaYhora.getHour();
    }
    public void setHora(int hora){
        this.fechaYhora = this.fechaYhora.withHour(hora);
    }
    public int getMin(){
        return  this.fechaYhora.getMinute();
    }
    public void setMin(int min){
        this.fechaYhora = this.fechaYhora.withMinute(min);
    }
    
    public String toString(){
        String cadena = "";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        cadena = this.fechaYhora.format(formato);
        return cadena;
    }
}
