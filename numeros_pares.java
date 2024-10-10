//Faça um programa que leia N números inteiros e armazene-os em um vetor. 
//Em seguida, mostre na tela todos os números pares, e também a quantidade de números pares. 

import java.util.Scanner;

public class numeros_pares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, n, quantidade;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n=sc.nextInt();
		
		int [] vet = new int [n];
		
		for (i=0; i<=n-1; i++) {
			System.out.print("Digite um numero: ");
			vet [i] = sc.nextInt();
		}
		quantidade=0;
		System.out.println();
		System.out.println("NUMEROS PARES:");
		for (i=0; i<=n-1; i++) {
			if (vet[i]%2==0) {
				System.out.print(vet[i] + " ");
				quantidade=quantidade+1;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + quantidade);
		sc.close();
	}

}
