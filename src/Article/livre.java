package Article;


public class livre extends Article implements SpecifLivre {
	
	private int nombrePages; 
	private String numISBN;

	public livre(String ch, int q, double p, int n, String m) {
		super(ch, q, p);
		this.nombrePages= n;
		this.numISBN=m;
						
	}

	@Override
	public String toString() {
		return super.toString()
				+ getDesignation()
				+ getNombrePages()
				+"; "
				+ getNumeroISBN(); 
				
	}
	
	@Override
	public int getNombrePages() {
		return this.nombrePages;
	}
	
	@Override
	public String getNumeroISBN() {
		return this.numISBN;
	}

	

}
