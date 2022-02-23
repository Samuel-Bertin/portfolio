public interface Afficheur {

    public abstract boolean estSegmentAllumé(int s)
            throws IllegalArgumentException;

    public abstract void allumerSegment(int s) throws IllegalArgumentException;

    public abstract void éteindreSegment(int s) throws IllegalArgumentException;
    
    public abstract int getNuméro();

    /*
     * 
     * (P1) estSegmentAllumé (unAfficheur, s) = faux
     * 
     * (P2) estSegmentAllumé (allumerSegment (a, s), s’) = si s = s’ alors vrai
     * sinon estSegmentAllumé (a, s’)
     * 
     * (P3) estSegmentAllumé (éteindreSegment (a, s), s’) = si s = s’ alors faux
     * sinon estSegmentAllumé (a, s’)
     */

}
