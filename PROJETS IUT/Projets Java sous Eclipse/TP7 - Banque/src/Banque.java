import java.util.*;
/**
 * 
 * @author Samuel BERTIN
 *
 */
public class Banque {
	
	private String libbélé;
	private Map<String,CompteBancaire> comptes = new HashMap<String,CompteBancaire>();
	
	/**
	 * 
	 * @param nom libbélé de la banque crée
	 */
	public Banque(String nom) {
		this.libbélé = nom;
	}
	
	/**
	 * 
	 * @return libbélé de la banque
	 */
	public String getLibbélé() {
		return this.libbélé;
	}
	
	/**
	 * 
	 * @param n numéro de compte ouvert
	 * @param v valeur du crédit ajouté
	 */
	public void ouvrir(String n, float v) {
		this.comptes.put(n, new CompteBancaire(n));
		this.comptes.get(n).déposer(v);
	}
	
	/**
	 * 
	 * @param n numéro de compte
	 */
	public void fermer(String n) {
		this.comptes.remove(n);
	}
	
	/**
	 * 
	 * @param n numéro de compte crédité
	 * @param v montant du crédit
	 */
	public void déposer(String n, float v) {
		this.comptes.get(n).déposer(v);
	}
	
	/**
	 * 
	 * @param n numéro de compte débité
	 * @param v montant du débit
	 */
	public void retirer(String n, float v) {
		this.comptes.get(n).retirer(v);
	}
	
	/**
	 * 
	 * @param n numéro de compte recherché
	 * @return true si existe
	 */
	public boolean compteExiste(String n) {
		return this.comptes.get(n) instanceof Compte;
	}
	
	/**
	 * 
	 * @param n numéro de compte recherché
	 * @return numéro de compte recherché
	 */
	public Compte getCompte(String n) {
		return this.comptes.get(n);
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		String chaine = this.libbélé;
		for (String i : comptes.keySet()) {
			  chaine += "\n"+this.getCompte(i).toString();
			}
		return chaine;
	}
	
	/**
	 * 
	 * @return Numéro de compte + crédit / débit et solde
	 */
	public String afficherDebiteurs() {
		String chaine = "\n Comptes Débiteurs : \n";
		for (CompteBancaire i : comptes.values()) {
			if (i.solde() < 0) {
				chaine += i.toString()+" Solde :"+i.solde();
			}
		}
		return chaine;
	}
}
