package HerenciaElectrodomestico;



public class Television extends Electrodomestico {
	private double resolucion;
	private boolean sintonizador;
	
	static final double RESOLUCION= 20;
	static final boolean SINTONIZADOR=false;

	
//CONSTRUCTOR	
	public Television() {
		super();
		this.resolucion=0;
		this.sintonizador=false;
	}

	public Television(double precioBase, double peso) {
		super(precioBase,peso);
		this.resolucion =0;
		this.sintonizador = false;
	}

	public Television(double resolucion, boolean sintonizador, double precioBase, String color, char consumo, double peso) {
		super(precioBase,color,consumo,peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}

	
//GETTER
	public double getResolucion() {
		return resolucion ;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}
	
	
//METODO
	public double precioFinal() {	
		return ((this.resolucion>40)?super.precioFinal()*1.3:super.precioFinal()) +((this.sintonizador)?super.precioFinal()+50:super.precioFinal()) ;
	}

	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", sintonizador=" + sintonizador + "]";
	}

	
	
	
	
	
}



