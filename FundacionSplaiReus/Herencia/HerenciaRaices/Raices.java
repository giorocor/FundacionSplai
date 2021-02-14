package HerenciaRaices;

public class Raices {
	private int a;
	private int b;
	private int c;
	

	
	//constructor
	public Raices(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}


	//Metodos
	
	// imprime las 2 posibles soluciones
	public String obtenerRaices() {
		double[] resultado=new double[2];
		double discriminante;
		discriminante=getDiscriminante();
		
		resultado[0]=((-1*this.b)+Math.sqrt(discriminante))/(2*this.a);
		resultado[1]=((-1*this.b)-Math.sqrt(discriminante)) /(2*this.a);
	
		return (discriminante>0?"Las dos posibles soluciones son: "+resultado[0]+" y "+resultado[1]:obtenerRaiz());
	}
	
	//imprime única raíz, que será cuando solo tenga una solución posible
	public String obtenerRaiz() {
		double resultado;
		double discriminante;
		discriminante=getDiscriminante();
		resultado=((-1*this.b)+(Math.sqrt(Math.pow(this.b, 2)-(4*this.a*this.c)))) /(2*this.a);
		//resultado[1]=((-1*this.b)+(Math.sqrt(Math.pow(this.b, 2)-(4*this.a*this.c)))) /(2*this.a);
		return (discriminante==0)?"La unica solucion es: "+resultado:"La ecuacion no tiene solucion";
	}
	
	//devuelve el valor del discriminante 
	public double getDiscriminante(){
		double discriminante = Math.pow(this.b, 2)-(4*this.a*this.c);
		return discriminante;
	}
	
	//o indica si tiene dos soluciones
	public boolean tieneRaices(){
		double discriminante;
		discriminante=getDiscriminante();
		return (discriminante>=0?true:false);
	}
	
	//o indicando si tiene una unica solucion
	public boolean tieneRaiz(){
		double discriminante;
		discriminante=getDiscriminante();
		return (discriminante==0?true:false);
	}
	
	//Imprimes las posibles soluciones de la ecuacion
	public String calcular() {
		return obtenerRaices();
	}



	@Override
	public String toString() {
		return "Raices [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
		
}
