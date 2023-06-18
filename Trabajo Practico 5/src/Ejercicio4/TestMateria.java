package Ejercicio4;

public class TestMateria {
    public static void main(String[] args) {
        Materia POO = new Materia();
        EstudianteCursando e1 = new EstudianteCursando("Mauro Gabriel Vargas",'M',42211210,222175,"Ciencias exactas","TUP",2018,60,0,80,0,80);
        POO.agregarAlumno(e1);
        EstudianteCursando e2 = new EstudianteCursando("Helga Celina Gradin", 'F', 42069321, 203040, "Artes y Ciencias", "Periodismo y locucion", 2018, 50, 75,30, 80, 100);
        POO.agregarAlumno(e2);
        EstudianteCursando e3 = new EstudianteCursando("Pablo Tomas Jaime", 'M', 42123321, 321233, "Medicina","Fisioterapeuta", 2019, 0, 0, 0, 0, 0);
        POO.agregarAlumno(e3);
        EstudianteCursando e4 = new EstudianteCursando("Facundo Chauqui", 'M', 40421345, 221023, "Ciencias exactas", "LAS",2018, 20, 60, 40, 40, 5);
        POO.agregarAlumno(e4);
        POO.contarInstancia();
        System.out.println("Cantidad regulares: "+ POO.getCantRegular());
        System.out.println("Cantidad Libres: "+POO.getCantLibre());
        System.out.println("Cantidad Ausente: "+POO.getCantAusente());
        POO.mostrarEstudiantes();
    }
}
