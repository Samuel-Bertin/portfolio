
public interface Rationnel {

	//Construction pas dans interface
	
	//opérations de consultation - TAD en entrée unqiuement
	
		//numérateur
		public abstract int getNumérateur();
		
		//dénonominateur
		public abstract int getDénominateur();
		
	// opérations d'évaluation - TAD en entrée et en sortie (retourne une nouvelle instance du TAD)
		
		//somme
		public abstract Rationnel somme(Rationnel r2);
		
		//produit
		public abstract Rationnel produit(Rationnel r2);
		
		//division 
		public abstract Rationnel division(Rationnel r2);
		
		//reduction
		public abstract Rationnel réduction();
	
	// opérations de modification (modifie un object du type TAD en entrée sans rien retourner)
			

}
