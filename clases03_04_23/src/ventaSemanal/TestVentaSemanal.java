package ventaSemanal;

public class TestVentaSemanal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] venta = {23,24,34,21,23,28,200};
		VentaSemanal sem1 = new VentaSemanal();
		VentaSemanal sem2 = new VentaSemanal(5);
		VentaSemanal sem3 = new VentaSemanal(venta);
		sem1.cargarVentas();
		sem2.cargarVentas();
		System.out.println("Dia con mas ventas de la semana 3: "+ sem3.diaConMasVentas());
		System.out.println("Promedio de ventas de la semana 3: "+ sem3.promedioVentasSemanal());
		System.out.println("Promedio de ventas de la semana 2: "+ sem2.promedioVentasSemanal());

	}
}