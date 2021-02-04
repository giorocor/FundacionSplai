package FlujoDeDatos;


import javax.swing.JOptionPane;
public class Ud5_12APP {
	//Evalua con 3 intentos si la contraseña ingresada e correcta
	public static void main(String args[]) {
		//Declacion de variables
		String password, passwordUser, message;
		int fail;
		//Iniciacion de variables
		fail=1;
		password = "12345";
		
		//Solicitud de contraseña y evaluacion
		do {
		passwordUser=JOptionPane.showInputDialog("Introduce la contraseña que crees es correcta");
		message=(passwordUser.equals(password))?"Enhorabuena":"Intento "+fail+" de 3 Contraseña incorrecta";
		JOptionPane.showMessageDialog(null, message);
		fail++;
		}while(fail<=3 && !(passwordUser.equals(password)));
		
		
	}

}
