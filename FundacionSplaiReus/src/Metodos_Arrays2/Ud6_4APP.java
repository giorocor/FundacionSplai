package Metodos_Arrays2;

import javax.swing.JOptionPane;

public class Ud6_4APP {
	//Aplicacion que regresa el factorial de un numero
	
	
	public static int numeroFactorial(int num) {

		if(num==1) {
			return 1;
		}
		
		return num*numeroFactorial(num-1);
		//JOptionPane.showMessageDialog(null,"El factorial de "+num+" es "+factorial);
	}
	
	
	//Solicita los datos al usuario
	public static void solicitarDatos() {
		//Declaracion de variable
		String entrada;
		int num, factorial;
		
		//Iniciacion de variable
		do {
		entrada=JOptionPane.showInputDialog("Ingresa un numero para calcuar su factorial");
		}while(!(entrada.matches("[0-9]*")));
		num=Integer.parseInt(entrada);
		
		//Invoca el metodo para evaluar el numero primo
		factorial=numeroFactorial(num);
		JOptionPane.showMessageDialog(null,"El factorial de "+num+" es "+factorial);
	}
	
	public static void main(String args[]) {
		solicitarDatos();
		
	}

}
