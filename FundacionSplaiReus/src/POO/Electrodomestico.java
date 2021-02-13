package POO;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Electrodomestico {
	
	protected double precioBase;
	protected String color;
	protected char consumo;
	protected double peso;
	
	private static final double PRECIO=100;
	private static final String COLOR="blanco";
	private static final char CONSUMO= 'F';
	private static final double PESO=5;
	
	
//CONSTRUCTORES
	public Electrodomestico() {
		this(PRECIO,COLOR,CONSUMO,PESO);
	}

	public Electrodomestico(double precioBase, double peso) {
		
		this.precioBase = precioBase;
		this.peso = peso;
		this.color=COLOR;
		this.consumo=CONSUMO;
	}

	public Electrodomestico(double precioBase, String color, char consumo, double peso) {
		
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumo = comprobarConsumoEnergetico(consumo);
		this.peso = peso;
	}

//GETTER AND SETTER
	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumo() {
		return consumo;
	}

	public double getPeso() {
		return peso;
	}
	

//METODOS
	
	//Valida que el valor de consumo se encuentre dentro de la lista
	public char comprobarConsumoEnergetico(char letra) {
		return (letra>64 && letra<71)?letra:CONSUMO;
	}
	
	//valida que el color ingresado este en la lista
	public String comprobarColor(String color) {
		switch(color.toLowerCase()){
			case "negro":
				return color;
			case "rojo":
				return color;
			case "azul":
				return color;
			case "gris":
				return color;
			default:
				return COLOR;
		}
	}
	
	
	
	
	
}
