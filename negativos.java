//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros e 
//armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 

import java.util.Scanner;

public class negativos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, n;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n=sc.nextInt();
		
		int[] x = new int[n];
		
		for (i=0; i<=n-1; i++) {
			System.out.print("Digite um numero: ");
			x[i]=sc.nextInt();
		}
		System.out.println("NUMEROS NEGATIVOS:");
		for (i=0; i<=n-1; i++) {
			if (x[i]<0) {
				System.out.println(x[i]);
			}
		}
		sc.close();
	}

}
