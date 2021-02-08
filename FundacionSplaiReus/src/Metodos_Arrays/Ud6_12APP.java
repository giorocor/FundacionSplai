package Metodos_Arrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ud6_12APP {
	/*Aplicacion que crea un array que contiene numeros terminados en el digito indicado 
	 * por usuario a partir de un array del tamaño indicado por usuario 
	 * que contiene numeros aleatorios entre 1 y 300
     */
	
	//Crea un array con valores aleatorio entre 1 y 300 del tamaño indicado por el usuario
	public static void crearArray(String pocisiones, String digito) {
		//Array para numeros aleatorio y variable i para guardar el tamaño del array
		int[] array1, array2;
		int i, n;
		String numero;
		
		i=Integer.parseInt(pocisiones);
		n=1;
		//inicializa aray con el tamaño indicado por el usuario
		array1= new int[i];
		array2= new int[i];
		
		//Recorre y rellena cada pocision del array con numero aleatorio entre 1 y 300
		for(int j=0;j<array1.length;j++) {
			array1[j]=(int)(Math.round(((Math.random()*300)+1)));
			numero=String.valueOf(array1[j]);
		
		//evalua si el numero aleatorio contiene el digito al final y lo asigna a nuevo array
			if(numero.endsWith(digito)) {
				array2[n]=array1[j];
				n++;
			}
		}
		
		JOptionPane.showMessageDialog(null, Arrays.toString(array2));
	}
	
	public static String solicitarDigito() {
		String digito;
		
		//Solicita a usuario el digito con el que desea termine los numeros aleatorio
		digito=JOptionPane.showInputDialog("Indica un digito con el que quieres que termine los numeros aleatorio de una lista");
	
		//Evalua que el valor ingresado por el usuario sea un numero
		if(!digito.matches("[0-9]*")) {
			JOptionPane.showMessageDialog(null,"ERROR: Ingresa un valor numerico");
			System.exit(0);
			return "";
		}else {
			return digito;
		}
	
	}
	
	public static String solicitarTamaño() {
		String pocisiones;
		
		//Solicita a usuario el tamaño del array a crear
		pocisiones=JOptionPane.showInputDialog("Indica la cantidad de pocisiones que tendra la lista de numeros");
	
		//Evalua que el valor ingresado por el usuario sea un numero
		if(!pocisiones.matches("[0-9]*")) {
			JOptionPane.showMessageDialog(null,"ERROR: Ingresa un valor numerico");
			System.exit(0);
			return "";
		}else {
			return pocisiones;
		}
	
	}
	
	public static void main(String args[]) {
		String tamaño,digito;
		tamaño=solicitarTamaño();
		digito=solicitarDigito();
		
		//Ejecuta el metodo solicitar tamaño para obtener el valor que requiere el metodo crearArray
		crearArray(tamaño,digito);

	}

}
