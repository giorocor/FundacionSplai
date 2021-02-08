package Metodos_Arrays2;

import javax.swing.JOptionPane;

public class Ud6_5APP {
	//Aplicación que convierte un número en base decimal a binario. 
	
	//Organiza el binario generado revirtiendo las pocisiones
	public static String organizarBinario(String binario) {
		String salida;
		
		salida="";
		
		for(int i=binario.length()-1;i>=0;i--) {
			salida=salida+binario.charAt(i);
		}
		return salida;
	}
	
	//Divide entre 2 obtiendo los resultados del numero en binario
	public static String convertiraBinario(int num) {
		String binario;
		int byt;
		
		binario="";
	
		do {
			byt=num%2;
			num=num/2;
			
			binario=binario+String.valueOf(byt);
			
			
			if(num==1 || num==0) {
			binario=binario+String.valueOf(num);
			}	
		}while((num/2)>0);
		
		return binario;
	}
	
	//Solicita los datos al usuario
	public static void solicitarDatos() {
		//Declaracion de variable
		String entrada, resultado;
		int num;
		
		//Iniciacion de variable
		do {
		entrada=JOptionPane.showInputDialog("Ingresa un numero para convertir a numero binario");
		}while(!(entrada.matches("[0-9]*")));
		num=Integer.parseInt(entrada);
		
		//Invoca el metodo para pasar a numero binario
		resultado=convertiraBinario(num);
		resultado=organizarBinario(resultado);
		System.out.println(resultado);
	}
	
	
	public static void main(String args[]) {
		solicitarDatos();
		
	}

}
