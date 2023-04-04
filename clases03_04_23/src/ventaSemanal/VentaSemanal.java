package ventaSemanal;

import java.util.Scanner;

public class VentaSemanal {
	private double[] ventas;
	
	public VentaSemanal() {
		this.ventas = new double[7];
	}
	public VentaSemanal(int tam) {
		if(tam >= 0 && tam <=7) {
			this.ventas = new double[tam];
		}else {
			this.ventas = new double[7];
		}	
	}
	public VentaSemanal(double[] ventas) {
		if(ventas.length <= 7) {
			this.ventas = ventas;
		}else {
			for(int i=0;i<=7;i++) {
				this.ventas[i] = ventas[i];
			}
		}
	}
	public void cargarVentas() {
		Scanner sn = new Scanner(System.in);
		for(int i=0;i < this.ventas.length;i++) {
			System.out.println("Ingrese venta del dia"+ i +": ");
			this.ventas[i] = sn.nextDouble();
		}
	}
	public double totalVentaSemanal() {
		double ventas=0;
		for(int i=0;i<this.ventas.length;i++) {
			ventas = this.ventas[i] + ventas;
		}
		return ventas;
	}
	public double promedioVentasSemanal() {
		double ventasSemanal = totalVentaSemanal();
		return ventasSemanal / this.ventas.length;
	}
	public String diaConMasVentas() {
		int pos = 0;
		String[] dias = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
		for(int i=0;i<=this.ventas.length;i++) {
			for(int j=i;j<this.ventas.length;j++) {
				if(this.ventas[i]>this.ventas[j]) {
					pos = i;
				}
			}
		}
		return dias[pos];
	}
}
	
