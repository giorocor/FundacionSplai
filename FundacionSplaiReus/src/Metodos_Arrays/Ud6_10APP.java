package Metodos_Arrays;

import javax.swing.JOptionPane;

public class Ud6_10APP {

	//Crea un array de números aleatorios primos del tamaño dado por usuario e indica el mayor de la lista


	//Imprime en pantalla el resultado del array, index y valor; imprime la suma de los valores del array
	public static void mostrarArray(int[] numeros) {
		//declaracion variable para guardar la suma del array
		
		int max;
		
		max=0;
		//Recorre el array y va impriendo cada pocision y acumulando la suma de los valores
		for(int i=0;i<numeros.length;i++) {
			System.out.println(i+":"+numeros[i]);
			if(max<numeros[i]) {
				max=numeros[i];
			}
		
		}
		//Imprime el maximo de los valores del array
		System.out.println("El numero maximo del array es: "+max);
	}
	
	public static void numeroPrimo(int num) {
		//Evalua el residuo entre el 1 hasta el numero del numero ingresado 
		for(int i=2;i<num;++i) {
			if(num%i==0) {	
					JOptionPane.showMessageDialog(null,"El numero ingresado no es primo");
					System.exit(0);
				}
			}
		}
	
	//Crea un array con valores aleatorio entre 0 y 9 del tamaño indicado por el usuario
	public static void crearArray(String pocisiones) {
		//Array para numeros aleatorio y variable i para guardar el tamaño del array
		int[] numeros;
		int i, limInferior, limSuperior;
		String entrada;
		
		do {
		entrada=JOptionPane.showInputDialog("Hasta que valor MINIMO desea se encuentre los numeros aleatorio");
		}while(!(entrada.matches("[0-9]*")));
		
		limInferior= Integer.parseInt(entrada);
		do {
		entrada=JOptionPane.showInputDialog("Hasta que valor MAXIMO desea se encuentre los numeros aleatorio");
		}while(!(entrada.matches("[0-9]*")));
		
		limSuperior= Integer.parseInt(entrada);	
		
		i=Integer.parseInt(pocisiones);
		numeros= new int[i];
		
		//Evalua que el limite maximo no sea igual al limite inferior
		if((limSuperior==limInferior)) {
			JOptionPane.showMessageDialog(null,"ERROR: El valor maximo ingresado es menor al valor minimo");
			System.exit(0);
		}
		
		//Recorre y rellena cada pocision del array con numero aleatorio entre 0 y 9
		for(int j=0;j<numeros.length;j++) {
			numeros[j]=(int)(Math.round(( (Math.random()*(Math.max(limSuperior,limInferior)-Math.min(limSuperior,limInferior)))+Math.min(limSuperior,limInferior) )));
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
