/**
 * 
 * @author Samuel BERTIN
 *
 */
public class PorteOu extends Porte {
/**
 * 	
 * @param b1 entrée1
 * @param b2 entrée2
 */
    public PorteOu(boolean b1, boolean b2) {
    	super(b1,b2);
    }
/**
 * Crée une porte Ou dont les entrées sont à Faux
 */
    public PorteOu() {
    	super(false, false);
    }
/**
 * état de sortie de la porte
 */
    public boolean sortie() {
    	return this.getEntrée1() || this.getEntrée2();
    }
 
/**
 * retourne l'état de la porte sous forme de chaine de caracteres
 */
    public String toString() {
    	if ( (this.getEntrée1() || this.getEntrée2()) == true ) {
    		return "True";
    	} else {
    		return "False";
    	}
    }
}
