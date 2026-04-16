package iniciales.Practica_POO2.unoFlashero;

public class StreetNumber {
	
	// private static int gauss(int n){
	// 	if(n==1)return 1;
	// 	return n+gauss(n-1);
	// }
	
	private static int gauss(int n){
	 return n*(n+1)/2;
	}
	
	public static int iterativoConGauss(int n){
		if(n<3) return -1;

		for(int i=2; i<n; i++){
			int sumaIzq=gauss(i-1);
			int sumaDer=gauss(n)-gauss(i);
			if(sumaDer==sumaIzq)return i;

		}
		return -1;
		
	}

	public static int iterativoCuadratico(int n){
		if(n<3) 
			return -1;

		for(int i=2; i<n; i++){
			
			int sumaIzq=0;
			for (int j=1; j<i;j++)
				sumaIzq+=j;
			
			int sumaDer=0;
			for (int k=i+1; k<=n;k++)
				sumaDer+=k;
			
			if(sumaDer==sumaIzq)return i;
		}
		
		return -1;
	}

	public static int iterativoLineal(int n){
		if(n<3) return -1;

		for(int i=2; i<n; i++){

			int sumaIzq=(i-1)*i/2;
			int sumaDer=(n*(n+1)-i*(i+1))/2;
			
			if(sumaDer==sumaIzq)return i;
		}
		return -1;
	}

	public static int matematicoConstante(int n){
		if(n<3) return -1;

		double i= Math.sqrt((Math.pow(n, 2)+n)/2);
		int entera=(int)i;
		if((i-entera) == 0) return (int) i;

		return -1;

	}

	public static void main(String[] args) {
		
//	      6         8
//	      35        49
//	     204       288
//	    1189      1681
//	    6930      9800
//	   40391     57121
//	  235416    332928
//	 1372105   1940449
//	 7997214  11309768
//	46611179  65918161
		
		int n=9800;
		//int n= 57121;
		//int n= 332929;
		//int n= 1940449;
		
		long tIni = System.currentTimeMillis();
		System.out.println(matematicoConstante(n));
		long tFin = System.currentTimeMillis();
		long diff = tFin - tIni;
		System.out.println("Tiempo de ejecucion del matematicoConstante  "+diff);
		System.out.println("-----------------------------------------");

		tIni = System.currentTimeMillis();
		System.out.println(iterativoConGauss(n));
		tFin = System.currentTimeMillis();
		diff = tFin - tIni;
		System.out.println("Tiempo de ejecucion del iterativoLineal  "+diff);
		System.out.println("-----------------------------------------");

		tIni = System.currentTimeMillis();
		System.out.println(iterativoCuadratico(n));
		tFin = System.currentTimeMillis();
		diff = tFin - tIni;
		System.out.println("Tiempo de ejecucion del iterativoCuadratico  "+diff);
		System.out.println("-----------------------------------------");

//		tIni = System.currentTimeMillis();
//		System.out.println(conGauss(n));
//		tFin = System.currentTimeMillis();
//		diff = tFin - tIni;
//		System.out.println("Tiempo de ejecucion con Gauss  "+diff);
//
		long pares = 0;
	    double i = 8;
	    while(pares < 15) {
	        double j = Math.sqrt(i * (i + 1) / 2);
	        if( j == (long) j) {
	            System.out.println(j + "  "+ i);
	            pares++;
	        }
	        i++;
	    }	
	}
}
