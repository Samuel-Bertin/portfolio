public class Main {

	public static void main(String[] args) {
		System.out.println ("COMPTEUR_NUL = "+ CompteurKilométriqueTableau.COMPTEUR_NUL) ;
		CompteurKilométrique c1 = new CompteurKilométriqueTableau (299) ;
		System.out.println(c1.versEntier());
		c1.ajouterUn() ;
		System.out.println(c1.versEntier());
		System.out.println ("CompteurKilométrique c1 = " + c1) ;
		CompteurKilométrique c2 = new CompteurKilométriqueTableau (31) ;
		System.out.println ("CompteurKilométrique c2 = " + c2) ;
		int v1 = c1.versEntier() - c2.versEntier() ;
		CompteurKilométrique c3 = new CompteurKilométriqueTableau (v1) ;
		System.out.println ("CompteurKilométrique c3 = " + c3) ;
		int v2 = c3.versEntier() - CompteurKilométriqueTableau.COMPTEUR_NUL.versEntier() ;
		CompteurKilométrique c4 = new CompteurKilométriqueTableau (v2) ;
		System.out.println ("CompteurKilométrique c4 = " + c4) ;
		if (c3.egal(c4)) {
			System.out.println("Les compteurs kilométriques c3 et c4 sont égaux") ;
		}
		else {
			System.out.println("Les compteurs kilométriques c3 et c4 sont différents") ;
		}
	}

}
