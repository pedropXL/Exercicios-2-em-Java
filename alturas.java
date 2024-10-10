//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. 
//Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas 
//com menos de 16 anos, bem como os nomes dessas pessoas caso houver. 


import java.util.Locale;
import java.util.Scanner;

public class alturas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, quantidade;
		double soma, media, porcentagem;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n=sc.nextInt();
		
		String [] nome = new String [n];
		int [] idade = new int [n];
		double [] altura = new double [n];
		
		soma=0;
		quantidade=0;
		for (i=0; i<=n-1; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			nome [i] = sc.nextLine();
			System.out.print("Idade: ");
			idade [i] = sc.nextInt();
			System.out.print("Altura: ");
			altura [i] = sc.nextDouble();
			soma=soma+altura[i];
			if (idade[i]<16) {
				quantidade=quantidade+1;
			}
		}
			media=(double)soma/n;
			System.out.println("Altura média: " + String.format("%.2f", media));
			porcentagem=(100.0/n)*quantidade;
			System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", porcentagem) + "%");
			
			for (i=0; i<=n-1; i++) {
				if (idade[i]<16) {
					System.out.println(nome [i]);
				} 
			}
			sc.close();
	}

}
