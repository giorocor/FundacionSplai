package POO;

public class Serie {
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	//variables constantes
	static final int TEMPORADA=3;
	static final boolean ENTREGADO= false;

	
	//constructores
	public Serie() {
		this.titulo = "null";
		this.numeroTemporadas = TEMPORADA;
		this.entregado = ENTREGADO;
		this.genero = "null";
		this.creador = "null";
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.numeroTemporadas = TEMPORADA;
		this.entregado = ENTREGADO;
		this.genero = "null";
	}

	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

	

	//Getter and Setter
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public static int getTemporada() {
		return TEMPORADA;
	}



	

	
}
