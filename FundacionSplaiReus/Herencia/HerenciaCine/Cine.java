package HerenciaCine;

public class  Cine {
	
	
	
	public static int precioEntrada;
	public static Espectador[] espectadores;
	public static Asientos[][] puestoCine=new Asientos[8][8];  
	
	
	
	public static void main(String args[]) {
		
		//Genera Precio de entrada a cine
		 precioEntrada=generarPrecioEntrada();
		//Genera datos aleatorio de la pelicula
		 Peliculas pelicula=new Peliculas();
		//Genera 20 espectadores aleatorios
		 espectadores=crearEspectadores();
		//Evalua si el espectador de la lista cumple los requisitos de la pelicula
		 generarIngresoCine(espectadores,pelicula);
		
		//Imprime titulo de la pelicula, precio entrada, edad minima
		 System.out.println("la funcion del dia es "+pelicula.getTitulo()+", el precio de entrada es de "+precioEntrada+" Euros,"
		 		+ " y la edad minima es de "+pelicula.getEdadMinima());
		 
		 //Imprime listados de especatores
		 System.out.println(espectadores.toString());
		 
		 //Imprime informacion de la ocupacion de cada asiento de la sala
		 imprimirAsientos();
	
		 
	}
	
	//Genera precio aleatorio para la entrada
	public static int generarPrecioEntrada() {
		return (int)(Math.round((Math.random()*5)+3));
	}
	
	//Crea espectadores
	public static Espectador[] crearEspectadores() {
		
		Espectador[] espectador=new Espectador[20];
		for(int i=0;i<20;i++) {
		espectador[i]=new Espectador();
		}
		
		return espectador;
	}
	
	//Evalua el ingreso de los espectadores
	public static void  generarIngresoCine(Espectador[] cliente,Peliculas movie) {
		boolean requisito;
		int ok;
		
		ok=0;
		for(int i=0;i<cliente.length;i++) {
			requisito=true;
			
			if(cliente[i].getEdad()<movie.getEdadMinima()) {
				requisito=false;
			}else if(cliente[i].getDinero()<precioEntrada) {
				requisito=false;
			}
			
			if(requisito==true) {
				ok+=1;
				asignarAsiento(cliente[i]);
			}
		}
		System.out.println("Hay "+cliente.length+" Espectadores, pero tan solo "+ok+" cumple requisitos para ingresar");
	}
	
	
	//Asigna asiento a los espectadores que cumple los requisitos de ingreso
	public static void asignarAsiento(Espectador cliente) {
		char columna;
		int fila, numColumna;
		
		do {
		numColumna=(int)(Math.round((Math.random()*7)+65));
		columna=(char)numColumna;
		fila=(int)(Math.round((Math.random()*7)));
		
		if(puestoCine[fila][numColumna-65]!=null) {
			if(puestoCine[fila][numColumna-65].estaOcupado()) {
				System.out.println("El asiento "+puestoCine[fila][numColumna-65].getColumna()+puestoCine[fila][numColumna-65].getFila()+" esta ocupado");
			}
		}
		
		}while((puestoCine[fila][numColumna-65]!=null)?puestoCine[fila][numColumna-65].estaOcupado():false );
		
		puestoCine[fila][numColumna-65]=new Asientos(columna,fila,cliente);
		
		
	}
	
	
	//Imprime por consola el estado de ocupacion de los asientos del cine
	public static void imprimirAsientos() {
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
			System.out.println(puestoCine[i][j]);
			}
		}
	}
	
	
}
