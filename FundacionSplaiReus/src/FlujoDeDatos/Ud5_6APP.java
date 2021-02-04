package FlujoDeDatos;

import javax.swing.JOptionPane;
public class Ud5_6APP {
	//Solicita el precio de un producto y regresa su precio mas IVA
	public static void main(String args[]) {
		
		//Declaracion de variables
		String entrada;
		double precio, precioFinal;
		final double IVA;
		
		//Iniciacion de variables
		
		IVA=0.21;
		
		//Solicitud al usuario del valor de algun producto
		entrada=JOptionPane.showInputDialog("Ingresa el precio bruto de algun producto");
		
		//Calculo del precio final mas IVA
		precio=Double.parseDouble(entrada);
		precioFinal=precio+precio*IVA;
		
		//Impresion en pantalla del resultado
		JOptionPane.showMessageDialog(null, "El precio del producto mas IVA es de $"+precioFinal);
		
		
	}
	

}
