import java.util.Scanner;

public class Mastermain {
	
	static final int TAILLE = 4;

	public static void main(String[] args) {
		
		ModeleMastermind modele = new ModeleMastermind(6,TAILLE);
		int tabChiffres[] = new int[TAILLE];
		int essais = 0;
		
		Scanner input = new Scanner(System.in);
		
		modele.genererCombinaison();
		System.out.println(modele);
		
		while (essais < 12 && modele.nbChiffresBienPlaces(tabChiffres) != 4 ) {
			
			essais++;
			
			for (int i = 0; i < TAILLE; i++) {
				System.out.println("Saisir valeur "+(i+1));
				tabChiffres[i] = input.nextInt();
			}
			
			System.out.println("Mauvais :"+modele.nbChiffresMalPlaces(tabChiffres));
			System.out.println("Bien :"+modele.nbChiffresBienPlaces(tabChiffres));
			
		}

		
		if (modele.nbChiffresBienPlaces(tabChiffres) != 4) {
			System.out.println("Perdu");
			System.out.println(modele);
		} else {
			System.out.println("Gagné");
			
		}
		
		input.close();
	}

}
