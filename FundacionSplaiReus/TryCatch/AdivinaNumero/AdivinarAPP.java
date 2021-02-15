package AdivinaNumero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinarAPP{
		public static int numAdivinar;
		public static int numUsuario;
		
		public static void main(String arg[]) {
		 empezar();
			
		}
		
		public static void empezar() {
			int intentos;
			Scanner scan=new Scanner(System.in);
			numAdivinar=crearAleatorio();
			intentos=1;
			
			do {
				
				try {
					mensaje("Adivina el numero. Ingresa un numero de 1 a 500 \n");
					numUsuario = scan.nextInt();
					//numUsuario = Integer.parseInt(solicitarNumDeUsuario());
					compararNumero(numUsuario, intentos);
					intentos+=1;
				}catch(InputMismatchException e){
					mensaje("¡Cuidado! Solo puedes insertar números. ");
					scan.next();
				}finally {
					intentos+=1;
					numUsuario =0;  
				}
				
			}while(numUsuario!=numAdivinar);
			
			
			
		}
		
		
		public static int crearAleatorio() {
			return ((int)Math.round((Math.random()*500)+1));
		}
		
		public static void compararNumero(int numero, int intentos) {
			
			if(numUsuario>numAdivinar) {
				mensaje("El numero secreto es menor al ingresado");
			}else if(numUsuario<numAdivinar){
				mensaje("El numero secreto es mayor al ingresado");
			}else if(numUsuario==numAdivinar){
				mensaje(numAdivinar+" era el numero y lo has adivinado en "+intentos+" intentos");
			}

		}
		
		public static void mensaje(String texto) {
			System.out.println(texto);
		}
	}
