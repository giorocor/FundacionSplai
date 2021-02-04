package FlujoDeDatos;

import javax.swing.JOptionPane;
public class Ud5_13APP {
	
	static void message(double resultado) {
		JOptionPane.showMessageDialog(null,"El resultado de esa operacion es: "+resultado);
	}
	
	//Realiza operaciones entre 2 numeros ingresados y un signo aritmetico dado
	static double calculadoraInversa(){
		int num1,num2;
		String signo, entrada1, entrada2;
		double resultado;
		
		entrada1=JOptionPane.showInputDialog("Ingresa un primer valor numerico");
		entrada2=JOptionPane.showInputDialog("Ingresa un segundo valor numerico");
		signo=JOptionPane.showInputDialog("Ingresa un signo aritmetico");
		resultado=0;
		
		num1=Integer.parseInt(entrada1);
		num2=Integer.parseInt(entrada2);
		
		switch(signo) {
			case "+":
					resultado= num1+num2;
					message(resultado);
					break;
			case "-":
					resultado= num1-num2;
					message(resultado);
					break;
			case "*":
					resultado= num1*num2;
					message(resultado);
					break;
			case "/":
					resultado= num1/num2;
					message(resultado);
					break;
			case "^":
					resultado= num1^num2;
					message(resultado);
					break;
			case "%":
					resultado= num1%num2;
					message(resultado);
					break;
			default: 
				JOptionPane.showMessageDialog(null, "Ingresa los valores solicitados correctamente");
				
		}
		
		return resultado;
	}
	
	
	
	public static void main(String args[]) {
	
	
		calculadoraInversa();

		
		
	}
		


}