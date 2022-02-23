
public class JoliAfficheur extends AfficheurDeBase{
	
	public JoliAfficheur(int n) {
		super(n);
	}
	
	public String toString() {
		String res = "" ;
		if (this.estSegmentAllumé(0)) {
		res = res + "░░░░░░" + "\n";
		}
		if (this.estSegmentAllumé(1) && !this.estSegmentAllumé(2)) {
		for (int i = 0 ; i < 3 ; i++) {
		res = res + "░" + "\n" ;
		}
		}
		if (!this.estSegmentAllumé(1) && this.estSegmentAllumé(2)) {
		for (int i = 0 ; i < 3 ; i++) {
		res = res + "     ░" + "\n" ;
		}
		}
		if (this.estSegmentAllumé(1) && this.estSegmentAllumé(2)) {
		for (int i = 0 ; i < 3 ; i++) {
		res = res + "░    ░" + "\n" ;
		}
		}
		if (this.estSegmentAllumé(3)) {
		res = res + "░░░░░░" + "\n";
		}
		if (this.estSegmentAllumé(4) && !this.estSegmentAllumé(5)) {
		for (int i = 0 ; i < 3 ; i++) {
		res = res + "░" + "\n" ;
		}
		}
		if (!this.estSegmentAllumé(4) && this.estSegmentAllumé(5)) {
		for (int i = 0 ; i < 3 ; i++) {
		res = res + "     ░" + "\n" ;
		}
		}
		if (this.estSegmentAllumé(4) && this.estSegmentAllumé(5)) {
		for (int i = 0 ; i < 3 ; i++) {
		res = res + "░   ░" + "\n" ;
		}
		}
		if (this.estSegmentAllumé(6)) {
		res = res + "░░░░░░" + "\n";
		}
		return res ;
		}
	
}
