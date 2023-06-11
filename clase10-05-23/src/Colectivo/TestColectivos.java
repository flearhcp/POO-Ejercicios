package Colectivo;
import java.util.ArrayList;

public class TestColectivos {
    public static void main(String[] args) {
        Hibrido cole1 = new Hibrido(150,1200000,Hibrido.ALTO_VOLTAJE,150,2);
        ColectivoDiesel cole2 = new ColectivoDiesel(50, 1000000, 200, 2);
        ColectivoElectrico cole3 = new ColectivoElectrico(55,900000, IElectrico.BAJO_VOLTAJE);
        ArrayList <Colectivo> arr = new ArrayList<Colectivo>();
        arr.add(cole1);
        arr.add(cole2);
        arr.add(cole3);
        for(int i= 0; i< arr.size();i++){
            if(arr.get(i) instanceof IElectrico){
                double v = ((IElectrico)arr.get(i)).getVoltaje();
                System.out.println(v);
                System.out.println(((Colectivo)arr.get(i)).getID());
            }else{
                System.out.println(((IDiesel)arr.get(i)).getNivelContaminacion());
                System.out.println(((Colectivo)arr.get(i)).getID());
            }
        }
        
    }
}
