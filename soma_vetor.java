//Faça um programa que leia N números reais e armazene-os em um vetor. 
//Em seguida: - Imprimir todos os elementos do vetor - 
//Mostrar na tela a soma e a média dos elementos do vetor 


import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n;
		double soma, media;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n=sc.nextInt();
		
		double [] x = new double [n];
		
		soma=0;
		for (i=0; i<=n-1; i++) {
			System.out.print("Digite um numero: ");
			x[i]=sc.nextDouble();
			soma=soma+x[i];
		}
		System.out.print("VALORES = ");
		for (i=0; i<=n-1; i++) {
			System.out.print(String.format("%.1f", x[i]) + " ");
		}
		System.out.println();
		System.out.println("SOMA = " + String.format("%.2f", soma));
		media=(double)soma/n;
		System.out.println("MEDIA = " + String.format("%.2f", media));
		
		sc.close();
	}

}
