import java.util.List;

public abstract class Module {

	private String libelle;

	public Module(String s) {
		this.libelle = s;
	}

	public String getLibelle() {
		return this.libelle;
	}
	
	public abstract float moyenne(List<Float> notes);
	
}