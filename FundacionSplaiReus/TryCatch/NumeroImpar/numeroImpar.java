package NumeroImpar;

public class numeroImpar extends Exception{
	private int valorNumerico;
	
	
	public numeroImpar(int valorNumerico) {
		super();
		this.valorNumerico = valorNumerico;
	}

	public numeroImpar() {
		super();
	}
	
	




	//Metodo
	public String esImpar() {
			return (valorNumerico%2!=0)?"El numero Aleatorio generado es "+valorNumerico+"\nEs impar":"No es impar";
		
	}
	
}
