package ExceptionCustomizada;

public class mainAPP {
	public static void main(String args[]) {
		iniciar();
	}
	
	
	public static void iniciar() {
		System.out.println("Mensaje mostrado por pantalla");
		try {
			throw new miException(400);
		}catch(miException e) {
			System.out.println(e.evaluarValorIngresado());
		}
		System.out.println("Programa Terminado");
	}
	
}
