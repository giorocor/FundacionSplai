package Metodos_Arrays1;
import javax.swing.JOptionPane;
public class Ud6_1APP {
	//Aplicación que calcula el área de una figura seleccionada y dada las medidas por el usuario
	
	//Calculo del area del circulo
	public static double areaCirculo() {
		//Declaracion de variables
		String entrada;
		double radio, area;
		final double PI;
		
		//Iniciacion de variables
		PI=3.141516;
		
		do {
		entrada=JOptionPane.showInputDialog("Ingresa la medida del radio del circulo en Centimetros");
		}while(!(entrada.matches("[0-9]*")));
		
		radio = Double.parseDouble(entrada);
		
		//Calculo del area
		area=PI*(radio*radio);
		return area;
	}
	
	public static double areaCuadrado() {
		//Declaracion de variables
		String entrada;
		double arista, area;
		
		//Iniciacion de variables
		do {
		entrada=JOptionPane.showInputDialog("Ingresa la medida del lado del cuadrado en Centimetros");
		}while(!(entrada.matches("[0-9]*")));
		arista = Double.parseDouble(entrada);
		
		//Calculo del area
		area=arista*arista;
		
		return area;
	}
	
	public static double areaTriangulo() {
		//Declaracion de variables
		String entrada;
		double base, altura, area;
		
		//Iniciacion de variables
		do {
		entrada=JOptionPane.showInputDialog("Ingresa la medida de la BASE del triangulo en Centimetros");
		}while(!(entrada.matches("[0-9]*")));
		
		base = Double.parseDouble(entrada);
		do {
		entrada=JOptionPane.showInputDialog("Ingresa la medida de la ALTURA del triangulo en Centimetros");
		}while(!(entrada.matches("[0-9]*")));
		
		altura = Double.parseDouble(entrada);
		
		//Calculo del area
		area=(base*altura)/2;
		
		return area;
	}
	
	//Valida el valor numerico de la eleccion de la figura dada por el usuario
	public static void validarFigura(String figura) {
		double area;
		
		switch(figura) {
		case "1":
			area=areaCirculo();
			JOptionPane.showMessageDialog(null,"El area del cirulo es: "+area+"CM^2");
			break;
		case "2":
			area=areaCuadrado();
			JOptionPane.showMessageDialog(null,"El area del cuadrado es: "+area+"CM^2");
			break;
		case "3":
			area=areaTriangulo();
			JOptionPane.showMessageDialog(null,"El area del triangulo es: "+area+"CM^2");
			break;
		default:
			JOptionPane.showMessageDialog(null,"Ingresa por valor un valor correcto");
			
		}
	}
	
	
	public static void main(String args[]) {
		//Declaracion de variables
		String figura, message;
		
		//Iniciacion de variables
		message="\n1:Circulo \n2:Cuadrado \n3:Triangulo";
		figura=JOptionPane.showInputDialog("Ingresa el numero de la figura la cual deseas calcular su area"+message);
		
		//Valida la entrada del usuario
		validarFigura(figura);
	}


	
}
