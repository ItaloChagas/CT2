package exec2;

public class Exec2 {

	public static void main(String[] args) {

		int[] vetor = {11,3,43,55,67,55,32,357,88,343};
		
		ordena(vetor);
	}
	
	public static void ordena(int[] vetor) {
		int maior_valor=0;
		int maior_indice=0;
		
		for(int i =0; i < vetor.length-1; i++) {
			maior_valor= vetor[i];
			maior_indice=i;
			
			for(int j =i+1; j< vetor.length; j++) {
				
				if(maior_valor < vetor[j]) {
					maior_valor = vetor[j];
					maior_indice = j;
				}
			}
			
			vetor[maior_indice] = vetor[i];
			vetor[i] = maior_valor;
			
		}
		
		for(int i =0; i<vetor.length; i++) {
			
			System.out.println(vetor[i]);
		}
	}

}
