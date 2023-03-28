package movieSortBeta;

public class Terror extends Filme {
	
	private String saturno; 
	
	public Terror(String nome, String genero, String sinopse, String[] atores, double imdb, int ano, String saturno ) {
		super(nome, genero, sinopse, atores, imdb, ano);
		
		this.saturno = saturno;
		
		
		
	}

}
