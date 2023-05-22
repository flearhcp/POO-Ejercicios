package ListaOrdenada;

public class ListaEnteros extends ListaOrdenada{

    public ListaEnteros(){
        super();
    }
    @Override
    public boolean menor(Object a, Object b){
        if(((Integer) a).intValue() < ((Integer)b).intValue()){
            return true;
        }else{
            return false;
        }
    }
    public boolean mayor(Object a,Object b){
        if(((Integer)a).intValue() > ((Integer)b).intValue()){
            return true;
        }else{
            return false;
        }
    }
    public boolean igual(Object a, Object b){
        if(((Integer)a).equals(((Integer)b).intValue())){
            return true;
        }else{
            return false;
        }
    }

}
