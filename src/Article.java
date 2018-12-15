
public class Article implements SpecifArticle, Comparable <Article> {
	
	private String designation; 
	private int quantite; 
	private double prixHT; 
	final double tauxTVA=1.196;
	
	
	
	// constructeur 
	public Article(String ch, int q, double p) {
		 this.designation = ch;
		 this.quantite= q; 
		 this.prixHT=p; 
	}

	@Override
	public String getDesignation() {
				return this.designation;
	}

	@Override
	public int getQuantit�() {
				return this.quantite;
	}

	@Override
	public double getPrixHT() {
				return this.prixHT;
	}

	@Override
	public double getPrixTTC() {
				return this.prixHT*getTauxTVA();
	}

	@Override
	public void ajouter(int q) {
		quantite= getQuantit�()+q;
	}
	
	/*public boolean stockInsuffissant(int q) {
		return (q<= this.quantite); 
		}*/

	
	@Override
	public void retirer(int q) {
		//throws stockInsuffissant();
		if (q> this.quantite) { 
			 new stockInsuffissant();
			} 
		quantite= getQuantit�()-q;
	}

	@Override
	 public double getTauxTVA() {
				return this.tauxTVA;
	}
	
	@Override
	public String toString() {
		return this.getDesignation()
				+"; "
				+ getPrixTTC()
				+" euros ("
				+ this.getQuantit�()
				+ " en stock )";
	
	}

	@Override
	public int compareTo(Article o) {
		if(this.getDesignation() != (o.getDesignation())){
		     //System.out.println("les deux articles sont diff�rents"); 
			return -1;
		}
		    else
		      if(this.getDesignation()==(o.getDesignation())){
		    //System.out.println(this.getDesignation() + "est �gal � " + o.getDesignation()); 
		    	  return 0;
		   }
		//System.out.println(this.getDesignation() + "est superieur � " + o.getDesignation()); 
		return +1;	
	}
	public int compareTo(objet o) {
		return this.toString().compareTo (o.toString()); 
	}

	public String getNumeroISBN() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}