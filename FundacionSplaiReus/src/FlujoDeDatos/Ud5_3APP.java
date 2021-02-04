package FlujoDeDatos;

import javax.swing.JOptionPane;
public class Ud5_3APP {
	public static void main(String args[]) {
		String nombre= JOptionPane.showInputDialog("Por favor introduzca tu nombre");
		nombre=nombre.trim();
		JOptionPane.showMessageDialog(null, "Bienvenido "+nombre);
	}
}
