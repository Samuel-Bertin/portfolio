
public interface Rationnel {

	//Construction pas dans interface
	
	//op�rations de consultation - TAD en entr�e unqiuement
	
		//num�rateur
		public abstract int getNum�rateur();
		
		//d�nonominateur
		public abstract int getD�nominateur();
		
	// op�rations d'�valuation - TAD en entr�e et en sortie (retourne une nouvelle instance du TAD)
		
		//somme
		public abstract Rationnel somme(Rationnel r2);
		
		//produit
		public abstract Rationnel produit(Rationnel r2);
		
		//division 
		public abstract Rationnel division(Rationnel r2);
		
		//reduction
		public abstract Rationnel r�duction();
	
	// op�rations de modification (modifie un object du type TAD en entr�e sans rien retourner)
			

}
