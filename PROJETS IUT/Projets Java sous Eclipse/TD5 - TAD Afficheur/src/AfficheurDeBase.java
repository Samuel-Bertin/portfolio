
public class AfficheurDeBase implements Afficheur {
	
	private boolean [] segments; 
	

	
	//Constructeurs
	public AfficheurDeBase() {
		segments =  new boolean[7];
		for (int i = 0; i<7; i++) {
			segments[i] = false;
		}
	}
	
	//Modification
	public void allumerSegment(int i) throws IllegalArgumentException {
		if (i<0 || i>=7) {
			throw new IllegalArgumentException("0>=s<=6");
		}
		segments[i] = true;
	}
	
	public void éteindreSegment(int i) throws IllegalArgumentException {
		if (i < 0 || i >= 7 ) {
			throw new IllegalArgumentException(" 0 <= s <= 6");
		}
		segments[i] = false;
	}
	
	//Evaluation
	public boolean estSegmentAllumé(int i) throws IllegalArgumentException {
		if (i < 0 || i >= 7 ) {
			throw new IllegalArgumentException(" 0 <= s <= 6");
		} 
		return (segments[i]);
	}
	
	//toString
	public String toString() {
		String état = "";
		for (int i = 0; i<7; i++) {
			état += " segment "+i;
			if (segments[i]) {
				état += " allumé\n";
			} else {
				état += " éteint\n";
			}
		}
		return état;
	}
	
	
	
	
	/*(P1) estSegmentAllumé (unAfficheur, s) = faux
	(P2) estSegmentAllumé (allumerSegment (a, s), s’) =
	si s = s’ alors vrai
	sinon estSegmentAllumé (a, s’)
	(P3) estSegmentAllumé (éteindreSegment (a, s), s’) =
	si s = s’ alors faux
	sinon estSegmentAllumé (a, s)*/
	
}
