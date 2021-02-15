package Password;

public class Password {
	private int longitud;
	private String contrase�a;
	
	private final int LONGITUD=8;

	public Password() {
		this.longitud = LONGITUD;
		this.contrase�a = "";
	}
	
	
	
	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.contrase�a = crearContrase�a();
	}
		
	
	//Getter and Setter
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}
	
	
	//Metodo

	public String crearContrase�a() {
		char word1, word2, word3;
		String contrase�aAleatoria="";
		for(int i=0;i<this.longitud;i++) {
			word1=(char)Math.round((Math.random()*(90-65))+65);
			word2=(char)Math.round((Math.random()*(122-97))+97);
			word3=(char)Math.round((Math.random()*(57-48))+48);
			contrase�aAleatoria+=""+word1+""+word2+""+word3+"";
		}
		return contrase�aAleatoria;
	}
	
	public boolean esFuerte() {
		return (contrase�a.matches(".*[A-Z].*{2,}") && this.contrase�a.matches(".*[a-z].*{1,}") && this.contrase�a.matches(".*[0-9].*{5,}"))?true:false;
	}
	
}
//65 90
//97 122
//48 57 