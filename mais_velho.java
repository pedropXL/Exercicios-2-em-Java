//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. 
//Os nomes devem ser armazenados em um vetor, e as idades em um outro vetor. 
//Depois, mostrar na tela o nome da pessoa mais velha.


import java.util.Scanner;

public class mais_velho {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int i, n, velha;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		n=sc.nextInt();
		
		String [] nome = new String [n];
		int [] idade = new int [n];
		
		velha=0;
		for (i=0; i<=n-1; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i]=sc.nextLine();
			System.out.print("Idade: ");
			idade[i]=sc.nextInt();
			if (velha<idade[i]) {
				velha=idade[i];
			}
		}
		System.out.print("PESSOA MAIS VELHA: ");
		for (i=0; i<=n-1; i++) {
			if (velha==idade[i]) {
				System.out.println(nome[i]);
			}
		}
		sc.close();
	}

}
