package HerenciaCine;
	


public class Peliculas {
		private String titulo;
		private double duracion;
		private int edadMinima;
		private String director;
		
		private final String[] movies= {"Toy Story","SAW","Los Croods","La Maldicion"};
		private final double[] time= {1.20,2.00,1.80,2.20};
		private final int[] edad= {12,17,14,18};
		
		private final int EDADMINIMA=18;
		
		
		//CONSTRUCTOR
		public Peliculas() {
			this.titulo = AsignarPelicula();
			this.duracion = AsignarDuracion();
			this.edadMinima = AsignarEdadMinima();
			this.director = "";
		}

		public Peliculas(String titulo, double duracion) {
			super();
			this.titulo = titulo;
			this.duracion = duracion;
			this.edadMinima = EDADMINIMA;
			this.director = null;
		}
		
		public Peliculas(String titulo, double duracion, int edadMinima, String director) {
			super();
			this.titulo = titulo;
			this.duracion = duracion;
			this.edadMinima = edadMinima;
			this.director = director;
		}

		
		//Getter and Setter
		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public double getDuracion() {
			return duracion;
		}

		public void setDuracion(double duracion) {
			this.duracion = duracion;
		}

		public int getEdadMinima() {
			return edadMinima;
		}

		public void setEdadMinima(int edadMinima) {
			this.edadMinima = edadMinima;
		}

		public String getDirector() {
			return director;
		}

		public void setDirector(String director) {
			this.director = director;
		}
		
		

		
		//Metodo
		
		public String AsignarPelicula(){
			return movies[(int)(Math.round(Math.random()*3))];
		}
		
		public double AsignarDuracion(){
			return time[(int)(Math.round(Math.random()*3))];
		}
		
		public int AsignarEdadMinima(){
			return edad[(int)(Math.round(Math.random()*3))];
		}

		@Override
		public String toString() {
			return "La pelicula es " + titulo + ", con una duracion de " + duracion + " horas, y la edad minima es de " + edadMinima+" años.";
		}
		
		
		
		
		
		
}
