package Metodos_Arrays;

import javax.swing.JOptionPane;
public class Ud6_8APP {
	//Aplicacion que solicita numeros para crear un array de 10 posiciones e imprime en consola el indice y el valor al que corresponde. 
	
	//Imprime en pantalla el resultado del array, index y valor
	public static void mostrarArray(double[] numeros) {
		for(int i=0;i<10;i++) {
			System.out.println(i+":"+numeros[i]);
		}
	}
	
	//Solicita datos de entrada y crea un array
	public static void crearArray() {
		double[] numeros;
		String entrada;
	
		numeros= new double[10];
		
		for(int i=0;i<10;i++) {
			do {
			entrada=JOptionPane.showInputDialog((i+1)+" de 10: "+"Ingresa un numero: ");
			}while(!(entrada.matches("[0-9]*")));
			numeros[i]=Double.parseDouble(entrada);
		}
		
		mostrarArray(numeros);
	}
	
	public static void main(String args[]) {
		crearArray();
	}
}
