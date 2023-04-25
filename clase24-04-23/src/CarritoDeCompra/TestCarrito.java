package CarritoDeCompra;
import Libro.*;
import TipoDePago.Efectivo;
import TipoDePago.MercadoPago;
import Autor.Autor;
import Formato.*;
import java.util.ArrayList;
public class TestCarrito {
    public static void main(String[] args) {
        CarritoDeCompra n1 = new CarritoDeCompra();
        ArrayList<Autor> listaAutores = new ArrayList<Autor>();
        Autor a = new Autor("Carl jacobs");
        Autor b = new Autor("Paquita la del barrio");
        Autor c = new Autor("Mamani quispe quipildor alex");
        listaAutores.add(a);listaAutores.add(b);listaAutores.add(c);
        Libro l1 = new Libro(20234, listaAutores, new Papel("tapa dura"), 1250);
        Libro l2 = new Libro(20234, listaAutores, new Digital("pdf"), 1250);
        Libro l3 = new Libro(32123,listaAutores,new Digital("mobi"),1500);
        System.out.println("¿Estos libtos son iguales?"+l1.getIsbn()+" "+l2.getIsbn()+":"+l1.equals(l2));
        System.out.println("¿Estos libtos son iguales?"+l1.getIsbn()+" "+l3.getIsbn()+":"+l1.equals(l3));
        System.out.println("Precio del libro "+l1.getIsbn()+":"+l1.getPrecio());
        System.out.println("Precio del libro "+l2.getIsbn()+":"+l2.getPrecio());
        System.out.println("Precio del libro "+l3.getIsbn()+":"+l3.getPrecio());
        n1.agregarLibro(l1);n1.agregarLibro(l2);n1.agregarLibro(l2);n1.agregarLibro(l3);
        n1.eliminarLibro(l2);
        System.out.println("Precio total del carrito:"+n1.calcularTotal());
        n1.pagar(new MercadoPago());
        n1.pagar(new Efectivo());

    }
}