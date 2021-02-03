package JavaBasic;

public class Ud4_5APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Declaracion y asignacion de variables
		int A=2,B=4,C=6,D=8;
		
		//Impresion por consola de valor inicial de las variables
		System.out.println("El valor de A es: "+A);	
		System.out.println("El valor de B es: "+B);	
		System.out.println("El valor de C es: "+C);	
		System.out.println("El valor de D es: "+D);
		
		/* Cambio de valores entre las variables
		 B tome el valor de C
		 C tome el valor de A
		 A tome el valor de D
		 D tome el valor de B*/
		
		B=B+C;
		C=B-C;
		B=B-C;
		
		A=A+D;
		D=A-D;
		A=A-D;
		
		C=C+D;
		D=C-D;
		C=C-D;
		
		//Impresion por consola del cambio en las variables
		System.out.println("\nEl valor de A es: "+A);	
		System.out.println("El valor de B es: "+B);	
		System.out.println("El valor de C es: "+C);	
		System.out.println("El valor de D es: "+D);	
		
		

	}}
