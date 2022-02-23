import java.util.Scanner;

public class RechercheSequentielle {

    public static void main(String[] args) {

        final int NB = 50; // nombre maximum de valeurs
        int valeur; // une valeur de la suite
        int marqueur; // marqueur de fin
        int[] tab; // tableau m�morisant les valeurs
        int i; // indice de parcours du tableau

        // lire et m�moriser une suite de valeurs dans un tableau
        tab = new int[NB];
        i = 0;
        Scanner entr�e = new Scanner(System.in);
        System.out.print("Valeur du marqueur de fin : ");
        marqueur = entr�e.nextInt();
        System.out.print("Premi�re valeur : ");
        valeur = entr�e.nextInt();
        while (valeur != marqueur) {
            if (i == NB) {
                throw new RuntimeException("d�bordement");
            }
            tab[i] = valeur;
            i++;
            System.out.print("Valeur suivante : ");
            valeur = entr�e.nextInt();
        }
        int n = i;

        // lire la valeur � rechercher
        System.out.print("Valeur � rechercher : ");
        int x = entr�e.nextInt();

        entr�e.close();

        // rechercher le rang de la premi�re occurrence de x
        for (i = 0; i < n && tab[i] != x; i++) {
        }
        boolean trouv� = (i < n);
        if (trouv�) {
            System.out.println("la premi�re occurrence de " + x
                    + " a �t� trouv�e au rang " + i);
        } else {
            System.out.println("la valeur " + x + " n'a pas �t� trouv�e");
        }

    }

}
