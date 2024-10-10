//Fazer um programa para ler um vetor de N números inteiros. 
//Em seguida, mostrar na tela a média aritmética somente dos números pares lidos, com uma casa decimal. 
//Se nenhum número par for digitado, mostrar a mensagem "NENHUM NUMERO PAR".

import java.util.Locale;
import java.util.Scanner;

public class media_pares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, soma, quantidade;
		double media;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n=sc.nextInt();
		
		int [] x = new int [n];
		
		soma=0;
		quantidade=0;
		for (i=0; i<=n-1; i++) {
			System.out.print("Digite um numero: ");
			x[i]=sc.nextInt();
			if (x[i]%2==0) {
				soma=soma+x[i];
				quantidade=quantidade+1;
			}
		}
		if (quantidade==0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			media=(double)soma/quantidade;
			System.out.println("MEDIA DOS PARES = " + String.format("%.1f", media));
		}
		sc.close();
	}

}
