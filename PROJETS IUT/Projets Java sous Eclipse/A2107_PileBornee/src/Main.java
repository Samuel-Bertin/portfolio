import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FullStackException, EmptyStackException {

		Scanner input = new Scanner(System.in);
		System.out.println("Bonjour, saisir un mot:");
		String mot = input.nextLine();
		boolean palindrome = false;

		PileBornee<Character> p = new PileBornee<Character>(mot.length());

		ajouterLettresDansLaPile(mot, p);
		palindrome = verifierPalindrome(mot, palindrome, p);
		afficherResultat(palindrome, p);

		input.close();
	}

	private static void afficherResultat(boolean palindrome, PileBornee<Character> p) {
		if (palindrome) {
			System.out.println("palindrome");
		} else {
			System.out.println("Pas palindrome");
		}
		System.out.println(p.toString());
	}

	private static boolean verifierPalindrome(String mot, boolean palindrome, PileBornee<Character> p)
			throws EmptyStackException {
		int i;
		i = 0;
		while (!p.isEmpty() || i < mot.length() - 1) {
			palindrome = (p.top() == mot.charAt(i));
			p.pop();
			i++;
		}
		return palindrome;
	}

	private static void ajouterLettresDansLaPile(String mot, PileBornee<Character> p) throws FullStackException {
		int i;
		for (i = 0; i < mot.length(); i++) {

			p.push(mot.charAt(i));

		}
	}
}
