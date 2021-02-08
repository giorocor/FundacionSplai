package Metodos_Arrays;

import javax.swing.JOptionPane;
public class Ud6_6APP {
	//Aplicación que cuenta el número de cifras de un número entero positivo.

	//Cuenta el numero de cifras del numero ingresado por el usuario
	public static int contarCifras(String num) {
		//Declaracion de variables
		int output;
		
		//Iniciacion de las variables
		output=num.length();
		
		return output;
	}
	
	public static void main(String args[]) {
		//Declaracion de variables
		String num;
		int qCifras;
		//Iniciacion de las variables, e invocacion del metodo contarCifras
		num=JOptionPane.showInputDialog("Ingresa un número");
		
	
		//Evalua que el valor ingresado sea un numero entero positivo
		if(!num.matches("[0-9]*")) {
			JOptionPane.showMessageDialog(null, "ERROR: Ingresa un numero entero positivo");
			System.exit(0);
		}
		
		qCifras=contarCifras(num);
		
		//Impresion en pantalla del resultado
		JOptionPane.showMessageDialog(null, "La cantidad de cifras que contiene el numero ingresado es: "+qCifras);
	}
}
