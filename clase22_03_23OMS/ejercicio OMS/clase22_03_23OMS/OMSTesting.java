package clase22_03_23OMS;
import java.util.Scanner;
public class OMSTesting {

	public static void main(String[] args) {
		Virus v = new Virus();
		Scanner sc = new Scanner(System.in);
		Scanner num = new Scanner(System.in);
		v.nombre = sc.nextLine();
		while(num.hasNextInt()) {
			v.neutralizar(num.nextInt());
			if(!v.esNocivo())
				break;
		}
		System.out.println(v.getAdn());
	}

}
