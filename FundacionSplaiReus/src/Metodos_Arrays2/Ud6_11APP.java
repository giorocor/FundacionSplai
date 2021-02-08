package Metodos_Arrays2;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ud6_11APP {
	/*Aplicacion que crea 2 array del tamaño indicado por usuario e interactua con ambos, 
	 * creando un tercero con el resultado de multiplicar entre los dos primeros
	 */
	public static void imprimir(int[] array1, int[] array2,int[] array3) {
		JOptionPane.showMessageDialog(null, "array1: "+Arrays.toString(array1)+"\n"+"array2: "+Arrays.toString(array2)+"\n"+"array3: "+Arrays.toString(array3)+"\n");
	}
	
	//Multiplica los valores de ambos array de acuerdo a su pocision
	public static void multiplicacionArrays(int[] array1, int[] array2) {
		int[] array3;
		
		array3=new int[array1.length];
		
		//Asigna el resultado de multiplica ambos array al array3
		for(int j=0;j<array3.length;j++) {
			array3[j]=array1[j]*array2[j];
		}
		
		imprimir(array1, array2,array3);
	}
	
	
	//Crea un array con valores aleatorio entre 0 y 9 del tamaño indicado por el usuario
	public static void crearArray(String pocisiones) {
		//Array para numeros aleatorio y variable i para guardar el tamaño del array
		int[] array1, array2;
		int i;
		
		i=Integer.parseInt(pocisiones);
		array1= new int[i];
		array2= new int[i];
		
		//Recorre y rellena cada pocision del array con numero aleatorio entre 0 y 9
		for(int j=0;j<array1.length;j++) {
			array1[j]=(int)(Math.round((Math.random()*9)));
		}
		
		array2=Arrays.copyOf(array1, array1.length);
		JOptionPane.showMessageDialog(null, "array2: "+Arrays.toString(array2));
		
		//Reasigna cada pocision del array2 con numero aleatorio entre 0 y 9
		for(int j=0;j<array2.length;j++) {
			array2[j]=(int)(Math.round((Math.random()*9)));
		}
		
		//Invoca metodo para imprimir en consola
		multiplicacionArrays(array1,array2);
	}
	
	public static void main(String args[]) {
		String pocisiones;
		
		//Solicita a usuario el tamaño del array a crear
		pocisiones=JOptionPane.showInputDialog("Indica la cantidad de pocisiones que tendra el Array");
		//Evalua que el valor ingresado por el usuario sea un numero
		if(!pocisiones.matches("[0-9]*")) {
			JOptionPane.showMessageDialog(null,"ERROR: Ingresa un valor numerico");
			System.exit(0);
		}
		
		crearArray(pocisiones);

	}
}
