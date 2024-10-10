//Fazer um programa para ler duas matrizes de números inteiros A e B, contendo de M linhas e N 
//colunas cada (M e N máximo = 10). Depois, gerar uma terceira matriz C onde cada elemento desta é a 
//soma dos elementos correspondentes das matrizes originais. Imprimir na tela a matriz gerada.



import java.util.Scanner;

public class soma_matrizes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, j, n, m, soma;
		
		System.out.print("Quantas linhas vai ter cada matriz? ");
		n=sc.nextInt();
		System.out.print("Quantas colunas vai ter cada matriz? ");
		m=sc.nextInt();
		
		int [][] a = new int [n][m];
		int [][] b = new int [n][m];
		
		System.out.println("Digite os valores da matriz A:");
		for (i=0; i<=n-1; i++) {
			for (j=0; j<=m-1; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Digite os valores da matriz B:");
		for (i=0; i<=n-1; i++) {
			for (j=0; j<=m-1; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("MATRIZ SOMA:");
		for (i=0; i<=n-1; i++) {
			for (j=0; j<=m-1; j++) {
				soma=a[i][j]+b[i][j];
				System.out.print(soma + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
