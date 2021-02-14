package HerenciaAula;


public class Profesor extends  Persona {
	private String materia;
	
	private static final String HOMBRES[]= {"Luis","Andres","Javier","Esteban","Diego","Jhon","Daniel","Sebastian"};
	private static final String MUJERES[]= {"Luisa","Andrea","Jessica","Tatian","Gisela","Alejandra","Daniela","Sandra"};
	

	
	
	




	public Profesor() {
		super();
		this.materia = darMateria();
		this.edad=(darEdad());
		this.sexo=(darSexo());
		this.setDisponibilidadAsistencia(darDisponibilidadAsistencia());
		this.setNombre(darNombre(this.sexo));
	}

	public  String darMateria() {
		int i;
		String[] materias= {"matematica","filosofia","fisica"};
		i=(int)Math.round((Math.random()*2));
		
		return materias[i];
	}
	
	public  int darEdad() {	
		int años;
		años=(int)Math.round((Math.random()*32)+30);
		return años;
	}
	
	public char darSexo() {	
		int genero;
		genero=(int)Math.round((Math.random()*1));
		return (genero==1)?'H':'M';
	}

	public String darNombre(char genero) {
		int i;
		i=(int)Math.round((Math.random()*7));
		
		return genero=='M'?MUJERES[i]:HOMBRES[i];
	}
	
	
	public boolean darDisponibilidadAsistencia() {
		int pNoAsistir;
		pNoAsistir=(int)Math.round((Math.random()*100));
		
		return pNoAsistir>20?false:true;
	}
	
	
	

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Profesor [Nombre="+nombre +" Edad= "+edad+" Materia=" + materia + "Disponibilidad= "+disponibilidadAsistencia+"]";
		
	}
	
	
		
}