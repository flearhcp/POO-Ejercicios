package Ejercicio4;

public abstract class AbsEstudiante extends Estudiante {
    protected int P1,RP1,P2,RP2,TPFinal;

    public AbsEstudiante(String nombre,char sexo,long dni,long lu,String facultad,String carrera,int ingreso,int p1,int rp1,int p2,int rp2,int TPFinal){
        super(nombre, sexo, dni, lu, facultad, carrera, ingreso);
        this.P1 = p1;
        this.RP1 = rp1;
        this.P2 = p2;
        this.RP2 = rp2;
        this.TPFinal = TPFinal;
    }
    public boolean estaRegular(){
        boolean rta = false;
        if(((this.P1 >=60)||(this.RP1 >=60))&&((this.P2 >=60)||(this.RP2 >=60))&&(this.TPFinal >=60)){
            rta = true;
        }
        return rta;
    }
    public abstract boolean estaLibre();
    public abstract boolean estaAusente();
    public abstract void mostrarEstudiante();
}
