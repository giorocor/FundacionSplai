package POO;

public class Persona {
	
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	
	final char HOMBRE='H'; 
	
	//constructor por defecto
	public Persona(String dni) {
		this.nombre = "";
		this.edad = 0;
		this.dni = dni;
		this.sexo = HOMBRE;
		this.peso = 0;
		this.altura = 0;
	}
	
	//Un constructor con el nombre, edad y sexo, el resto por defecto.
	public Persona(String nombre, int edad, char sexo, String dni) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.dni = dni;
		this.peso = 0;
		this.altura = 0;
	}

    //Un constructor con todos los atributos como parámetro.
	public Persona(String nombre, int edad, String dni,  char sexo, double peso, double altura) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}


	
	
	
	
}
