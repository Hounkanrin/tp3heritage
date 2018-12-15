package Article;

public interface SpecifArticle {
	
	// d�signation de l'article	
		public String getDesignation();
		
	//quantit� en stock
		public int getQuantit�(); 
		
	// prix H T 
		public double getPrixHT(); 
		
	// prix TTC = prix HT * taux de TVA (1.196)
		public double getPrixTTC();
	
	// augmenter le stock de la quantit� q 
		public void ajouter(int q); 
	
	// r�duire le stock de la qunatit� q 
		public void retirer(int q); //throws stockInsuffissantException;
	
	//taux de TVA en vigueur pour l'article 
		
	public double getTauxTVA();

	int compareTo(Article o);

	//String getNumeroISBN();

	
		
	
	
	

}
