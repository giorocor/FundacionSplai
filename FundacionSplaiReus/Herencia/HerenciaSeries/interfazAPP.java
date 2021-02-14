package HerenciaSeries;

import java.util.Arrays;

public class interfazAPP {
	//Crear Arrays de series y videojuegos
	public static Serie[] serie= new Serie[5];
	public static VideoJuego[] videoJuego = new VideoJuego[5];
	
	
	public static  void main(String[] args) {
		
		//Crear Arrays
		serie=arraySeries(serie);
		videoJuego=arrayVideoJuego(videoJuego);
		
		//Ejecuta metodo entregar
		serie[0].entregar();
		videoJuego[0].entregar();
		
		//imprime las series
		imprimir();
		
		//imprime numero de series entregadas
		System.out.println("Cantidad de Series Entregadas: "+contarEntregadosS(serie));
		
		//imprime el videojuego y serie con mas horas y temporadas
		comparar();

		
	}
	
	public static void comparar() {
		VideoJuego masTemporadas=new VideoJuego();
		for(int i=0;i<5;i++) {
			masTemporadas=videoJuego[i].compareTo(masTemporadas);
		}
		
		Serie masHoras=new Serie();
		for(int i=0;i<5;i++) {
			masHoras=serie[i].compareTo(masHoras);
		}
		
		System.out.println("El video juego con mas horas es "+masHoras.getTitulo()+""
				+ "\nLa serie con mas temporadas es "+masTemporadas.getTitulo());	
	}
	
	public static void imprimir() {
		for(int i=0;i<5;i++) {
			System.out.println(serie[i]);
			}
		
		for(int i=0;i<5;i++) {
			System.out.println(videoJuego[i]);
			}
	}

	
	
	public static int contarEntregadosS(Serie[] a) {
		int serieEntregada=0;
		for(int i=0; i<a.length;i++) {
			if(a[i].isEntregado()==true) {
				serieEntregada+=1;
			}
		}
			return serieEntregada;
	}
	

//Arrays creados
	public static Serie[] arraySeries(Serie[] serie) {
		serie[0]=new Serie("matilda","luis");
		serie[1]=new Serie("The 100",12,"Ficcion","Anonimus");
		serie[2]=new Serie();
		serie[3]=new Serie("Juego de Tronos",15,"Medieval","James");
		serie[4]=new Serie();
		
		return serie;
	}
	
	public static VideoJuego[] arrayVideoJuego(VideoJuego[] videoJuego) {
		videoJuego[0]=new VideoJuego("PES 2020",100);
		videoJuego[1]=new VideoJuego();
		videoJuego[2]=new VideoJuego();
		videoJuego[3]=new VideoJuego("Call Duty",120);
		videoJuego[4]=new VideoJuego("Pokemon",50,"Aventura","NAKOMI");
		
		return videoJuego;
	}
	
	


}
