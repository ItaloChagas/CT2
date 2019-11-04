package exec3;

import java.util.Scanner;

public class Exec3 {

	public static void main(String[] args) {
		int[] CodProd = new int[10];
		double[] PrecoProd = new double[10];
		int [][] QtdEst = new int[5][10];
		int entrada;
		double Entradapreco=0;
		int repete=0;
		int opcao=0;


		Scanner sc = new Scanner(System.in);

		for(int i =0; i <CodProd.length; i++) {
			System.out.println("Informe o codigo dos produtos: ");
			entrada = sc.nextInt();
			if(entrada <=0) {
				do {
					System.out.println("Informe um valor inteiro valido:");
					entrada = sc.nextInt();
				}while(entrada <=0);				
			}

			while(busca(CodProd,entrada) ==1) {
				System.out.println("Não incluir dados duplicados, tenta novamente");
				entrada = sc.nextInt();
			}

			CodProd[i]=entrada;
		}


		for(int i =0; i <PrecoProd.length; i++) {
			System.out.println("Informe o preco do produto: ");
			Entradapreco = sc.nextDouble();
			if(Entradapreco <=0) {
				do {
					System.out.println("Informe um valor valido:");
					Entradapreco = sc.nextInt();
				}while(Entradapreco <=0);
			}

			PrecoProd[i]=Entradapreco;
		}



		for(int i =0; i <5; i++) {
			System.out.println("Informe o codigo do armazem: ");
			entrada = sc.nextInt();
			if(entrada <=0) {
				do {
					System.out.println("Informe um código válido:");
					entrada = sc.nextInt();
				}while(entrada <=0);
			}

			QtdEst[i][0]=entrada;
		}

		for(int i =0; i <5; i++) {
			for(int j =0; j<10; j++) {
				System.out.println("Informe o estoque do produto "+ CodProd[i] +" para o armazem " +QtdEst[i][0] +":");
				QtdEst[i][j]= sc.nextInt();
			}			
		}


		do {
			System.out.println("Escolha uma das opcoes abaxio: ");
			System.out.println("1 multiplicar");
			System.out.println("2 buscar");
			System.out.println("3 listar");
			System.out.println("4 sair");
			opcao = sc.nextInt();

			if(opcao <1 || opcao >4) {
				do {
					System.out.println("opcao invalida, tenta novamente");
					opcao = sc.nextInt();
				}while(opcao <1 || opcao >4);
			}

			switch(opcao) {
			case 1:

				calcular(QtdEst, CodProd, PrecoProd );
			case 2:
				System.out.println("Informe o código que deseja buscar");
				busca()
			case 3:
			case 4:
			}


		}while(opcao!=4);
		
		System.out.println("Saindo...");

	}



	private static void calcular(int[][] qtdEst, int[] codProd, double[] precoProd) {
		int qtde=0;
		double custo=0;
		for(int i=0; i <5; i++) {
			for(int j =1; j<10; j++) {

				qtde+=qtdEst[i][j];
				custo+=qtdEst[i][j]*precoProd[j];
			}	

			System.out.println("Quantidade de Produtos estocados no Armazém "+(i+1)+": "+qtde);        System.out.println("Custo do Armazém "+(i+1)+": "+custo);   
			qtde=0;       
			custo=0;   
		}

	}




	public static int busca(int vetor[], int entrada) {

		for(int i =0; i<vetor.length; i++) {
			if(vetor[i] == entrada) {
				return 1;
			}
		}

		return 0;
	}

}
