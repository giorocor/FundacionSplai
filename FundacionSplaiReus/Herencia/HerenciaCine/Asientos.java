package HerenciaCine;

public class Asientos {
	private char columna;
	private int fila;
	private Espectador espectador;
	
	
	public Asientos() {
		super();
		this.columna = 0;
		this.fila = 0;
		this.espectador = null;
	}
	
	public Asientos(char columna, int fila) {
		super();
		this.columna = columna;
		this.fila = fila;
		this.espectador = null;
	}
	
	public Asientos(char columna, int fila, Espectador espectador) {
		super();
		this.columna = columna;
		this.fila = fila;
		this.espectador = espectador;
	}
	
	
	//Getter and Setter

	public char getColumna() {
		return columna;
	}

	public void setColumna(char columna) {
		this.columna = columna;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public Espectador getEspectador() {
		return espectador;
	}

	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}

	
	//Metodo
	public boolean estaOcupado() {
		return (getEspectador()!=null)?true:false;
	}
	
	
	@Override
	public String toString() {
		return "Asientos [columna=" + columna + ", fila=" + fila + ", espectador=" + espectador + "]";
	}
	
	
	
	
	
	
	
}
