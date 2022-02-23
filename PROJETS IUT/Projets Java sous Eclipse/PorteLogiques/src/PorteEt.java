/**
 * 
 * @author Samuel BERTIN
 *
 */
public class PorteEt extends Porte {
/**
 * 
 * @param b1 entr�e1
 * @param b2 entr�e2
 */
    public PorteEt(boolean b1, boolean b2) {
    	super(b1,b2);
    }
/**
 *  Cr�e une porte ET initialis�e � FAUX
 */
    public PorteEt() {
    	super(false, false);
    }
/**
 * retourne l'�tat de la porte
 */
    public boolean sortie() {
    	return this.getEntr�e1() && this.getEntr�e2();
    }
/**
 * retourne l'�tat de la porte sous forme de chaine de caract�res
 */
    public String toString() {
    	if ( (this.getEntr�e1() && this.getEntr�e2()) == true ) {
    		return "True";
    	} else {
    		return "False";
    	}
    }
}
