package ejercicioPunto;

public class TestPunto {

	public static void main(String[] args) {
		Punto p1 = new Punto(1,1);
		Punto p2 = new Punto(1,1);
		Punto p3 = new Punto();
		System.out.println("Distancia entre puntos p1 y p2: " + p1.medirDistancia(p2));
		System.out.println("Distancia entre puntos p2 y p1: " + p2.medirDistancia(p1));
		System.out.println("Distancia entre puntos p2 y p1: " + p3.medirDistancia(p1));
		System.out.println("Dentro del radio: "+ p3.dentroRadio(p1,2));
		System.out.println("Dentro del radio: "+ p1.dentroRadio(p2,1));
		//p3.dentroRadio(p1,1);
		//p1.dentroRadio(p3,0.5);
		
	}

}
