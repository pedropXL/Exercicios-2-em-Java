//Ler um inteiro N (máximo = 10) e uma matriz quadrada de ordem N contendo números inteiros. 
//Mostrar a soma dos elementos acima da diagonal principal. 
//Um exemplo de números acima da diagonal principal é mostrado á baixo (no caso as números sublinhados). 


import java.util.Scanner;

public class acima_diagonal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, j, n, soma;
		
		System.out.print("Qual a ordem da matriz? ");
		n=sc.nextInt();
		
		int x [][] = new int [n][n];
		
		for (i=0; i<=n-1; i++) {
			for (j=0; j<=n-1; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				x[i][j]=sc.nextInt();
			}
		}
		soma=0;
		for (i=0; i<=n-1; i++) {
			for (j=0; j<=n-1; j++ ) {
				if (i<j) {
					soma=soma+x[i][j];
					}   
				}
			}
		System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + soma);
		sc.close();
		}

	}
