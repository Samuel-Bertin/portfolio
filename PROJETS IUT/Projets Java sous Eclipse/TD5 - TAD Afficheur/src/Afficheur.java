
public interface Afficheur {
	
	//Opérations
	
		//Consultation
	
		//(
		public abstract boolean estSegmentAllumé(int i);
		
		//Modification
		
		//
		public abstract void allumerSegment(int i);
		
		//
		public abstract void éteindreSegment(int i);
		
		//Evaluation
	
	/*(P1) estSegmentAllumé (unAfficheur, s) = faux
	(P2) estSegmentAllumé (allumerSegment (a, s), s’) =
	si s = s’ alors vrai
	sinon estSegmentAllumé (a, s’)
	(P3) estSegmentAllumé (éteindreSegment (a, s), s’) =
	si s = s’ alors faux
	sinon estSegmentAllumé (a, s)*/
}
