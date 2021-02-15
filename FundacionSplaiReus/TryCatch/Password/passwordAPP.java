package Password;

import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.management.BadBinaryOpValueExpException;
import javax.swing.JOptionPane;

public class passwordAPP {
	public static Password[] nuevaContrase�a;
	
	public static void main(String args[]) {
		int n;
		boolean[] arrayEsFuerte;
		n=Integer.parseInt(JOptionPane.showInputDialog("Indica el numero de password a crear"));
		nuevaContrase�a=crear(n);
		arrayEsFuerte=verificarEsFuerte(nuevaContrase�a);
		imprimir(nuevaContrase�a,arrayEsFuerte);
		
}
	
	public static Password[] crear(int n) {
		int longitud;
		nuevaContrase�a=new Password[n];
		for(int i=0;i<n;i++) {	
			longitud=Integer.parseInt(JOptionPane.showInputDialog("Indica el numero de password a crear"));
			nuevaContrase�a[i]= new Password(longitud);
		}
		return  nuevaContrase�a;
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
			System.out.println("Contrase�a: "+p[i].getContrase�a()+" Valor: "+b[i]);
		}
	}
}
