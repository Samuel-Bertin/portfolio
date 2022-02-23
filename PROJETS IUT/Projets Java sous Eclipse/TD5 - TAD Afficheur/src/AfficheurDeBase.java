
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
	
	public void �teindreSegment(int i) throws IllegalArgumentException {
		if (i < 0 || i >= 7 ) {
			throw new IllegalArgumentException(" 0 <= s <= 6");
		}
		segments[i] = false;
	}
	
	//Evaluation
	public boolean estSegmentAllum�(int i) throws IllegalArgumentException {
		if (i < 0 || i >= 7 ) {
			throw new IllegalArgumentException(" 0 <= s <= 6");
		} 
		return (segments[i]);
	}
	
	//toString
	public String toString() {
		String �tat = "";
		for (int i = 0; i<7; i++) {
			�tat += " segment "+i;
			if (segments[i]) {
				�tat += " allum�\n";
			} else {
				�tat += " �teint\n";
			}
		}
		return �tat;
	}
	
	
	
	
	/*(P1) estSegmentAllum� (unAfficheur, s) = faux
	(P2) estSegmentAllum� (allumerSegment (a, s), s�) =
	si s = s� alors vrai
	sinon estSegmentAllum� (a, s�)
	(P3) estSegmentAllum� (�teindreSegment (a, s), s�) =
	si s = s� alors faux
	sinon estSegmentAllum� (a, s)*/
	
}
