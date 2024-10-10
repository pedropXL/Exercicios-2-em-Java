//Fazer um programa para ler dois números inteiros M e N (máximo = 10). 
//Em seguida, ler uma matriz de M linhas e N colunas contendo números reais. 
//Gerar um vetor de modo que cada elemento do vetor seja a soma dos elementos da linha 
//correspondente da matriz. Mostrar o vetor gerado. 


import java.util.Locale;
import java.util.Scanner;

public class soma_linhas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, j, n, m;
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		n=sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		m=sc.nextInt();
		
		double [][] x = new double [n][m];
		double [] vet = new double [n];
		
		for (i=0; i<=n-1; i++) {
			System.out.println("Digite os elementos da " + (i+1) + "a. linha:");
			for (j=0; j<=m-1; j++) {
				x[i][j]=sc.nextDouble();
			}
		}
		for (i=0; i<=n-1; i++) {
			vet[i]=0;
			for (j=0; j<=m-1; j++) {
				vet[i]=vet[i]+x[i][j];
			}
		}
		System.out.println("VETOR GERADO:");
		for (i=0; i<=n-1; i++) {
			System.out.println(String.format("%.1f", vet[i]));
		}
		sc.close();
	}

}
