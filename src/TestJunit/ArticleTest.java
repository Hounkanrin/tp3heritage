package TestJunit;

import org.junit.Test;

import Article.Article;

public class ArticleTest {
	
	@Test
	
	public void TesteArticle() {
		Article a = new Article("Abat-jour", 200, 25.0); 
				Article b = new Article("Abat-jour", 200, 25.0);
				a.ajouter(1);
				a.retirer(4);
				
				System.out.println(a.getDesignation().compareTo (b.getDesignation()));
				System.out.println(a.toString().compareTo (b.toString()));
				
				
				//System.out.println(a.getQuantit�());
				//System.out.println(a);
		
	}
}
