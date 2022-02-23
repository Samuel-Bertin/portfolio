/**
 * 
 * @author Samuel BERTIN
 *
 */
public class AfficheurDeBase implements Afficheur {
	
	/**
	 * tableau des segments d'un afficheur de base
	 */
    private boolean[] segments;
    /**
     * nb de segments pour un afficheur de base
     */
    private static final int SEGMENTS = 7;
    /**
     * Constructeur d'un afficheur de base
     */
    public AfficheurDeBase(int n) {
        this.segments = new boolean[AfficheurDeBase.SEGMENTS];
        for (int s = 0; s < this.segments.length; s++) {
            this.segments[s] = false;
        }
        switch (n) {
        case 0:
        	for (int i = 0; i < 7; i++) {
				this.allumerSegment(i);
			}
        	this.�teindreSegment(3);
			break;
        case 1: 
			this.allumerSegment(2);
			this.allumerSegment(5);
			break;
		case 2: 
			for (int i = 0; i < 7; i++) {
				this.allumerSegment(i);
			}
			this.�teindreSegment(1);
			this.�teindreSegment(5);
			break;
		case 3:
			for (int i = 0; i < 7; i++) {
				this.allumerSegment(i);
			}
			this.�teindreSegment(1);
			this.�teindreSegment(4);
			break;
		case 4:
			this.allumerSegment(1);
			this.allumerSegment(2);
			this.allumerSegment(3);
			this.allumerSegment(5);
			break;
		case 5 : 
			for (int i = 0; i < 7; i++) {
				this.allumerSegment(i);
			}
			this.�teindreSegment(2);
			this.�teindreSegment(4);
			break;
		case 6:
			for (int i = 0; i < 7; i++) {
				this.allumerSegment(i);
			}
			this.�teindreSegment(2);
			break;
		case 7:
			this.allumerSegment(0);
			this.allumerSegment(2);
			this.allumerSegment(5);
			break;
		case 8 :
			for (int i = 0; i < 7; i++) {
				this.allumerSegment(i);
			}
			break;
		case 9: 
			for (int i = 0; i < 7; i++) {
				this.allumerSegment(i);
			}
			this.�teindreSegment(4);
		default:
			System.out.println("Saisir une valeur entre 0 et 9");
        }
    }
    
    /**
     * @param s num�ro de segment
     * @return vrai si segment s allum�
     */
    public boolean estSegmentAllum�(int s) throws IllegalArgumentException {
        if (s < 0 || s > this.segments.length - 1) {
            throw new IllegalArgumentException("num�ro de segment invalide");
        }
        return this.segments[s];
    }

    /**
     * @param s num�ro de segment a allumer
     */
    public void allumerSegment(int s) throws IllegalArgumentException {
        if (s < 0 || s > this.segments.length - 1) {
            throw new IllegalArgumentException("num�ro de segment invalide");
        }
        this.segments[s] = true;
    }

    /**
     * @param s num�ro de segment a �teindre
     */
    public void �teindreSegment(int s) throws IllegalArgumentException {
        if (s < 0 || s > this.segments.length - 1) {
            throw new IllegalArgumentException("num�ro de segment invalide");
        }
        this.segments[s] = false;
    }
    
    /**
     * afficheur sous forme de chaine de caract�re
     */
    @Override
    public String toString() {
        String res = "";
        for (int s = 0; s < this.segments.length; s++) {
            res = res + "segment " + s;
            if (this.segments[s]) {
                res = res + " allum�";
            } else {
                res = res + " �teint";
            }
            res = res + "\n";
        }
        return res;
    }
    
    public int getNum�ro() {
    	int somme = 0;
    	for (boolean seg : segments) {
    		if (seg) {
    			somme += 1;
    		}
    	}
    	return somme;
    }

}
