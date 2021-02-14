package HerenciaSeries;

public class Serie implements Entregable {

	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
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
		this.genero = "";
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
	
	

	//Metodos de interface
	public 	boolean entregar() {
		this.entregado=true;
		return this.entregado;
	}
	
	public boolean devolver() {
		this.entregado=false;
		return this.entregado;
	}
	
	public boolean isEntregado() {
		return this.entregado;
	}
	
	
	public Serie compareTo(Serie object) {
		return (this.getNumeroTemporadas()>object.getNumeroTemporadas())?this:object;
	}

	
	
	
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}

	

	
	
	
}
