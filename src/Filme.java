public class Filme {
	
	//Atributos da classe filme
	String titulo;
	int duracao;
	String genero;
	
	//Construtor da classe Filme, com o uso dos atributos
	public Filme(String titulo, int duracao, String genero) {
		this.titulo = titulo;
		this.duracao = duracao;
		this.genero = genero;
	}
	
	//Método para pegar o título
	public String getTitulo() {
		return titulo;
	}
	
	//Método para colocar o novo título
	public void setTitulo(String titulo) {
		this.titulo = titulo;
    }
	
	//Método para pegar a duração do filme
	public int getDuracao() {
		return duracao;
	}
	
	//Método para colocar a nova duração do filme
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	//Método para pegar o genero do filme
	public String getGenero() {
		return genero;
	}
	
	//Método para colocar o novo genero do filme
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String toString() {
		return "Filme" + "Título: " + titulo + "Duração em Minutos: " + duracao + "Genero: " + genero;
	}

}
