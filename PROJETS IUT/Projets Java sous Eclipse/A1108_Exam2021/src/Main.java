import java.util.*;
public class Main {

	public static void main (String[]args) {
		 // construction de la formation
		 // --> construire les évaluations de la formation
		 Evaluation m1e1 = new Ecrit("Conception par objets ", 0.6F);
		 Evaluation m1e2 = new Qcm("Définitions termes objets ", 0.1F, 15);
		 Evaluation m1e3 = new Qcm("diagramme de classes ", 0.1F, 20);
		 Evaluation m1e4 = new Oral("La délégation ", 0.2F, true);
		 Evaluation m2e1 = new Ecrit("Conception objets en Java ", 0.6F);
		 Evaluation m2e2 = new Qcm("Structures de contrôle Java ", 0.4F, 12);
		 // --> construire les listes d'évaluations par module
		 List<Evaluation> m1e = new ArrayList<>();
		 m1e.add(m1e1);
		 m1e.add(m1e2);
		 m1e.add(m1e3);
		 m1e.add(m1e4);
		 List<Evaluation> m2e = new ArrayList<>();
		 m2e.add(m2e1);
		 m2e.add(m2e2);
		 // --> construire les modules associés à leurs évaluations
		 Module m1 = new Competence("Concepts objets ", m1e);
		 Module m2 = new Competence("Programmation Java ", m2e);
		 Module m3 = new Projet("Etude de cas ");
		 // --> construire la liste des modules de la formation
		 List<Module> m = new ArrayList<>();
		 m.add(m1);
		 m.add(m2);
		 m.add(m3);
		 // --> construire la formation
		 Formation poo = new Formation("PROGRAMMATION ORIENTEE OBJETS", m);
		 // construction et édition d'un relevé de notes
		 // --> construire la liste des notes par module de l’apprentie
		 List<Float> nm1 = new ArrayList<>();
		 nm1.add(15F);
		 nm1.add(12.75F);
		 nm1.add(6.25F);
		 nm1.add(11F);
		 List<Float> nm2 = new ArrayList<>();
		 nm2.add(11F);
		 nm2.add(10F);
		 List<Float> nm3 = new ArrayList<>();
		 nm3.add(9F);
		 nm3.add(13F);
		 nm3.add(14F);
		 // --> construire la liste des listes de notes par module	
		 List<List<Float>> notes = new ArrayList<>();
		 notes.add(nm1);
		 notes.add(nm2);
		 notes.add(nm3);
		 // --> demander à la formation d'éditer le relevé de notes
		 System.out.println(poo.editerReleveNotes("Christine JULIEN", notes));
	}
}
