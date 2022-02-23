import java.util.Scanner;

public class RechercheSequentielle {

    public static void main(String[] args) {

        final int NB = 50; // nombre maximum de valeurs
        int valeur; // une valeur de la suite
        int marqueur; // marqueur de fin
        int[] tab; // tableau mémorisant les valeurs
        int i; // indice de parcours du tableau

        // lire et mémoriser une suite de valeurs dans un tableau
        tab = new int[NB];
        i = 0;
        Scanner entrée = new Scanner(System.in);
        System.out.print("Valeur du marqueur de fin : ");
        marqueur = entrée.nextInt();
        System.out.print("Première valeur : ");
        valeur = entrée.nextInt();
        while (valeur != marqueur) {
            if (i == NB) {
                throw new RuntimeException("débordement");
            }
            tab[i] = valeur;
            i++;
            System.out.print("Valeur suivante : ");
            valeur = entrée.nextInt();
        }
        int n = i;

        // lire la valeur à rechercher
        System.out.print("Valeur à rechercher : ");
        int x = entrée.nextInt();

        entrée.close();

        // rechercher le rang de la première occurrence de x
        for (i = 0; i < n && tab[i] != x; i++) {
        }
        boolean trouvé = (i < n);
        if (trouvé) {
            System.out.println("la première occurrence de " + x
                    + " a été trouvée au rang " + i);
        } else {
            System.out.println("la valeur " + x + " n'a pas été trouvée");
        }

    }

}
