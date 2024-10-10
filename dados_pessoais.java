//Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. 
//Fazer um programa que calcule e escreva a maior e a menor altura do grupo, 
//a média de altura das mulheres, e o número de homens.


import java.util.Locale;
import java.util.Scanner;

public class dados_pessoais {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, homens, mulheres;
		double menor, maior, soma, media;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n=sc.nextInt();
		
		double [] altura = new double [n];
		char [] genero = new char [n];
		
		soma=0;
		homens=0;
		for (i=0; i<=n-1; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			altura[i]=sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			genero[i]=sc.next().charAt(0);
			if (genero[i]=='F') {
				soma=soma+altura[i];
			}
			else {
				homens=homens+1;
			}
		}
		menor=altura[0];
		maior=altura[0];
		for (i=0; i<=n-1; i++) {
			if (menor>altura[i]) {
				menor=altura[i];
			}
			if (maior<altura[i]) {
				maior=altura[i];
			}
		}
		System.out.println("Menor altura = " + String.format("%.2f", menor));
		System.out.println("Maior altura = " + String.format("%.2f", maior));
		mulheres=n-homens;
		media=(double)soma/mulheres;
		System.out.println("Media das alturas das mulheres = " + String.format("%.2f", media));
		System.out.println("Numero de homens = " + homens);

		sc.close();
	}

}
