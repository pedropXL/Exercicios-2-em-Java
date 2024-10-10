//Fazer um programa para ler um número inteiro N (máximo = 10) e uma matriz quadrada de ordem N 
//contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade de 
//valores negativos da matriz.

import java.util.Scanner;

public class diagonal_negativos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, j, n, negativos;
		
		System.out.print("Qual a ordem da matriz? ");
		n=sc.nextInt();
		
		int [][] x = new int [n][n];
		
		negativos=0;
		for (i=0; i<=n-1; i++) {
			for (j=0; j<=n-1; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				x[i][j]=sc.nextInt();
				if (x[i][j]<0) {
					negativos=negativos+1;
				}
			}
		}
		System.out.println("DIAGONAL PRINCIPAL:");
		for (i=0; i<=n-1; i++) {
				System.out.print(x[i][i] + " ");
		}
		System.out.println();
		System.out.println("QUANTIDADE DE NEGATIVOS = " + negativos);
		sc.close();
	}

}
