package Metodos_Arrays1;

import javax.swing.JOptionPane;

public class Ud6_9APP {
	//Aplicacion que Crea un array de números aleatorio(entre 0 y 9) del tamaño indicado por el usuario

	//Imprime en pantalla el resultado del array, index y valor; imprime la suma de los valores del array
	public static void mostrarArray(int[] numeros) {
		//declaracion variable para guardar la suma del array
		int totalSuma;
		
		totalSuma=0;
		//Recorre el array y va impriendo cada pocision y acumulando la suma de los valores
		for(int i=0;i<numeros.length;i++) {
			System.out.println(i+":"+numeros[i]);
			totalSuma+=numeros[i];
		}
		//Imprime la suma de los valores del array
		System.out.println("El total de la suma de todo los valores del array es: "+totalSuma);
	}
	
	//Crea un array con valores aleatorio entre 0 y 9 del tamaño indicado por el usuario
	public static void crearArray(String pocisiones) {
		//Array para numeros aleatorio y variable i para guardar el tamaño del array
		int[] numeros;
		int i;
		
		i=Integer.parseInt(pocisiones);
		numeros= new int[i];
		
		//Recorre y rellena cada pocision del array con numero aleatorio entre 0 y 9
		for(int j=0;j<numeros.length;j++) {
			numeros[j]=(int)(Math.round((Math.random()*9)));
		}
		//Invoca metodo para imprimir en consola
		mostrarArray(numeros);
	}
	
	public static void main(String args[]) {
		String pocisiones;
		
		//Solicita a usuario el tamaño del array a crear
		pocisiones=JOptionPane.showInputDialog("Indica la cantidad de pocisiones que tendra tu lista de numeros");
		//Evalua que el valor ingresado por el usuario sea un numero
		if(!pocisiones.matches("[0-9]*")) {
			JOptionPane.showMessageDialog(null,"ERROR: Ingresa un valor numerico");
			System.exit(0);
		}
		
		crearArray(pocisiones);
	}
	

}
