package HerenciaElectrodomestico;

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

//GETTER 
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
	
	//validar precio de acuerdo al consumo energetico
	public double precioFinal() {
		double precio;
		Hashtable<Character,Integer> letraPrecio= new Hashtable<>(); 
		LinkedHashMap<Integer,Integer> tamañoPrecio= new LinkedHashMap<>();
		
		letraPrecio.put('A',100);
		letraPrecio.put('B',80);
		letraPrecio.put('C',60);
		letraPrecio.put('D',50);
		letraPrecio.put('E',30);
		letraPrecio.put('F',10);
		
		tamañoPrecio.put(80, 100);
		tamañoPrecio.put(50, 80);
		tamañoPrecio.put(20, 50);
		tamañoPrecio.put(0, 10);
		
		precio=letraPrecio.get(this.consumo);
		
		Iterator<Integer> it = tamañoPrecio.keySet().iterator();
        boolean exit = false;
        
        while(it.hasNext() && !exit) {
            Integer key = it.next();
            if(this.peso >= key) {
                precio += tamañoPrecio.get(key) ;
                exit = true;
            }
            
        }     
        return precio + this.precioBase;
	}

	
	
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumo + ", peso="
				+ peso + "]";
	}
	
	
	
}
