import java.util.*;

public class Binome {
	
	//ATTRIBUTS
	private String nom;
	private EspaceDeTravail repertoire ;
	private List<Activité> listeActivités;
	private Map<String,Activité> activités;
	
	
	//CONSTRUCTEURS
	public Binome() throws IllegalArgumentException {
		this.repertoire = new EspaceDeTravail();
		this.setRepertoire(this.repertoire);
		//On a crée temporairement une liste vide
	    this.listeActivités = new ArrayList<Activité>();
	}
	
	public Binome(String s) throws IllegalArgumentException {
		//On a crée temporairement une liste vide
	    this.activités = new HashMap<String,Activité>();
		this.setNom(s);
	}
	
	//GETTERS
	public EspaceDeTravail getRepertoire() {
		return this.repertoire ;
	}
	
	public List<Activité> getListeActivités() {
		return this.listeActivités;
	}
	
	public Map<String,Activité> getActivités() {
		return this.activités;
	}
	
	public Activité getActivité(String s) {
		return this.activités.get(s);
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

	public void addActivité(Activité a) throws IllegalArgumentException {
		//on vérifie que l'activté associé ajoutée existe
		if (a == null) {
			throw new IllegalArgumentException("L'activité ajoutée doit exitster.");
		}
		//si elle existe on l'ajoute a la liste
		this.listeActivités.add(a);
		//on vérifie la binaviguabilité
		if (!a.getListeBinomes().contains(this)) {
			a.addBinome(this); //si elle n'est pas assurée on l'assure
		}
	}
	
	public void setRepertoire(EspaceDeTravail e) throws IllegalArgumentException {
		if (this.repertoire == null) {
			throw new IllegalArgumentException("Espace de Travail ");
		}
		this.repertoire = e ;
	}
	
	public void putActivité(Activité a) throws IllegalArgumentException {
		//on vérifie que l'activté associé ajoutée existe
		if (a == null) {
			throw new IllegalArgumentException("L'activité ajoutée doit exitster.");
		}
		//si elle existe on l'ajoute a la liste
		this.activités.put(a.getNom(),a);
		//on vérifie qu'un binome est lié a l'activité ajoutée  (binaviguabilité)
		if (a.getBinome(this.nom) != this) {
			//si elle n'est pas assurée on l'assure
			a.putBinome(this); 
		}
	}
}
