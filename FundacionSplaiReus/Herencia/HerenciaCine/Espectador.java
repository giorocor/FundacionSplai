package HerenciaCine;

public class Espectador {
	private String nombre;
	private int edad;
	private double dinero;
	
	private final String[] nombreEspectador= {"Javier","Lucas","Miguel","Sandra","Lucia","Luisa","Maria","Ivan","Gisela","Ana"};
	private final int[] edadEspectador= {12,14,15,20,30,56,30,20,30,9};
	private final int[] dineroEspectador= {8,7,3,1,10,12,20,12,14,10};
	
	private final int EDAD= 17;
	private final int DINERO= 10;
	
	
	//constructor
	Espectador() {
		this.nombre = AsignarNombre();
		this.edad = AsignarEdad();
		this.dinero = AsignarDinero();
	}
	
	Espectador(String nombre) {
		this.nombre = nombre;
		this.edad = EDAD;
		this.dinero = DINERO;
	}
	
	Espectador(int edad, double dinero) {
		this.nombre = "";
		this.edad = edad;
		this.dinero = dinero;
	}
	
	
	Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}
	
	
	//Getter and Setter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	

	
	//metodo
	public String AsignarNombre(){
		return nombreEspectador[(int)(Math.round(Math.random()*3))];
	}

	public int AsignarEdad(){
		return edadEspectador[(int)(Math.round(Math.random()*3))];
	}
	
	public double AsignarDinero(){
		return dineroEspectador[(int)(Math.round(Math.random()*3))];
	}

	@Override
	public String toString() {
		return "Espectador [nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + "]";
	}
	
	
	
	
	
}
