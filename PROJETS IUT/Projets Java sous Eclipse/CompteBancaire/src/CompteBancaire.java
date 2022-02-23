/**
 * 
 * @author Samuel BERTIN
 * @version 
 */
public class CompteBancaire extends Compte {
	
	/**
	 * numéro du compte bancaire
	 */
	private String numéro;
	
	/**
	 * Crée un compte bancaire vide
	 */
	public CompteBancaire(String n) {
		this.numéro = n;
	}
	
	/**
	 * retourne le numéro de compte bancaire
	 */
	public String getNuméro() {
		return this.numéro;
	}
	
	/**
	 * Créer une chaine de caractères réprésentant le compte bancaire
	 */
	@Override
	public String toString() {
		return "Numéro : "+this.getNuméro()+super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numéro == null) ? 0 : numéro.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof CompteBancaire))
			return false;
		CompteBancaire other = (CompteBancaire) obj;
		if (numéro == null) {
			if (other.numéro != null)
				return false;
		} else if (!numéro.equals(other.numéro))
			return false;
		return true;
	}
	
	
	/**
	 * vérifie l'égalité entre deux comptes bancaires
	 *//*
	@Override
	public boolean equals(Object c) {
		if (c == null) {
			return false;
		}
		if ( this == c) {
			return true;
		}
		if (!(c instanceof CompteBancaire)) {
			return false;
		} else {
			return (this.numéro == ((CompteBancaire)c).getNuméro());
		}
	}*/
}		
