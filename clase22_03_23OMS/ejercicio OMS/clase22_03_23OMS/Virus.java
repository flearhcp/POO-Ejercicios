package clase22_03_23OMS;

public class Virus {
	public String nombre;
	private int adn;
	private boolean nocivo;
	
	Virus(){
		this.adn = (int)(Math.random()*10)+1;
		this.nocivo = true;
	}
	Virus(String nombre){
		this.nombre = nombre;
	}
	public int getAdn() {
		return this.adn;
	}
	public boolean esNocivo() {
		return this.nocivo;
	}
	public void neutralizar(int adnNeutralizante) {
		if(adnNeutralizante == this.adn) {
			this.nocivo = false;
			System.out.println("El virus a sido neutralizado.");
		}else
			System.out.println("No se neutralizo el virus.");
	}	
}
