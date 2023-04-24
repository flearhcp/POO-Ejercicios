package Equipo;

public class Partidos {
    private Equipo equipo1;
    private Equipo equipo2;
    private int amarillas;
    private int rojas;
    private String resultado;

    public Partidos(Equipo equipo1,Equipo equipo2){
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.amarillas = 0;
        this.rojas = 0;
        this.resultado = "0-0";
    }
    //getters y setters
    public Equipo getEquipo1(){return this.equipo1;}
    public Equipo getEquipo2(){return this.equipo2;}
    public int getAmarillas(){return this.amarillas;}
    public void setAmarilla(int amarilla){this.amarillas = amarilla;}
    public int getRojas(){return this.rojas;}
    public void setRojas(int rojas){this.rojas =rojas;}
    public String getResultado(){return this.resultado;}
    public void setResultado(String resultado){this.resultado =resultado;}
    //
    public String toString(){
        String cadena = "Partido: ";
        cadena += "\n" + this.equipo1.getClass() + "vs. "+ this.equipo2.getNombre() +"\nResultado: "+ getResultado() +"\n Amonestados: "+ getAmarillas()+"\n Rojas: "+ getRojas();
        return cadena;
    }
}
