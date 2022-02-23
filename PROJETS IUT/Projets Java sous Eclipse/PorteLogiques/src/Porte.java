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
 * @param b1 bool�en1 en entr�e
 * @param b2 bool�en25 en entr�e
 */
    public Porte(boolean b1, boolean b2) {
    	this.setB1(b1);
    	this.setB2(b2);
    }
/**
 *     
 * @param value nouvelle valeur de l'entr�e 1
 */
    public void setB1(boolean value) {
        this.b1 = value;
    }
/**
 * 
 * @param value nouvelle valeur de l'entr�e 2
 */
    public void setB2(boolean value) {
        this.b2 = value;
    }
/**
 * 
 * @return valeur entr�e1
 */
    public boolean getEntr�e1() {
    	return this.b1;
    }
/**
 * 
 * @return valeur entr�e2
 */
    public boolean getEntr�e2() {
    	return this.b2;
    }
/**
 * 
 * @return �tat de sortie de la porte
 */
    public abstract boolean sortie();
    

}
