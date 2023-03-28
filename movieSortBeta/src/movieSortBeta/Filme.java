package movieSortBeta;

public abstract class Filme {
	
	private String nome, genero, sinopse;
	private String[] atores = {"",""};
	private double imdb;
	private int ano;
	
	public Filme(String nome, String genero, String sinopse, String[] atores, double imdb, int ano) {
		this.nome = nome;
		this.genero = genero;
		this.sinopse = sinopse;
		this.atores = atores;
		this.imdb = imdb;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String[] getAtores() {
		return atores;
	}

	public void setAtores(String[] atores) {
		this.atores = atores;
	}

	public double getImdb() {
		return imdb;
	}

	public void setImdb(double imdb) {
		this.imdb = imdb;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
	
}
