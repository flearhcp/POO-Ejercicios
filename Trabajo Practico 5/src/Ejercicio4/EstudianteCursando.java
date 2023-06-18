package Ejercicio4;

public class EstudianteCursando extends AbsEstudiante{
    
    public EstudianteCursando(String nombre,char sexo,long dni,long lu,String Facultad,String Carrera,int anioIng,int p1,int rp1,int p2,int rp2,int TPFinal){
        super(nombre, sexo, dni, lu, Facultad, Carrera, anioIng, p1, rp1, p2, rp2, TPFinal);
    }
    public boolean estaLibre(){
        if((P1<60 && RP1 < 60)||(P2<60 && RP2<60)||(TPFinal <60)){return true;}else{return false;}
    }
    public boolean estaAusente(){
        if((P1 == 0 && RP1 ==0)||(P2 == 0 && RP2 ==0)||(TPFinal ==0)){return true;}else{return false;}
    }
    public void mostrarEstudiante(){
                
    }
}
