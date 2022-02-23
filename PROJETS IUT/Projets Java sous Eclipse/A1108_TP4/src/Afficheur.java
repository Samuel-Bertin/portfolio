public interface Afficheur {

    public abstract boolean estSegmentAllum�(int s)
            throws IllegalArgumentException;

    public abstract void allumerSegment(int s) throws IllegalArgumentException;

    public abstract void �teindreSegment(int s) throws IllegalArgumentException;
    
    public abstract int getNum�ro();

    /*
     * 
     * (P1) estSegmentAllum� (unAfficheur, s) = faux
     * 
     * (P2) estSegmentAllum� (allumerSegment (a, s), s�) = si s = s� alors vrai
     * sinon estSegmentAllum� (a, s�)
     * 
     * (P3) estSegmentAllum� (�teindreSegment (a, s), s�) = si s = s� alors faux
     * sinon estSegmentAllum� (a, s�)
     */

}
