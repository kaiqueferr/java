package movieSortBeta;

public class Comedia extends Filme {
	
	private String emmy ; 
	
	public Comedia(String nome, String genero, String sinopse, String[] atores, double imdb, int ano, String emmy ) {
		super(nome, genero, sinopse, atores, imdb, ano);
		
		this.emmy = emmy;
		
		
		
	}

}
