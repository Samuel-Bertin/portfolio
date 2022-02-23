import java.util.*;

public class Main {

	public static void main (String []args) {
		
		Scanner input = new Scanner(System.in);
		Afficheur cadran = new AfficheurDeBase();
		System.out.println("Veuillez saisir un chiffre entre 0 et 9 a afficher");
		int chiffreAffich� = input.nextInt();
		input.close();
		switch (chiffreAffich�) {
		case 1: 
			cadran.allumerSegment(2);
			cadran.allumerSegment(5);
			break;
		case 2: 
			for (int i = 0; i < 7; i++) {
				cadran.allumerSegment(i);
			}
			cadran.�teindreSegment(1);
			cadran.�teindreSegment(5);
			break;
		case 3:
			for (int i = 0; i < 7; i++) {
				cadran.allumerSegment(i);
			}
			cadran.�teindreSegment(1);
			cadran.�teindreSegment(4);
			break;
		case 4:
			cadran.allumerSegment(1);
			cadran.allumerSegment(2);
			cadran.allumerSegment(3);
			cadran.allumerSegment(5);
			break;
		case 5 : 
			for (int i = 0; i < 7; i++) {
				cadran.allumerSegment(i);
			}
			cadran.�teindreSegment(2);
			cadran.�teindreSegment(4);
			break;
		case 6:
			for (int i = 0; i < 7; i++) {
				cadran.allumerSegment(i);
			}
			cadran.�teindreSegment(2);
			break;
		case 7:
			cadran.allumerSegment(0);
			cadran.allumerSegment(2);
			cadran.allumerSegment(5);
			break;
		case 8 :
			for (int i = 0; i < 7; i++) {
				cadran.allumerSegment(i);
			}
			break;
		case 9: 
			for (int i = 0; i < 7; i++) {
				cadran.allumerSegment(i);
			}
			cadran.�teindreSegment(4);
		default:
			System.out.println("Saisir une valeur entre 0 et 9");
		}
		
		System.out.println(cadran.toString());
		
	}
	
}
