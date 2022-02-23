import java.util.List;

public class Projet extends Module {
	
	Projet(String s) {
		super(s);
	}
	
	public float moyenne(List<Float> notes) {
		float somme = 0;
		for (Float i : notes) {
			somme += i;
		}
		return somme/notes.size();
	}	
}
