package HerenciaElectrodomestico;



public class Lavadora extends Electrodomestico {

	private double carga;
	
	static final double CARGA=5;

	
//constructores
	public Lavadora() {
		super();
		
	}
	
	public Lavadora(double precioBase,double peso) {
		super(precioBase, peso);
		this.carga = CARGA;
	}

	public Lavadora(double precioBase, String color, char consumo, double peso,double carga) {
		super(precioBase,color,consumo,peso);
		this.carga = carga;
		

	}
	
	
// GETTER	
	
	public Lavadora(double carga) {
		super();
		this.carga = carga;
	}

	public double getCarga() {
		return carga;
	}

	
//METODO
	public double precioFinal() {	
		return (this.carga>30)?super.precioFinal()+50:super.precioFinal();
	}


	
	
	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + "]";
	}

	
	
	
}
