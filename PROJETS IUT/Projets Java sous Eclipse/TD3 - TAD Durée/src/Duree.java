
public interface Duree {
	
	//Op�rations
	
	//Consultation
	public abstract int getHeures();
	public abstract int getMinutes();
	public abstract int getSecondes();
	public abstract boolean egal(Duree d);
	public abstract boolean inf(Duree d);
	public abstract String toString();
	
	//Modification
	public abstract void ajouterUneSeconde();
	
		/*
		 * Propri�t�s
		(P1) heures (uneDur�e (h, m, s)) = h
		(P2) minutes (uneDur�e (h, m, s)) = m
		(P3) secondes (uneDur�e (h, m, s)) = s
		(P4) �gal (uneDur�e(h1, m1, s1), uneDur�e(h2, m2, s2)) = h1 = h2 et m1 = m2 et s1 = s2
		(P5) inf (uneDur�e(h1, m1, s1), uneDur�e(h2, m2, s2)) = h1 < h2 ou (h1 = h2 et m1 < m2) ou (h1 = h2 et m1 = m2 et s1 < s2)
		(P6) ajouterUneSeconde (uneDur�e(h, m, s)) = si s < 59 alors uneDur�e (h, m, s+1)
				sinon si m < 59 alors uneDur�e (h, m+1, 0)
				sinon uneDur�e (h+1, 0, 0)
		 */
}
