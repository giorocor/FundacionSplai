package FlujoDeDatos;

public class Ud5_9APP {
	
	//Los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
	public static void main(String args[]) {
		//Declaracion de variable
		int num=1;
		
		while(num<101){
			if(num%2==0 && num%3==0 ) {
				System.out.println(num+"; ");
			}
			
			num++;
		}
			
	}
}
