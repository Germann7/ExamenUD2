package es.oretania;

public class SumaEnteros {
	
	public static void main(String[] args) {
		try {
			int [] numeros = {1,2,3,4,5,6,7,8,9,10};
			int resultado = calcularSuma(numeros);
			System.out.println("La suma total es :"+resultado);
			
		} catch (Exception e) {
	}

}
	public static int calcularSuma(int[] valores) throws Exception {
		int suma =0;
				for (int i =0; i<= valores.length;i++) {
					suma+=valores[i];
				}
		return suma;
	}
		
	}
