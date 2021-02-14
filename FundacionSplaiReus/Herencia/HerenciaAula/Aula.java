package HerenciaAula;

import java.util.Arrays;

public class Aula {
	private int id;
	private int capacidadMaxAula;
	private Estudiante[] estudiante;
	private Profesor profesor;
	private String materia;
	
	
	public Aula() {
		super();
		this.id = darId();
		this.capacidadMaxAula = maximoAula();
		this.profesor = new Profesor();
		this.materia = tipoAula();
		this.estudiante = crearAlumnos(this.capacidadMaxAula);
	}

	
	
	
	
	
	
	public Estudiante[] getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante[] estudiante) {
		this.estudiante = estudiante;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}







	public int darId() {
		int id;
		id=(int)Math.round((Math.random()*500)+1000);
		return id;
	}
	
	public int maximoAula() {
		int maximo;
		maximo=(int)Math.round((Math.random()*30)+15);
		return maximo;
	}
	
	public  String tipoAula() {
		int i;
		String[] materias= {"matematica","filosofia","fisica"};
		i=(int)Math.round((Math.random()*2));
		
		return materias[i];
	}
	
	public Estudiante[] crearAlumnos(int maxAula) {
		estudiante =new Estudiante[maxAula];
		for(int j=0;j<maxAula;j++) {
			 estudiante[j]=new Estudiante();
		}
		return estudiante;
	}
	
	public boolean darClase() {
		boolean aulaOk, profesorOk, estudiantesOk;
		int contadorAsistencia;
		
		contadorAsistencia=0;
		
		aulaOk=(profesor.getMateria()==this.tipoAula())?true:false;
		profesorOk=(profesor.disponibilidadAsistencia)?true:false;
		
		for(int j=0;j<estudiante.length;j++) {
			if(estudiante[j].isDisponibilidadAsistencia()==true) {
				contadorAsistencia+=1;
			}
		}
		
		estudiantesOk=(contadorAsistencia>(estudiante.length/2))?true:false;
		
		return (aulaOk && profesorOk && estudiantesOk)?true:false;
	}
	
	
	public String entregarNotas() {
		int aprobadoH,desaprobadoH,aprobadoM,desaprobadoM;
		
		aprobadoH=0;
		desaprobadoH=0;
		aprobadoM=0;
		desaprobadoM=0;
		
		for(int j=0;j<estudiante.length;j++) {
			
			switch (estudiante[j].getSexo()) {
			case 'H':
				if(estudiante[j].getCalificacion()>5) {
					aprobadoH+=1;
				}else {
					desaprobadoH+=1;
				}
				break;
			case 'M':
				if(estudiante[j].getCalificacion()>5) {
					aprobadoM+=1;
				}else {
					desaprobadoM+=1;
				}
				break;
			}
		
		}
		
		return "De las Alumnas Aprobaron "+aprobadoM+" y desaprobaron "+desaprobadoM+""
				+ " de los Alumnos aprobaron "+aprobadoH+" y desaprobaron "+desaprobadoH;
	}



	@Override
	public String toString() {
		return "Aula [id=" + id + ", capacidadMaxAula=" + capacidadMaxAula + ", estudiante="
				+ Arrays.toString(estudiante) + ", profesor=" + profesor + ", materia=" + materia + "]";
	}
	
	
	
}
