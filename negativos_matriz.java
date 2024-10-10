//Ler dois números M e N (máximo = 10), e depois ler uma matriz MxN de números inteiros, 
//-4conforme exemplo. Em seguida, mostrar na tela somente os números negativos da matriz.

import java.util.Scanner;

public class negativos_matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, j, n, m;
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		n=sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		m=sc.nextInt();
		
		int [][] x = new int [n][m];
		
		for (i=0; i<=n-1; i++) {
			for (j=0; j<=m-1; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				x[i][j]=sc.nextInt();
			}
		}
		System.out.println("VALORES NEGATIVOS:");
		for (i=0; i<=n-1; i++) {
			for (j=0; j<=m-1; j++) {
				if (x[i][j]<0) {
					System.out.println(x[i][j]);
				}
			}
		}
		sc.close();
	}

}
