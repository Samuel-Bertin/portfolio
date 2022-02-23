import java.util.*;
public class Main {

	public static void main (String []args ) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Veuillez saisir la valeur de a");
		int a = input.nextInt();
		input.close();
		double [] vSuite = new double[4];
		vSuite[0] = a;
		for (int i = 0; i <= 4; i++) {
			vSuite[i+1] = (1/2)*(vSuite[i] + (a/vSuite[i]) );
		}
		
		System.out.println("Valeur approchée de la racine carée de a: "+vSuite[a+1]);
	}
	
}
	
