package FlujoDeDatos;

import javax.swing.JOptionPane;
public class Ud5_5APP {
	
	//Se Lee un n�mero por teclado y se indica si es divisible entre 2 
	public static void main(String args[]) {
		//Declaracion de variables
		int numero;
		String entrada, mensaje;
		
		//Iniciacilizacion de variables
		
		//Se solicita una entrada numerica al usuario
		entrada=JOptionPane.showInputDialog("Ingresa un n�mero: ");
		
		//Se transforma y se evalua el valor dado por el usuario
		numero=Integer.parseInt(entrada);
		mensaje=(numero%2==0)?"El "+entrada+" es divisible entre 2":"El "+entrada+" NO es divisible entre 2";	
		
		//Impresion en pantalla del resultado
		JOptionPane.showMessageDialog(null, mensaje);
		
	
	
	}
}
