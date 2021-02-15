package Password;

import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.management.BadBinaryOpValueExpException;
import javax.swing.JOptionPane;

public class passwordAPP {
	public static Password[] nuevaContraseña;
	
	public static void main(String args[]) {
		int n;
		boolean[] arrayEsFuerte;
		n=Integer.parseInt(JOptionPane.showInputDialog("Indica el numero de password a crear"));
		nuevaContraseña=crear(n);
		arrayEsFuerte=verificarEsFuerte(nuevaContraseña);
		imprimir(nuevaContraseña,arrayEsFuerte);
		
}
	
	public static Password[] crear(int n) {
		int longitud;
		nuevaContraseña=new Password[n];
		for(int i=0;i<n;i++) {	
			longitud=Integer.parseInt(JOptionPane.showInputDialog("Indica el numero de password a crear"));
			nuevaContraseña[i]= new Password(longitud);
		}
		return  nuevaContraseña;
	}
	
	
	
	public static boolean[]  verificarEsFuerte(Password[] e) {
		
		boolean[] isFuerte=new boolean[e.length];
		
		for(int i=0;i<e.length;i++) {	
		
			isFuerte[i]=e[i].esFuerte();
		}
		return isFuerte;
	}
	
	
	
	public static void imprimir(Password[] p, boolean[] b)  {
		for(int i=0;i<p.length;i++) {
			System.out.println("Contraseña: "+p[i].getContraseña()+" Valor: "+b[i]);
		}
	}
}
