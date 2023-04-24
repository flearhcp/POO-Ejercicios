package Tecnico;

import java.util.ArrayList;

public class Tecnico {
    private ArrayList <String> competencias;

    public Tecnico(){
        this.competencias = new ArrayList<String>();
    }

    public void cargarCompetencias(String competencias){
        if(this.competencias.size() < 4){
            this.competencias.add(competencias);
        }else{//modificacion ejercicio complementario
            System.out.println("No se puede cargar mas competencias.");
        }
    }
    public void eliminarCompetencia(){
        this.competencias.remove(this.competencias.size() - 1);
    }
    public void eliminarCompetencia(String competencia){
        this.competencias.remove(competencia);
    }
    public int cantidadCompetencias(){
        return this.competencias.size();
    }
    public String toString(){
        String cadena = "Competencias:\n"+ this.competencias.toString();
        return cadena;
    }

}
