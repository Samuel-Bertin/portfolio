import java.util.Scanner ;

public class Main {

	public static void main(String[] args) {
		
		// lire les 2 durées
		Scanner input = new Scanner(System.in) ;
		System.out.println("saisir la première durée (heures minutes secondes) : ") ;
		int h = input.nextInt() ;
		int m = input.nextInt() ;
		int s = input.nextInt() ;
		Duree d1 = new DureeEnHeuresMinutesSecondes(h, m, s) ;
		System.out.println("saisir la deuxième durée (heures minutes secondes) : ");
		h = input.nextInt() ;
		m = input.nextInt() ;
		s = input.nextInt() ;
		Duree d2 = new DureeEnSecondes(h, m, s) ;
		input.close() ;

		// permuter les 2 durées si la première est plus petite que la seconde
		if (d1.inf(d2)) {
			Duree aux = d1 ;
			d1 = d2 ;
			d2 = aux ;
		}
		System.out.println("première durée : " + d1) ;
		System.out.println("deuxième durée : " + d2) ;

		// calculer la durée séparant 2 durées sachant que d1 est la plus grande des 2
		//Comparer la durée en secondes
		Duree d3 = new DureeEnHeuresMinutesSecondes(0, 0, 0);
		Duree d4 = new DureeEnHeuresMinutesSecondes(d2.getHeures(), d2.getMinutes(), d2.getSecondes());
		
		System.out.println("première durée : " + d3) ;
		System.out.println("deuxième durée : " + d4) ;
		
		while (!d4.egal(d1)) {
			d3.ajouterUneSeconde();
			d4.ajouterUneSeconde();
		}
		
		System.out.println(d3.toString());
		// à compléter
		
	}		

}
