import java.util.*;

public class Binome {
	
	//ATTRIBUTS
	private String nom;
	private EspaceDeTravail repertoire ;
	private List<Activit�> listeActivit�s;
	private Map<String,Activit�> activit�s;
	
	
	//CONSTRUCTEURS
	public Binome() throws IllegalArgumentException {
		this.repertoire = new EspaceDeTravail();
		this.setRepertoire(this.repertoire);
		//On a cr�e temporairement une liste vide
	    this.listeActivit�s = new ArrayList<Activit�>();
	}
	
	public Binome(String s) throws IllegalArgumentException {
		//On a cr�e temporairement une liste vide
	    this.activit�s = new HashMap<String,Activit�>();
		this.setNom(s);
	}
	
	//GETTERS
	public EspaceDeTravail getRepertoire() {
		return this.repertoire ;
	}
	
	public List<Activit�> getListeActivit�s() {
		return this.listeActivit�s;
	}
	
	public Map<String,Activit�> getActivit�s() {
		return this.activit�s;
	}
	
	public Activit� getActivit�(String s) {
		return this.activit�s.get(s);
	}
	
	public String getNom() {
		return this.nom;
	}
	
	//SETTERS
	public void setNom(String s) {
		if (s == null) {
			throw new IllegalArgumentException("Le nom doit exister");
		}
		this.nom = s;
	}

	public void addActivit�(Activit� a) throws IllegalArgumentException {
		//on v�rifie que l'activt� associ� ajout�e existe
		if (a == null) {
			throw new IllegalArgumentException("L'activit� ajout�e doit exitster.");
		}
		//si elle existe on l'ajoute a la liste
		this.listeActivit�s.add(a);
		//on v�rifie la binaviguabilit�
		if (!a.getListeBinomes().contains(this)) {
			a.addBinome(this); //si elle n'est pas assur�e on l'assure
		}
	}
	
	public void setRepertoire(EspaceDeTravail e) throws IllegalArgumentException {
		if (this.repertoire == null) {
			throw new IllegalArgumentException("Espace de Travail ");
		}
		this.repertoire = e ;
	}
	
	public void putActivit�(Activit� a) throws IllegalArgumentException {
		//on v�rifie que l'activt� associ� ajout�e existe
		if (a == null) {
			throw new IllegalArgumentException("L'activit� ajout�e doit exitster.");
		}
		//si elle existe on l'ajoute a la liste
		this.activit�s.put(a.getNom(),a);
		//on v�rifie qu'un binome est li� a l'activit� ajout�e  (binaviguabilit�)
		if (a.getBinome(this.nom) != this) {
			//si elle n'est pas assur�e on l'assure
			a.putBinome(this); 
		}
	}
}
