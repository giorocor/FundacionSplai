package CalculoSimples;

public class calculemos {
	private double numero1;
	private double numero2;
	
	
	public calculemos(double numero1, double numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	//Metodos
	public  double suma() {
		return numero1+numero2;
	}
	
	public double resta() {
		return numero1-numero2;
	}
	
	public double multiplicacion() {
		return numero1*numero2;
	}
	
	public double division() {
		return numero1/numero2;
	}
	
	public double modulo() {
		return numero1%numero2;
	}
	
}
