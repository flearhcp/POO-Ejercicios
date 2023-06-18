package Ejercicio4;
import java.util.ArrayList;

public class Materia {
    private ArrayList<AbsEstudiante> listaAlumnos;
    private int cantRegular,cantLibre,cantAusente;


    public Materia(){
        this.listaAlumnos = new ArrayList<AbsEstudiante>();
        this.cantRegular = 0;this.cantLibre = 0;this.cantAusente = 0;
    }

    public void agregarAlumno(AbsEstudiante estudiante){
        this.listaAlumnos.add(estudiante);    
    }
    public void contarInstancia(){
        for(int i=0;i<this.listaAlumnos.size();i++){
            if(this.listaAlumnos.get(i).estaRegular() == true){
                cantRegular++;
            }else if(this.listaAlumnos.get(i).estaLibre() == true){
                cantLibre++;
            }else{
                cantAusente++;
            }
        }
    }
    public void mostrarEstudiantes(){
        for(int i=0;i<this.listaAlumnos.size();i++){
            this.listaAlumnos.get(i).mostrarEstudiante();
        }
    }

    public int getCantRegular() {return cantRegular;}
    public int getCantLibre() {return cantLibre;}
    public int getCantAusente() {return cantAusente;}
    
}
