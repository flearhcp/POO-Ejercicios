package ejercicio1;
//a)No son dos nuevas clases, son dos instancias de TCredito.
//b)Muestra los datos de nombre y numero del objeto JP
//c)(Hecho en clase TCredito en linea 38)
//d)(Hecho en clase Tarjeta en linea 12)
//e)(Hecho en clase TCredito en linea 44)
//f)(Hecho en clase Tarjeta en linea)
public class Tarjeta {

    public static void main(String[] args) {
        TCredito JPtarjeta = new TCredito("666","JPerez","BcoPatagonia",2000,10000);
        TCredito DMTarjeta = new TCredito("777","DMaradona","BcoGalicia",5000,100000);
        JPtarjeta.muestraDatos();
        //Ejercicio d)
        if(!JPtarjeta.puedoComprar(16000)){
            System.out.println("No puede comprar");
        }else{
            System.out.println("Compra realizada");
        }
        //ejercicio f)
        System.out.println("Monto de DMaradona: "+ DMTarjeta.getBalance());
        DMTarjeta.pagarTarjeta(1500);
        System.out.println("Monto de DMaradona: "+ DMTarjeta.getBalance());
    }
}
