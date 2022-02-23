import java.util.*;
public class Formation {
		
	private String libelle;
	private List<Module> modules;
	
	public Formation(String libelle, List<Module> modules) {
		this.libelle = libelle;
		this.modules = modules;
	}
	
	public String getLibelle() {
		return this.libelle;
	}
	
	public List<Module> getModules() {
		return this.modules;
	}
	
	public String editerReleveNotes(String nom, List<List<Float>> notes) {
		String releve = "Formation : "+this.libelle+"\n" 
				+ "Releve de notes : "+nom+"\n";
		int nbModules = 0;
		float sommeMoyennes = 0;
		for (List<Float> notesModules : notes) {
			
			releve += "Module " + (nbModules + 1 ) + " : " + this.modules.get(nbModules).getLibelle() + ""
					+ "             " + this.modules.get(nbModules).moyenne(notesModules)+"\n";
			int nbNotes = 0;
			for(Float noteEvaluation : notesModules) {
				
				if (this.modules.get(nbModules) instanceof Competence) {
					releve += ((Competence) this.modules.get(nbModules)).getEvaluations().get(nbNotes).toString() + "      "+noteEvaluation+"\n";
				}
				nbNotes++;
			}
			sommeMoyennes += this.modules.get(nbModules).moyenne(notesModules);
			nbModules++;
		}
		
		releve += "MOYENNE GENERALE : "+sommeMoyennes/this.modules.size();
		return releve;
	}
}
