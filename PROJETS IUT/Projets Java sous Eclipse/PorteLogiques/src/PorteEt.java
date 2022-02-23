/**
 * 
 * @author Samuel BERTIN
 *
 */
public class PorteEt extends Porte {
/**
 * 
 * @param b1 entrée1
 * @param b2 entrée2
 */
    public PorteEt(boolean b1, boolean b2) {
    	super(b1,b2);
    }
/**
 *  Crée une porte ET initialisée à FAUX
 */
    public PorteEt() {
    	super(false, false);
    }
/**
 * retourne l'état de la porte
 */
    public boolean sortie() {
    	return this.getEntrée1() && this.getEntrée2();
    }
/**
 * retourne l'état de la porte sous forme de chaine de caractères
 */
    public String toString() {
    	if ( (this.getEntrée1() && this.getEntrée2()) == true ) {
    		return "True";
    	} else {
    		return "False";
    	}
    }
}
