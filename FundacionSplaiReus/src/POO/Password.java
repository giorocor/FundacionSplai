package POO;

public class Password {
	private int longitud;
	private String contraseña;
	
	
	private final int LONGITUD=8;
	
	public Password() {
		super();
		this.longitud = LONGITUD;
	}


	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = passwordAleatorio();
	}
	
	
	public String passwordAleatorio() {
		return String.valueOf((Math.random()*99999999)+10000000);
	}
	
	
	
	
}
