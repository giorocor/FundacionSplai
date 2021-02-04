package FlujoDeDatos;

import javax.swing.JOptionPane;
public class Ud5_10APP {
	
	//Suma el total de las ventas indicadas que fueron ingresadas
	public static void main(String args[]) {
		//Declaracion de variables
		String entrada;
		int numSales, totalSales, n;
		int[] sales;
		
		//Inicializacion de variables
		entrada=JOptionPane.showInputDialog("Ingresa la cantidad de ventas realizadas");
		numSales=Integer.parseInt(entrada);
		sales= new int[numSales];
		totalSales=0;
		n=1;
		
		//Recorre array para ir asignando las ventas
		for(int sale: sales) {
			entrada=JOptionPane.showInputDialog("Ingresa el valor de la venta numero "+n+": ");
			sale=Integer.parseInt(entrada);
			totalSales=sale+totalSales;
			n++;
		}
		
		JOptionPane.showMessageDialog(null,"El total de las ventas suman: "+totalSales);
	}
}
