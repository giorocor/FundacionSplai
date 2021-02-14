package HerenciaLibro;

public class libroAPP {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro libro1= new Libro(9,"CARTEL","GIO",12);
		Libro libro2= new Libro(13,"ALICIA","GIO",123);
		
		compararCantidadPaginas(libro1,libro2);

	}
	

	public static void compararCantidadPaginas(Libro libro1, Libro libro2) {
		String comparacionPaginas;
		
		comparacionPaginas=(libro1.getNumeroDePaginas()>libro2.getNumeroDePaginas())?libro1.getTitulo():libro2.getTitulo();
		
		System.out.println(libro1+"\n"+libro2);
		System.out.println("El libro con mas paginas es "+comparacionPaginas);
		
	}

}
