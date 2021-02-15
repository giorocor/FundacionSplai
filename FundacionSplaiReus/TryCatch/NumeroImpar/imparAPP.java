package NumeroImpar;

import javax.swing.text.MutableAttributeSet;

public class imparAPP {
	public static void main(String args[]) {
		numeroAleatorio();
		
	}
	
	public static void numeroAleatorio() {
		int numero;
		numero=(int)Math.round(Math.random()*999);
		
		System.out.println("Generando Numero Aleatorio...");
		try {
			throw new numeroImpar(numero);
		}catch(numeroImpar e){
			System.out.println(e.esImpar());
		}
		
	
	}
		
}


