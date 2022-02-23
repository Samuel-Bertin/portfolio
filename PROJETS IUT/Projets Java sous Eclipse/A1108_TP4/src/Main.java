public class Main {
	
	static Afficheur [] chiffres = new Afficheur[9];
	

    private static void afficherZéro() {
    	
        System.out.println("0");
        System.out.println("------");
        chiffres[0] = new JoliAfficheur(0);
        System.out.println(chiffres[0]);
        System.out.println();
    }

    private static void afficherQuatre() {

        System.out.println("4");
        System.out.println("------");
        chiffres[4] = new JoliAfficheur(4);
        System.out.println(chiffres[4]);
        System.out.println();
    }

    private static void afficherNeuf() {

        System.out.println("9");
        System.out.println("------");
        System.out.println(new JoliAfficheur(9));
        System.out.println();
    }

    public static void main(String[] args) {
        Main.afficherZéro();
        Main.afficherQuatre();
        Main.afficherNeuf();
    }

}
