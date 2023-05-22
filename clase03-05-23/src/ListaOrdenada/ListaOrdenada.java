package ListaOrdenada;
import java.util.ArrayList;
public abstract class ListaOrdenada{
    private ArrayList<Object> lista;

    public ListaOrdenada(){
        this.lista = new ArrayList<Object>();
    }
    public int getTam(){
        return this.lista.size();
    }
    public boolean estaVacia(){
        if(this.lista.size()==0){
            return true;
        }else{
            return false;
        }        
    }
    public abstract boolean menor(Object a, Object b);//compara si el obj A es menor que el obj B
    public abstract boolean mayor(Object a, Object b);//Compara si el obj A es mayor que el obj B
    public abstract boolean igual(Object a, Object b);//Compara si los dos objetos son iguales
    public int posicionDe(Object obj){
        return this.lista.indexOf(obj);
    }
    public void insertar(Object obj){
        for(int i=0;i < this.lista.size(); i++){
            if(menor(obj,this.lista.get(i))){
                this.lista.add(i, obj);
            }
        }
    }
    public void eliminar(Object obj){
        this.lista.remove(obj);
    }
    private int busquedaBinaria(Object obj){
        int ini = 0; int n = this.lista.size(); int mid = (ini + n)/2;
        while (ini < n && this.lista.get(mid) != obj){
            if(mayor(this.lista.get(mid), obj)){
                n = mid - 1;
            }else{
                ini = mid + 1;
            }
            mid = (ini + n)/2;
        }
        if(ini <= n){
            return this.lista.indexOf(obj);
        }else{
            return -1;
        }
    }
    public boolean esta(Object obj){
        if(busquedaBinaria(obj)!= -1){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        String cadena = "";
        cadena = this.lista.toString();
        return cadena;
    }
}