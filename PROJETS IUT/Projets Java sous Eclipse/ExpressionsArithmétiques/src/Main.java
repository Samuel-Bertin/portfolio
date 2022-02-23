import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	
	public static void main(String []args) {
		
		/*Expression dix = new Feuille(10);
		Expression six = new Feuille(6);
		
		Expression vingt = new Feuille(20);
		Expression trois = new Feuille(3);
		Expression deux = new Feuille(2);
		Expression r1 = new Feuille(136);
		
		Expression a1 = new Addition(dix, six);	
		System.out.println(a1.résultat());
		Expression s1 = new Soustraction(vingt,trois);
		System.out.println(s1.résultat());
		
		Expression m1 = new Multiplication(a1, s1);
		System.out.println(m1.résultat());
		Expression d1 = new Division(m1,deux);
		System.out.println(d1.résultat());
		System.out.println(d1.equals(r1));*/
		
		String s = "(10)(6)+(20)(3)-*(2)";
		Deque<Expression> pile = new ArrayDeque<Expression>();
		
		int v = 0;
		int i = 0;
		
		while (i < s.length()) {
			if (s.charAt(i) == '(') {
					while (s.charAt(i) != ')') {
						v += (v*10) + s.charAt(i+1) - '0';
						i++;
					}
					Expression e = new Feuille(v);
					pile.add(e);
			}
			i++;
		}
		System.out.println(v);
		
		
		//while (s.length() != 0) {
		/*	
	 		String entier = "";
	 		int feuille;
	 		//Si le premier caractere de la chaine est une parenthese ouvrante
			if (s.charAt(0) == '(') {
				//créer une chaine sans paranthese ouvrante
				String s2 = s.substring(1);
				int i = 0;
				//balayer la nouvelle chaine jusqu'a la parenthese fermante
				while (s2.charAt(i) != ')') {
					i++;
				}
				//mettre la chaine entre parantheses dans une nouvelle chaine 
				int longueurEntier = i;
				for (int j =0; j<longueurEntier ; j++) {
					entier += s2.charAt(j);
				}
				
				System.out.println(entier);
				//Transfomer la nouvelle chaine en entier
				for (int j = 0 ; j<entier.length(); j++) {
					feuille = (entier.charAt(j) - '0')*;
				}

			}
			*/
		 //}
	}
	
}
