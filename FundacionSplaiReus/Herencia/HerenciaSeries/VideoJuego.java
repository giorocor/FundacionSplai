package HerenciaSeries;

public class VideoJuego implements Entregable {

	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compañia;
	
	static final int HORASESTIMADAS=10;
	static final boolean ENTREGADO= false;
	
	
	//constructor
	public VideoJuego() {
		this.titulo = null;
		this.horasEstimadas = HORASESTIMADAS;
		this.entregado = ENTREGADO;
		this.genero = null;
		this.compañia = null;
	}

	public VideoJuego(String titulo, int horasEstimadas) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADO;
		this.genero = null;
		this.compañia = null;
	}

	public VideoJuego(String titulo, int horasEstimadas, String genero, String compañia) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compañia = compañia;
	}

	
	//Getter and Setter
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	
	// Metodos de interface
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
	

	public VideoJuego compareTo(VideoJuego object) {
		return (this.getHorasEstimadas()>object.getHorasEstimadas())?this:object;
	
	}
	
	
	@Override
	public String toString() {
		return "VideoJuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compañia=" + compañia + "]";
	}
	
	
	
	
	
	
	
	
}
