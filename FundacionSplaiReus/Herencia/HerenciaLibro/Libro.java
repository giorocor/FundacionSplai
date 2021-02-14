package HerenciaLibro;

public class Libro {
	
	private long isbn;
	private String titulo;
	private String autor;
	private int numeroDePaginas;
	
//getter and setter	
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	
	
	public Libro(long isbn, String titulo, String autor, int numeroDePaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
	}


	@Override
	public String toString() {
		return "El libro titulado "+ titulo +" con ISBN["+ isbn + "] creado por "+ autor + " tiene "+ numeroDePaginas + " paginas";
	}
	
	
	
	
}
