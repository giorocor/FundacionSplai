package ArrayList_HansTable;

import java.util.Hashtable;

import javax.swing.JOptionPane;
public class Ud7_1APP {
	//Aplicación que calcula y almacena la nota media por alumnos de un curso

	public static void main(String args[]) {
		solicitarNotas();
		
	}
	
	public static void solicitarNotas() {
		int cantNotas,numEstudiantes, numCalificaciones, promNotas,nota;
		Hashtable<String, Integer> calificaciones= new Hashtable<>();
		
		//Solicita la cantidad de estudiantes existente en el curso y numero de calificaciones registradas
		
		numEstudiantes=Integer.parseInt(JOptionPane.showInputDialog("Cuantos estudiantes son en el curso"));
		numCalificaciones=Integer.parseInt(JOptionPane.showInputDialog("Cuantos calificaciones se registraron en el curso"));

		
		//Solicita el numero de calificaciones por estudiante
		for(int i=1;i<=numEstudiantes;++i) {
			cantNotas=0;
			promNotas=0;
			while(cantNotas<numCalificaciones) {
				nota=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota "+(cantNotas+1)+" del estudiante N° "+i));
			
				promNotas+=nota;
				cantNotas++;
			}
		//Agrega 
		calificaciones.put("Student"+i, promNotas/cantNotas);
		}
		
		JOptionPane.showMessageDialog(null,calificaciones.toString());
	}
	

}
