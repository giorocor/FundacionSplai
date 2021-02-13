package ArrayList_HansTable;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Ud7_3APP {

	public static Hashtable<String, String> productos= new Hashtable<>();
	public static Hashtable<String, Integer> inventario= new Hashtable<>();
	
	
	
	public static void main(String[] args) {
		stock();
		
	}
	
	
	public static void CrearDiccionario() {
		productos.put("100","Res");
		productos.put("101", "Pavo");
		productos.put("102","Jamon");
		productos.put("103"," Salchichas");
		productos.put("104", "Atun");
		productos.put("105","Chorizo");
		productos.put("106","Pollo");
		productos.put("107", "Sardinas");
		productos.put("108","Pescado");
		productos.put("109","Cerdo");
		
		inventario.put("100",5);
		inventario.put("101",2);
		inventario.put("102",7);
		inventario.put("103",1);
		inventario.put("104",8);
		inventario.put("105",3);
		inventario.put("106",5);
		inventario.put("107",2);
		inventario.put("108",3);
		inventario.put("109",3);
	}
	
	
	
	public static void stock() {
		int actividad;
		String item;
		boolean salir;
		
		salir=false;
		CrearDiccionario();
	
		do {
		actividad=Integer.parseInt(JOptionPane.showInputDialog("¿Indique que desea hacer?"
				+ "\n 1: Añadir nuevo articulo"
				+ "\n 2: Añadir cantidades de un articulo"
				+ "\n 3: Consultar un solo articulo"
				+ "\n 4: Consultar todo los articulos"
				+ "\n 5: Salir"));
		
		switch(actividad) {
		case 1:
			añadirArticulo();
			break;
		case 2:
			System.out.println(productos.toString());
			do {
			item=JOptionPane.showInputDialog("Indica el codigo del producto para añadir las nuevas cantidades");
			if(!productos.containsKey(item)){
				JOptionPane.showMessageDialog(null,"El codigo de item ingresado no existe");
			}
			}while(!productos.containsKey(item));
			
			añadirCantidad(item);
			break;
		case 3:
			item=JOptionPane.showInputDialog("Indica el codigo del producto a consultar");
			consultarArticulo(item);
			break;
		case 4:
			System.out.println(productos.toString());
			consultarTodos();
			break;
		case 5:
			salir=true;
			System.exit(0);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Instruccion no valida");
			System.exit(0);
		}
		}while(!salir);
	}
	
	
//Genera consulta de todos los articulos existente	
	public static void consultarTodos() {
		String item;
		Enumeration<String> llaves= inventario.keys();
		while(llaves.hasMoreElements()) {
			item=llaves.nextElement();
			System.out.println("Producto : "+productos.get(item)+"; Inventario Disponible: "+inventario.get(item)+"; Item: "+item);
			//+ "; 
		}
	}

//Consulta un solo articulo
	public static void consultarArticulo(String item) {
		System.out.println("Producto: "+productos.get(item)+"; Inventario Disponible: "+inventario.get(item));
	}
	
	
//Añade nuevas cantidades de un producto existente
	public static void añadirCantidad(String item) {
		int newCantidad, cantidad;
		
		newCantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa las nuevas cantidades del producto"));
		cantidad=inventario.get(item);
		
		System.out.println("id: "+item+" Producto: "+productos.get(item)+" Inventario Inicial: "+inventario.get(item));
		inventario.put(item,(newCantidad+cantidad));
		System.out.println("id: "+item+" Producto: "+productos.get(item)+"  Inventario Final: "+inventario.get(item));
		
	}

//Añade nuevas cantidades de un producto nuevo
	public static void añadirCantidad(String item, int cant) {
		int newCantidad, cantidad;
		newCantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa las nuevas cantidades del producto"));
		
		System.out.println("id: "+item+" Producto: "+productos.get(item)+" Inventario Inicial: "+inventario.get(item));
		inventario.put(item,newCantidad);
		System.out.println("id: "+item+" Producto: "+productos.get(item)+"  Inventario Final: "+inventario.get(item));
		
	}

//crea un producto nuevo
	public static void añadirArticulo() {
		String item, producto;
		int cantidad;
		
		cantidad=0;

		producto=JOptionPane.showInputDialog("Indica el nombre del producto");
		item=String.valueOf(Math.round((Math.random()*(200-100))+100));
		
		//Evalua que no exista una clave igual
		while(productos.containsKey(item)) {
			item=String.valueOf(Math.round((Math.random()*(200-100))+100));
		}
		
		//Crea el nuevo producto
	    productos.put(item, producto);      
	    //Pasar a anadir cantidades
	    añadirCantidad(item, cantidad);
	}



}