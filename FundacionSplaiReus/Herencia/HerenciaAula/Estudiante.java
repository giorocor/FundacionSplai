package HerenciaAula;


public class Estudiante extends  Persona {
	private double calificacion;
	
	private final String HOMBRES[]= {"Luis","Andres","Javier","Esteban","Diego","Jhon","Daniel","Sebastian"};
	private final String MUJERES[]= {"Luisa","Andrea","Jessica","Tatian","Gisela","Alejandra","Daniela","Sandra"};
	
	
	
	
	
	
	public Estudiante() {
		super();
		this.calificacion = darCalificacion();
		this.edad=(darEdad());
		this.sexo=(darSexo());
		this.setDisponibilidadAsistencia(darDisponibilidadAsistencia());
		this.setNombre(darNombre(this.sexo));
	}
	
	
	
	
	
	public double getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}






	public static double darCalificacion() {	
		int nota;
		nota=(int)Math.round((Math.random()*10));
		return nota;
	}
	
	public static int darEdad() {	
		int años;
		años=(int)Math.round((Math.random()*7)+12);
		return años;
	}
	
	public static char darSexo() {	
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
		
		return pNoAsistir>50?false:true;
	}

	@Override
	public String toString() {
		return "Estudiante [Nombre= "+nombre + " Edad= "+edad+" Calificacion=" + calificacion + " Disponibilidad= "+disponibilidadAsistencia+"]\n";
	}


	
	
}
