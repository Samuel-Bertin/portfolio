import java.util.*;
/**
 * 
 * @author Samuel BERTIN
 *
 */
public class Banque {
	
	private String libb�l�;
	private Map<String,CompteBancaire> comptes = new HashMap<String,CompteBancaire>();
	
	/**
	 * 
	 * @param nom libb�l� de la banque cr�e
	 */
	public Banque(String nom) {
		this.libb�l� = nom;
	}
	
	/**
	 * 
	 * @return libb�l� de la banque
	 */
	public String getLibb�l�() {
		return this.libb�l�;
	}
	
	/**
	 * 
	 * @param n num�ro de compte ouvert
	 * @param v valeur du cr�dit ajout�
	 */
	public void ouvrir(String n, float v) {
		this.comptes.put(n, new CompteBancaire(n));
		this.comptes.get(n).d�poser(v);
	}
	
	/**
	 * 
	 * @param n num�ro de compte
	 */
	public void fermer(String n) {
		this.comptes.remove(n);
	}
	
	/**
	 * 
	 * @param n num�ro de compte cr�dit�
	 * @param v montant du cr�dit
	 */
	public void d�poser(String n, float v) {
		this.comptes.get(n).d�poser(v);
	}
	
	/**
	 * 
	 * @param n num�ro de compte d�bit�
	 * @param v montant du d�bit
	 */
	public void retirer(String n, float v) {
		this.comptes.get(n).retirer(v);
	}
	
	/**
	 * 
	 * @param n num�ro de compte recherch�
	 * @return true si existe
	 */
	public boolean compteExiste(String n) {
		return this.comptes.get(n) instanceof Compte;
	}
	
	/**
	 * 
	 * @param n num�ro de compte recherch�
	 * @return num�ro de compte recherch�
	 */
	public Compte getCompte(String n) {
		return this.comptes.get(n);
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		String chaine = this.libb�l�;
		for (String i : comptes.keySet()) {
			  chaine += "\n"+this.getCompte(i).toString();
			}
		return chaine;
	}
	
	/**
	 * 
	 * @return Num�ro de compte + cr�dit / d�bit et solde
	 */
	public String afficherDebiteurs() {
		String chaine = "\n Comptes D�biteurs : \n";
		for (CompteBancaire i : comptes.values()) {
			if (i.solde() < 0) {
				chaine += i.toString()+" Solde :"+i.solde();
			}
		}
		return chaine;
	}
}
