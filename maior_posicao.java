//Faça um programa que leia N números reais e armazene-os em um vetor. 
//Em seguida, mostrar na tela o maior número do vetor (supor não haver empates). 
//Mostrar também a posição do maior elemento, considerando a primeira posição como 0 (zero).


import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, posicao;
		double maior;
		
		System.out.print("Quanto numeros voce vai digitar? ");
		n=sc.nextInt();
		
		double [] x = new double [n];
		
		for (i=0; i<=n-1; i++) {
			System.out.print("Digite um numero: ");
			x[i]=sc.nextDouble();
		}
		maior=x[0];
		for (i=0; i<=n-1; i++) {
			if (maior<x[i]) {
				maior=x[i];
			}
		}
		System.out.println();
		System.out.println("MAIOR VALOR = " + String.format("%.1f", maior));
		posicao=0;
		for (i=0; i<=n-1; i++) {
			if (maior==x[i]) {
				posicao=i;
			}
		}
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao);

		sc.close();
	}

}
