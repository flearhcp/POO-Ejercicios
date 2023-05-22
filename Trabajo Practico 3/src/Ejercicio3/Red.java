package Ejercicio3;

import java.util.ArrayList;

public class Red extends Dispositivos{
    private ArrayList<Host> lista;
    private Router router;

    public Red(Direccion dire){
        super(dire);
        this.lista = new ArrayList<Host>();
    }
    public void conectar(Host host){
        if(this.getDireccion() == host.getDireccion()){
            this.lista.add(host);
        }else{
            System.out.println("No se puede conectar.");
        }
    }
    public void conectar(Router router){
        this.router = router;
    }

    public String toString(){
        String cad = "\nDireccion: "+ super.toString() +"\nLista de Host: ";
        for(int i = 0;i< this.lista.size();i++){
            cad += "\n"+ this.lista.get(i).toString();
        }
        cad += "\nConectado a router : ("+ this.router.getDireccion()+",0)";
        return cad;
    }
}
