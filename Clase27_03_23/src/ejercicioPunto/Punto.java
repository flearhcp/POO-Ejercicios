package ejercicioPunto;

public class Punto {
	private double x;
	private double y;
	
	Punto(){
		this(0,0);
	}
	
	Punto(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double medirDistancia(Punto p) {//p:Punto(x,y)
		return Math.sqrt(Math.pow((p.getX() - this.x),2) + Math.pow((p.getY() - this.y),2));
	}
	public boolean dentroRadio(Punto p,double r) {//r: radio, centro: punto(x,y) central del circulo
		return medirDistancia(p)<r; //{
			//return true;
			//System.out.println("Dentro del radio.");
		}
		//else {
			//return false;
			//System.out.println("Fuera del radio.");
		//}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
