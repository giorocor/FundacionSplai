package Metodos_Arrays2;

import javax.swing.JOptionPane;
public class Ud6_7APP {
 // aplicación que convierte de Euros a dolares, yenes o libras e imprime el resultado en pantalla 
	
	//metodo para realizar la operacion del cambio de divisa
	public static void convertirDivisas(String moneda, String dinero) {
		//Declaracion de variables
		double libras, yen, dolar, money;
		//Iniciacion de variables, Equivalencia de otro tipo de moneda a Euro
		libras=0.86;
		yen=129.852;
		dolar=1.28611;
		
		//Parseo de String a Double
		money=Double.parseDouble(dinero);
		
		//Evalua que tipo de moneda se eligio a convertir y realiza la operacion de cambio
		switch(moneda) {
			case "D":
				 money=money*dolar;
				 JOptionPane.showMessageDialog(null,dinero+" Euros equivale a "+money+" Dolar");
				break;
			case "Y":
				 money=money*yen;
				 JOptionPane.showMessageDialog(null,dinero+" Euros equivale a "+money+" Yen");
				break;
			case "L":
				 money=money*libras;
				 JOptionPane.showMessageDialog(null,dinero+" Euros equivale a "+money+" Libra");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Ingresa la letra MAYUSCULA que corresponde a cada tipo de moneda");
		}
	}
	
	//Metodo para solicitar los datos de entrada, el tipo de moneda y la cantidad de dinero a convertir
	public static void solicitarDatosDivisa(){
		//Declaracion de variables
		String moneda, dinero;
		
		//Iniciacion de variables
		do {
		dinero=JOptionPane.showInputDialog("Ingresa la cantidad de EUROS a convertir");
		}while(!(dinero.matches("[0-9]*")));
		moneda=JOptionPane.showInputDialog("Ingresa el tipo de moneda a convertir\n (D)olar\n (Y)en\n (L)ibra");
		
		convertirDivisas(moneda, dinero);
	}
	

	public static void main(String[] args) {
		solicitarDatosDivisa();
	}

}
