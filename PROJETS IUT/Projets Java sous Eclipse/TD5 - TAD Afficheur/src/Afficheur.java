
public interface Afficheur {
	
	//Op�rations
	
		//Consultation
	
		//(
		public abstract boolean estSegmentAllum�(int i);
		
		//Modification
		
		//
		public abstract void allumerSegment(int i);
		
		//
		public abstract void �teindreSegment(int i);
		
		//Evaluation
	
	/*(P1) estSegmentAllum� (unAfficheur, s) = faux
	(P2) estSegmentAllum� (allumerSegment (a, s), s�) =
	si s = s� alors vrai
	sinon estSegmentAllum� (a, s�)
	(P3) estSegmentAllum� (�teindreSegment (a, s), s�) =
	si s = s� alors faux
	sinon estSegmentAllum� (a, s)*/
}
