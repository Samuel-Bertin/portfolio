
public interface Duree {
	
	//Opérations
	
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
		 * Propriétés
		(P1) heures (uneDurée (h, m, s)) = h
		(P2) minutes (uneDurée (h, m, s)) = m
		(P3) secondes (uneDurée (h, m, s)) = s
		(P4) égal (uneDurée(h1, m1, s1), uneDurée(h2, m2, s2)) = h1 = h2 et m1 = m2 et s1 = s2
		(P5) inf (uneDurée(h1, m1, s1), uneDurée(h2, m2, s2)) = h1 < h2 ou (h1 = h2 et m1 < m2) ou (h1 = h2 et m1 = m2 et s1 < s2)
		(P6) ajouterUneSeconde (uneDurée(h, m, s)) = si s < 59 alors uneDurée (h, m, s+1)
				sinon si m < 59 alors uneDurée (h, m+1, 0)
				sinon uneDurée (h+1, 0, 0)
		 */
}
