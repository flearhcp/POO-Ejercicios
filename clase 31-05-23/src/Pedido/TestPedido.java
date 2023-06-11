package Pedido;

import PiezaCeramica.Azulejo;
import PiezaCeramica.Baldoza;
import FormaDePago.*;

public class TestPedido {
    public static void main(String[] args) {
        Pedido p1Pedido = new Pedido();
        Azulejo a1 = new Azulejo(200, 500, 10);
        Baldoza b1 = new Baldoza(200, 900, 200);
        p1Pedido.agregarPieza(a1);
        p1Pedido.agregarPieza(b1);
        p1Pedido.setFormaDePago(new TarjetaDeCredito());
        p1Pedido.pagar();
    }

}
