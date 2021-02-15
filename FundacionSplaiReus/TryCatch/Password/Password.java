package Password;

public class Password {
	private int longitud;
	private String contraseña;
	
	private final int LONGITUD=8;

	public Password() {
		this.longitud = LONGITUD;
		this.contraseña = "";
	}
	
	
	
	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.contraseña = crearContraseña();
	}
		
	
	//Getter and Setter
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}
	
	
	//Metodo

	public String crearContraseña() {
		char word1, word2, word3;
		String contraseñaAleatoria="";
		for(int i=0;i<this.longitud;i++) {
			word1=(char)Math.round((Math.random()*(90-65))+65);
			word2=(char)Math.round((Math.random()*(122-97))+97);
			word3=(char)Math.round((Math.random()*(57-48))+48);
			contraseñaAleatoria+=""+word1+""+word2+""+word3+"";
		}
		return contraseñaAleatoria;
	}
	
	public boolean esFuerte() {
		return (contraseña.matches(".*[A-Z].*{2,}") && this.contraseña.matches(".*[a-z].*{1,}") && this.contraseña.matches(".*[0-9].*{5,}"))?true:false;
	}
	
}
//65 90
//97 122
//48 57 