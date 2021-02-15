package ExceptionCustomizada;

public class miException extends Exception {
	private int valor;

	public miException(int valor) {
		super();
		this.valor = valor;
	}
	
	
	//MEtodo
	
	public String evaluarValorIngresado() {
		return (valor==400)?"Exception capturada por miException":"";
	}
	
		
	
}
