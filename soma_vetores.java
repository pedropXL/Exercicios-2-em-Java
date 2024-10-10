//Faça um programa para ler dois vetores A e B, contendo N elementos cada. 
//Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de 
//A e B. Imprima o vetor C gerado.


import java.util.Scanner;

public class soma_vetores {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int i, n;
		 
		 System.out.print("Quantos valores vai ter cada vetor? ");
		 n=sc.nextInt();
		 
		 int [] x = new int [n];
		 int [] y = new int [n];
		 int [] z = new int [n];
		 
		 System.out.println("Digite os valores do vetor A:");
		 for (i=0; i<=n-1; i++) {
			 x[i]=sc.nextInt();
		 }
		 System.out.println("Digite os valores do vetor B:");
		 for (i=0; i<=n-1; i++) {
			 y[i]=sc.nextInt();
		 }
		 for (i=0; i<=n-1; i++) {
			 z[i]=x[i]+y[i];
		 }
		 System.out.println("VETOR RESULTANTE:");
		 for (i=0; i<=n-1; i++) {
			 System.out.println(z[i]);
		 }
		 sc.close();
	}

}
