import java.util.*;
public class Expressions {
	
	Deque<Expression> pile = new ArrayDeque<Expression>();
	
	public void toExp(String s) {
		
		while (s.length() != 0) {
			if (s.charAt(0) == '(') {
				
				int i = 1;
				while (s.charAt(i) != ')') {
					i++;
				}
				
				int longueurEntier = i-1;
				String entier = "";
				for (int j =0; j<longueurEntier ; j++) {
					entier += s.charAt(j);
				}
				
				System.out.println(entier);
				/*Expression a1 = new Feuille(a - '0');
				pile.add(a1);
				s = s.substring(1, s.length());*/
				
			} 
		}
		
	}
	
}
