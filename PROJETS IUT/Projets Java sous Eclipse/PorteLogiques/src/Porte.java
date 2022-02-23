/**
 * 
 * @author Samuel BERTIN
 *
 */
public abstract class Porte {

    private boolean b1;
    private boolean b2;
/**
 * 
 * @param b1 booléen1 en entrée
 * @param b2 booléen25 en entrée
 */
    public Porte(boolean b1, boolean b2) {
    	this.setB1(b1);
    	this.setB2(b2);
    }
/**
 *     
 * @param value nouvelle valeur de l'entrée 1
 */
    public void setB1(boolean value) {
        this.b1 = value;
    }
/**
 * 
 * @param value nouvelle valeur de l'entrée 2
 */
    public void setB2(boolean value) {
        this.b2 = value;
    }
/**
 * 
 * @return valeur entrée1
 */
    public boolean getEntrée1() {
    	return this.b1;
    }
/**
 * 
 * @return valeur entrée2
 */
    public boolean getEntrée2() {
    	return this.b2;
    }
/**
 * 
 * @return état de sortie de la porte
 */
    public abstract boolean sortie();
    

}
