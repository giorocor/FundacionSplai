package ArrayList_HansTable;

import java.util.ArrayList;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Ud7_2APP {
	
	public static Hashtable<String, String> productos= new Hashtable<>();
	public static Hashtable<String, Double> precios= new Hashtable<>();
	public static Hashtable<String, Double> iva= new Hashtable<>();
	
	

	public static String entradaUsuario;
	
	
	public static void main(String[] args) {
		CrearDiccionario();
		venta();	
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
		
		precios.put("100",5.2);
		precios.put("101",2.3);
		precios.put("102",7.5);
		precios.put("103",1.0);
		precios.put("104",8.3);
		precios.put("105",3.5);
		precios.put("106",5.5);
		precios.put("107",2.4);
		precios.put("108",3.3);
		precios.put("109",3.0);
		
		iva.put("100",0.21);
		iva.put("101",0.04);
		iva.put("102",0.21);
		iva.put("103",0.21);
		iva.put("104",0.21);
		iva.put("105",0.04);
		iva.put("106",0.21);
		iva.put("107",0.21);
		iva.put("108",0.21);
		iva.put("109",0.21);
	}
	
	

//Genera el cobro del total de productos comprados
	public static double cobro(double totalNeto) {
		double pago;
		
		do {
			pago=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor del billete con el que pago el cliente "));
			
			if(!(pago>=totalNeto)) {
				JOptionPane.showMessageDialog(null,"Paga con otro billete de mayor valor");
			}
		
		}while(!(pago>=totalNeto));
		
		return pago;	
	}

//Asigna el IVA que corresponde al producto seleccionado
	public static double seleccionarIva(String producto) {
		return iva.get(producto);	
	}
	
//Asigna el precio que corresponde al producto seleccionado
	public static double seleccionarPrecio(String producto) {
		return precios.get(producto);	
	}

//Solicita cantidades compradas del producto 
	public static int eleccionCantidad(String producto) {
		int cantidadVenta;
		
		cantidadVenta=0;
		
		do {
			entradaUsuario=JOptionPane.showInputDialog("Ingresa la cantidad comprada de "+producto);
			}while(!entradaUsuario.matches("[0-9]{1,3}"));
		
		cantidadVenta=Integer.parseInt(entradaUsuario);
		return cantidadVenta;	
	}
		
	
//Solicita al usuario escoger los productos comprados 	
	public static String eleccionProducto(int n) {
		String ScodigoItem;
	
		ScodigoItem="";
		
		do{
			
			ScodigoItem=JOptionPane.showInputDialog("Ingresa el codigo del PRODUCTO "+n+" a comprar:\n100: Res \n101: Pavo \n102: Jamon"
					+ "\n103: Salchichas \n104: Atun \n105: Chorizo \n106: Pollo \n107: Sardinas \n108: Pescado \n109: Cerdo  ");
	
		}while(!ScodigoItem.matches("[0-9]{3}"));
		
		return ScodigoItem;
	}
		

//Gestiona la operacion de venta
	public static void venta() {
		String codProducto, producto;
		int cantidad;
		double precio, iva, totalBruto, totalMasIva,ventaBruta,ventaNeta, pago;
		int vendidos;
		
		
		ventaBruta=0;
		ventaNeta=0;
		
		do{
		entradaUsuario=JOptionPane.showInputDialog("¿Cuantos productos ha comprado el cliente?");
		}while(!entradaUsuario.matches("[0-9]"));
		
		vendidos=Integer.parseInt(entradaUsuario);
		
		for(int n=0;n<vendidos;n++) {
			
		//obtiene codigo del producto
			codProducto=eleccionProducto(n);
		//obtiene nombre del producto
			producto=productos.get(codProducto);
		//obtiene cantidades compradas
			cantidad=eleccionCantidad(producto);
		//obtiene precio del producto guardado en hashtable
			precio=seleccionarPrecio(codProducto);
		//obtiene iva del producto guardado en hashtable
			iva=seleccionarIva(codProducto);
		//calcula en precio total sin iva del producto
			totalBruto= precio*cantidad;
		//calcula en precio total mas iva del producto	
			totalMasIva = totalBruto+(totalBruto*iva);
			
			
			System.out.println(
					"Producto: "+producto
					+"\nPrecio: "+precio+" "
					+"\nIVA: "+iva
					+"\nCantidad: "+cantidad
					+"\nTotal Sin IVA: "+totalBruto
					+"\nTotal Mas IVA:"+totalMasIva+"\n");
			
		
			ventaBruta+=totalBruto;
			ventaNeta+=totalMasIva;
		
		}	
		
		//paso al cobro de productos comprados
		pago=cobro(ventaNeta);
		
		System.out.println( 
				"Total Venta Bruta: "+ventaBruta
				+"\nTotal Venta mas IVA: "+ventaNeta
				+"\nPagado: "+pago
				+"\nA devolver: "+(pago-ventaNeta));
	}
	
		


}
