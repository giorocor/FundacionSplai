package HerenciaAula;

public class aulaAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Aula nuevaAula=new Aula();
		System.out.println(nuevaAula.darClase());
		
		if(nuevaAula.darClase()) {
			System.out.println(nuevaAula.entregarNotas());
		}else {
			System.out.println("No se puede dar clases en esta aula");
			System.out.println(nuevaAula.getProfesor());
			for(int j=0;j<nuevaAula.getEstudiante().length;j++) {
				 System.out.println(nuevaAula.getEstudiante()[j]);
			}
		}
		
		
		//Estudiante nuevoE=new Estudiante();
		//System.out.println(nuevoE);
		//Estudiante[] estudiante = new  Estudiante[20];
		
		/*for(int j=0;j<20;j++) {
			 estudiante[j]=new Estudiante();
		}
		
		System.out.println(estudiante);*/
		
	}

}
