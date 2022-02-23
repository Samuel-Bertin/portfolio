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
        	this.éteindreSegment(3);
			break;
        case 1: 
			this.allumerSegment(2);
			this.allumerSegment(5);
			break;
		case 2: 
			for (int i = 0; i < 7; i++) {
				this.allumerSegment(i);
			}
			this.éteindreSegment(1);
			this.éteindreSegment(5);
			break;
		case 3:
			for (int i = 0; i < 7; i++) {
				this.allumerSegment(i);
			}
			this.éteindreSegment(1);
			this.éteindreSegment(4);
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
			this.éteindreSegment(2);
			this.éteindreSegment(4);
			break;
		case 6:
			for (int i = 0; i < 7; i++) {
				this.allumerSegment(i);
			}
			this.éteindreSegment(2);
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
			this.éteindreSegment(4);
		default:
			System.out.println("Saisir une valeur entre 0 et 9");
        }
    }
    
    /**
     * @param s numéro de segment
     * @return vrai si segment s allumé
     */
    public boolean estSegmentAllumé(int s) throws IllegalArgumentException {
        if (s < 0 || s > this.segments.length - 1) {
            throw new IllegalArgumentException("numéro de segment invalide");
        }
        return this.segments[s];
    }

    /**
     * @param s numéro de segment a allumer
     */
    public void allumerSegment(int s) throws IllegalArgumentException {
        if (s < 0 || s > this.segments.length - 1) {
            throw new IllegalArgumentException("numéro de segment invalide");
        }
        this.segments[s] = true;
    }

    /**
     * @param s numéro de segment a éteindre
     */
    public void éteindreSegment(int s) throws IllegalArgumentException {
        if (s < 0 || s > this.segments.length - 1) {
            throw new IllegalArgumentException("numéro de segment invalide");
        }
        this.segments[s] = false;
    }
    
    /**
     * afficheur sous forme de chaine de caractère
     */
    @Override
    public String toString() {
        String res = "";
        for (int s = 0; s < this.segments.length; s++) {
            res = res + "segment " + s;
            if (this.segments[s]) {
                res = res + " allumé";
            } else {
                res = res + " éteint";
            }
            res = res + "\n";
        }
        return res;
    }
    
    public int getNuméro() {
    	int somme = 0;
    	for (boolean seg : segments) {
    		if (seg) {
    			somme += 1;
    		}
    	}
    	return somme;
    }

}
