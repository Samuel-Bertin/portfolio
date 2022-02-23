/**
 * 
 * @author Samuel BERTIN
 *
 */
public class PorteOu extends Porte {
/**
 * 	
 * @param b1 entr�e1
 * @param b2 entr�e2
 */
    public PorteOu(boolean b1, boolean b2) {
    	super(b1,b2);
    }
/**
 * Cr�e une porte Ou dont les entr�es sont � Faux
 */
    public PorteOu() {
    	super(false, false);
    }
/**
 * �tat de sortie de la porte
 */
    public boolean sortie() {
    	return this.getEntr�e1() || this.getEntr�e2();
    }
 
/**
 * retourne l'�tat de la porte sous forme de chaine de caracteres
 */
    public String toString() {
    	if ( (this.getEntr�e1() || this.getEntr�e2()) == true ) {
    		return "True";
    	} else {
    		return "False";
    	}
    }
}
