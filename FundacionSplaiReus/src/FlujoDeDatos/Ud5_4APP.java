package FlujoDeDatos;

import javax.swing.JOptionPane;
public class Ud5_4APP {
	public static void main(String arg[]) {
	//Aplicación que calcula el área de un circulo mediante la solicitud del valor del radio.
		
		//Declaracion de Variables
		final double PI;
		double areaCirculo, radio;
		String radioString;
		
		//Iniciacion de Variables
		 PI=3.141516;
		 radioString =JOptionPane.showInputDialog("Ingresa por favor el valor \nque corresponde al radio del circulo");
		 radio = Double.parseDouble(radioString);
		 areaCirculo = PI* Math.pow(radio, 2);
		 
		 //Impresion en pantalla del area del circulo calculada
		 JOptionPane.showMessageDialog(null, "El area del circulo es: "+areaCirculo);
		
		
	}
}
