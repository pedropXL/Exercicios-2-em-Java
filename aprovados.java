//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 
//1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. 
//Depois, imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das 
//notas seja maior ou igual a 6.0 (seis).


import java.util.Locale;
import java.util.Scanner;

public class aprovados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n;
		double soma, media;
		
		System.out.print("Quantos alunos serao digitados? ");
		n=sc.nextInt();
		
		String [] nome = new String [n];
		double [] nota1 = new double [n];
		double [] nota2 = new double [n];
		
		for (i=0; i<=n-1; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
			sc.nextLine();
			nome[i]=sc.nextLine();
			nota1[i]=sc.nextDouble();
			nota2[i]=sc.nextDouble();
		}
		System.out.println("Alunos aprovados:");
		for (i=0; i<=n-1; i++) {
			soma=nota1[i]+nota2[i];
			media=soma/2.0;
			if (media>=6.0) {
				System.out.println(nome[i]);
			}
		}
		sc.close();
	}

}
