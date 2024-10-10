//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. 
//Em seguida, mostrar na tela a média aritmética de todos elementos com três casas decimais. 
//Depois mostrar todos os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 


import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n;
		double soma, media;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n=sc.nextInt();
		
		double [] x = new double [n];
		
		soma=0;
		for (i=0; i<=n-1; i++) {
			System.out.print("Digite um numero: ");
			x[i]=sc.nextDouble();
			soma=soma+x[i];
		}
		media=(double)soma/n;
		System.out.println();
		System.out.println("MEDIA DO VETOR = " + String.format("%.3f", media));
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (i=0; i<=n-1; i++) {
			if (x[i]<media) {
				System.out.println(x[i]);
			}
		}
		sc.close();
	}

}
