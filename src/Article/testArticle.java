package Article;

public class testArticle {

	public static void main(String[] args) {
		Article a = new Article("Abat-jour", 200, 25.0); 
		Article b = new Article("Abat-jour", 200, 25.0);
		a.ajouter(1);
		a.retirer(4);
		
		System.out.println(a.getDesignation().compareTo (b.getDesignation()));
		System.out.println(a.toString().compareTo (b.toString()));
		
		
		//System.out.println(a.getQuantité());
		//System.out.println(a);
		
		//Article a= new livre("toto", 100, 10.0, 0, null);
		
		
	}
	

}
