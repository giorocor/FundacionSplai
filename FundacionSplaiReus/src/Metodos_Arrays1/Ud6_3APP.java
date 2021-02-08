package Metodos_Arrays1;


import javax.swing.JOptionPane;
public class Ud6_3APP {
	//Aplicación que indica si el numero ingresado es o no es numero PRIMO

	
	public static boolean numeroPrimo(int num) {
		//Evalua el residuo entre el 2 hasta el numero del numero ingresado 
		for(int i=2;i<num;++i) {
			if(num%i==0) {	
					return false;
				}
			}
		return true;
		}
	
	
	//Solicita los datos al usuario
	public static void solicitarDatos() {
		//Declaracion de variable
		String entrada;
		int num;
		boolean resultado;
		
		//Iniciacion de variable
		do {
		entrada=JOptionPane.showInputDialog("Ingresa un numero para validar si es primo");
		}while(!(entrada.matches("[0-9]*")));
		
		num=Integer.parseInt(entrada);
		
		//Invoca el metodo para evaluar el numero primo
		resultado=numeroPrimo(num);
		
		//Impresion en pantalla del resultado positivo
		if(resultado) {
		JOptionPane.showMessageDialog(null,"El numero ingresado es primo");
		}else {
		JOptionPane.showMessageDialog(null,"El numero ingresado NO es primo");
		}
	}
	
	public static void main(String args[]) {
		 solicitarDatos();
	 }
}

