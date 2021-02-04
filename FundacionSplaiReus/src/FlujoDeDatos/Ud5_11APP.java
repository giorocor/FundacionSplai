package FlujoDeDatos;

import javax.swing.JOptionPane;

public class Ud5_11APP {
	public static void main(String args []) {
		//Indica si un dia ingresado es laboral o no
		String[] semana= {"1:Lunes","2:Martes","3:Miercoles","4:Jueves","5:Viernes","6:Sabado","7:Domingo"};
		String entrada;
		int dia;
		
		
		JOptionPane.showMessageDialog(null,"Escoge un dia de la lista siguiente e Ingresa su valor numerico \n");
		entrada=JOptionPane.showInputDialog(semana);
		dia= Integer.parseInt(entrada);
		
		switch(dia) {
		case 1:
			JOptionPane.showMessageDialog(null,semana[dia-1].substring(2)+" es un dia laboral");
			break;
		case 2:
			JOptionPane.showMessageDialog(null,semana[dia-1].substring(2)+" es un dia laboral");
			break;
		case 3:
			JOptionPane.showMessageDialog(null,semana[dia-1].substring(2)+" es un dia laboral");
			break;
		case 4:
			JOptionPane.showMessageDialog(null,semana[dia-1].substring(2)+" es un dia laboral");
			break;
		case 5:
			JOptionPane.showMessageDialog(null,semana[dia-1].substring(2)+" es un dia laboral");
			break;
		case 6:
			JOptionPane.showMessageDialog(null,semana[dia-1].substring(2)+" NO es un dia laboral");
			break;
		case 7:
			JOptionPane.showMessageDialog(null,semana[dia-1].substring(2)+" NO es un dia laboral");
			break;
		default:
			JOptionPane.showMessageDialog(null,"Ingresa un valor numerico correcto");
		}
		
		
	}
	
	
	
}