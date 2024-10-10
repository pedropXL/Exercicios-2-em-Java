//Ler um inteiro N e uma matriz quadrada de ordem N (máximo = 10). 
//Mostrar qual o maior elemento de cada linha. Suponha não haver empates. 

import java.util.Scanner;

public class cada_linha {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int i, j, n, maior;
		 
		 System.out.print("Qual a ordem da matriz? ");
		 n=sc.nextInt();
		 
		 int [][] x = new int [n][n];
		 
		 for (i=0; i<=n-1; i++) {
			 for (j=0; j<=n-1; j++) {
				 System.out.print("Elemento [" + i + "," + j + "]: ");
				 x[i][j]=sc.nextInt();
			 }
		 }
		 for (i=0; i<=n-1; i++) {
			 maior=x[i][0];
			 for (j=0; j<=n-1; j++) {
				 if (maior<x[i][j]) {
					 maior=x[i][j];
				 }
			 }
			 System.out.println(maior);
		 }
		 sc.close();
	}

}
