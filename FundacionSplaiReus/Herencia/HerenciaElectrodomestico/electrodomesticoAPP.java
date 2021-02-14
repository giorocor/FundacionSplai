package HerenciaElectrodomestico;



public class electrodomesticoAPP {

	public static Electrodomestico[] cargarArray() {
	
		Electrodomestico[] electrodomestico1= new Electrodomestico[10];
		
		electrodomestico1[0]=new Lavadora(200,51);
		electrodomestico1[1]=new Television();
		electrodomestico1[2]=new Lavadora(6);
		electrodomestico1[3]=new Electrodomestico(100,"azul",'B',52);
		electrodomestico1[4]=new Lavadora();
		electrodomestico1[5]=new Television(100,5);
		electrodomestico1[6]=new Television(50,true,102,"azul",'B',32);
		electrodomestico1[7]=new Lavadora(200,61);
		electrodomestico1[8]=new Electrodomestico(50,"negro",'D',82);
		electrodomestico1[9]=new Lavadora(40);
		
		return electrodomestico1;
	}
	
	public static void imprimirTotalPrecios() {
		double totalElectro, totalLavadora, totalTv;
		
		totalElectro=0;
		totalLavadora=0;
		totalTv=0;
		Electrodomestico[] electrodomestico1=cargarArray();
		
		for(int i=0;i<10;i++) {
			if(electrodomestico1[i] instanceof Electrodomestico) {
				totalElectro+=electrodomestico1[i].precioFinal();
			}
			if(electrodomestico1[i] instanceof Lavadora) {
				totalLavadora+=electrodomestico1[i].precioFinal();
			}
			if(electrodomestico1[i] instanceof Television) {
				totalTv+=electrodomestico1[i].precioFinal();
			}
			
			//System.out.println(electrodomestico1[i].toString()+" "+electrodomestico1[i].precioFinal());
		}
		
		System.out.println("Electrodomestico: "+totalElectro+"\n"
				+ "Lavadora: "+totalLavadora+"\n"
						+ "Television: "+totalTv);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprimirTotalPrecios();
	}

}
