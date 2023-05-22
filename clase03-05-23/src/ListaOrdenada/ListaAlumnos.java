package ListaOrdenada;

public class ListaAlumnos extends ListaOrdenada{
    
    public ListaAlumnos(){
        super();
    }
    public boolean menor(Object a, Object b){
        if(((Alumno)a).getName().compareTo(((Alumno)b).getName()) < 0){
            return true;
        }else{
            return false;
        }
    }
    public boolean mayor(Object a, Object b){
        if(((Alumno)a).getName().compareTo(((Alumno)b).getName()) > 0){
            return true;
        }else{
            return false;
        }
    }
    public boolean igual(Object a,Object b){
        if(((Alumno)a).getName().compareTo(((Alumno)b).getName()) == 0){
            return true;
        }else{
            return false;
        }
    }
}
