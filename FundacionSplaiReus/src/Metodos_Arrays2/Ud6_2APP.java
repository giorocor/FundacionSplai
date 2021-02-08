package Metodos_Arrays2;

import java.util.Arrays;

import javax.swing.JOptionPane;
public class Ud6_2APP {
	//Aplicación que genera números enteros aleatorios dentro de un rango seleccionado por usuario
	
//Metodo para generar listado de numero aleatorios
	public static int[] numRamdon(int cantidad, int limInferior, int limSuperior) {
		//Declaracion de variables
		int randoms[];
		//Iniciacion de variable
		randoms= new int[cantidad];
		//Construccion de listado de numero aleatorios
		for(int i=0;i<randoms.length;i++ ) {		
			randoms[i]=(int)(Math.round((Math.random()*(Math.max(limSuperior,limInferior)-Math.min(limSuperior,limInferior)))+Math.min(limSuperior,limInferior)));	
		}
		
		return randoms;
	}
		
	//Metodo para solicitar datos de entrada al usuario
	public static void solicitarDatos() {
		//Declaracion de variables
		String entrada;
		int cantidad, limInferior, limSuperior;
		int resultado[];
		
		//Iniciacion de variable
		do {
		entrada=JOptionPane.showInputDialog("Cuantos numeros aleatorios quieres generar");
		}while(!(entrada.matches("[0-9]*")));
		
		cantidad=Integer.parseInt(entrada);
		do {
		entrada=JOptionPane.showInputDialog("Hasta que valor MINIMO desea se encuentre los numeros aleatorio");
		}while(!(entrada.matches("[0-9]*")));
		
		limInferior= Integer.parseInt(entrada);
		do {
		entrada=JOptionPane.showInputDialog("Hasta que valor MAXIMO desea se encuentre los numeros aleatorio");
		}while(!(entrada.matches("[0-9]*")));
		
		limSuperior= Integer.parseInt(entrada);	
		
		resultado=new int[cantidad];
		
		//Evalua que el limite maximo no sea igual al limite inferior
		if((limSuperior==limInferior)) {
			JOptionPane.showMessageDialog(null,"ERROR: El valor maximo ingresado es menor al valor minimo");
			System.exit(0);
		}
		
		resultado= numRamdon(cantidad, limInferior, limSuperior);
		//Impresion en pantalla de resultados
		JOptionPane.showMessageDialog(null,"Los numeros generados son:\n"+Arrays.toString(resultado));
	}
	
	public static void main(String args[]) {
		solicitarDatos();
	}
}
