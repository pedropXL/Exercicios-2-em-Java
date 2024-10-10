//Ler uma matriz quadrada de ordem N (máximo = 10), contendo números reais. Em seguida, fazer as 
//seguintes ações: 
//a) calcular e imprimir a soma de todos os elementos positivos da matriz. 
//b) fazer a leitura do índice de uma linha da matriz e, daí, imprimir todos os elementos desta linha. 
//c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir todos os elementos desta coluna. 
//d) imprimir os elementos da diagonal principal da matriz. 
//e) alterar a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida imprimir a 
//matriz alterada. 


import java.util.Locale;
import java.util.Scanner;

public class matriz_geral {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, j, n;
		double soma;
		
		System.out.print("Qual a ordem da matriz? ");
		n=sc.nextInt();
		
		double [][] x = new double [n][n];
		
		for (i=0; i<=n-1; i++) {
			for (j=0; j<=n-1; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				x[i][j]=sc.nextDouble();
			}
		}
		
		soma=0;
		for (i=0; i<=n-1; i++) {
			for (j=0; j<=n-1; j++) {
				if (x[i][j]>0) {
					soma=soma+x[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("SOMA DOS POSITIVOS: " + String.format("%.1f", soma));
		System.out.println();
		
		System.out.print("Escolha uma linha: ");
		i=sc.nextInt();
		System.out.print("LINHA ESCOLHIDA: ");
		for (j=0; j<=n-1; j++) {
			System.out.print(x[i][j] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.print("Escolha uma coluna: ");
		j=sc.nextInt();
		System.out.print("COLUNA ESCOLHIDA: ");
		for (i=0; i<=n-1; i++) {
			System.out.print(x[i][j] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.print("DIAGONAL PRINCIPAL: ");
		for (i=0; i<=n-1; i++) {
			System.out.print(x[i][i] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("MATRIZ ALTERADA:");
		for (i=0; i<=n-1; i++) {
			for (j=0; j<=n-1; j++) {
				if (x[i][j]<0) {
					System.out.print(Math.pow(x[i][j], 2) + " ");
				}
				else {
					System.out.print(x[i][j] + " ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}

