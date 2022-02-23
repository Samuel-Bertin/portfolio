import java.util.*;
public class Activité {
	
	//ATTRIBUTS
	private String nom;
	private List <Binome> listeBinomes ;
	private Map <String,Binome> binomes ;
	
	//CONSTRUCTEURS
	public Activité(Binome b) throws IllegalArgumentException {
		this.listeBinomes = new ArrayList<Binome>();
		this.addBinome(b);
	}
	
	public Activité(Binome b, String s) throws IllegalArgumentException {
		this.binomes = new HashMap<String,Binome>();
		this.putBinome(b);
		this.nom = s;
	}
	
	//GETTERS
	public List<Binome> getListeBinomes() {
		return this.listeBinomes;
	}
	
	public Map<String,Binome> getBinomes() {
		return this.binomes;
	}
	
	public Binome getBinome(String s) {
		return this.binomes.get(s);
	}
	
	public String getNom() {
		return this.nom;
	}
	
	//SETTERS
	public void addBinome(Binome b) throws IllegalArgumentException {
		//si le binome existe
		if (b == null) {
			throw new IllegalArgumentException("xxxxx");
		}
		// on l'ajoute a la liste
		this.listeBinomes.add(b) ;
		//on vérifie la binaviguabilité 
		if (b.getListeActivités().contains(this)) {
			b.addActivité(this); //si elle n'est pas assurée on l'assure
		}
	}
	
	public void putBinome(Binome b) throws IllegalArgumentException {
		//si le binome existe
		if (b == null) {
			throw new IllegalArgumentException("xxxxx");
		}
		// on l'ajoute a la liste
		this.binomes.put(b.getNom(), b) ;
		//on vérifie qu'une activité est lié au binome ajouté (binaviguabilité) 
		if (this != b.getActivité(this.nom)) {
			b.putActivité(this); //si elle n'est pas assurée on l'assure
		}
	}
	
	public void setNom(String s){
		this.nom = s;
	}
	
}

	
