package HerenciaAula;

public abstract class Persona {
	protected String nombre;
	protected int edad;
	protected char sexo;
	protected boolean disponibilidadAsistencia;
	
	static final char SEXO='M';
	


	
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = SEXO;
		this.disponibilidadAsistencia = false;
	}

	
//getter and setter
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public boolean isDisponibilidadAsistencia() {
		return disponibilidadAsistencia;
	}


	public void setDisponibilidadAsistencia(boolean disponibilidadAsistencia) {
		this.disponibilidadAsistencia = disponibilidadAsistencia;
	}


	public abstract boolean darDisponibilidadAsistencia();


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", disponibilidadAsistencia="
				+ disponibilidadAsistencia + "]";
	}
	
	
		
	
}
