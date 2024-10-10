//Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. 
//Para isto, mandou digitar um conjunto de N mercadorias, cada uma contendo nome, preço de compra e 
//preço de venda das mesmas. Fazer um programa que leia tais dados e determine e escreva quantas 
//mercadorias proporcionaram: 
//	• lucro < 10%  
//	• 10% ≤ lucro ≤ 20%  
//	• lucro > 20% 
//Determine e escreva também o valor total de compra e de venda de todas as mercadorias, 
//assim como o lucro total. 


import java.util.Locale;
import java.util.Scanner;

public class problema_comerciante {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, lucroAb, lucroEn, lucroAc;
		double totalCompra, totalVenda, lucroTotal, porcentagem;
		
		System.out.print("Serao digitados dados de quantos produtos? ");
		n=sc.nextInt();
		
		String [] produto = new String [n];
		double [] preco = new double [n];
		double [] venda = new double [n];
		
		lucroAb=0;
		lucroEn=0;
		lucroAc=0;
		totalCompra=0;
		totalVenda=0;
		for (i=0; i<=n-1; i++) {
			System.out.println("Produto " + (i+1));
			System.out.print("Nome: ");
			sc.nextLine();
			produto[i]=sc.nextLine();
			System.out.print("Preco de compra: ");
			preco[i]=sc.nextDouble();
			System.out.print("Preco de venda: ");
			venda[i]=sc.nextDouble();
			porcentagem=100.0/preco[i]*(venda[i]-preco[i]);
			if (porcentagem<10) {
				lucroAb=lucroAb+1;
			}
			else if (porcentagem<=20) {
				lucroEn=lucroEn+1;
			}
			else {
				lucroAc=lucroAc+1;
			}
			totalCompra=totalCompra+preco[i];
			totalVenda=totalVenda+venda[i];
		}
		System.out.println("RELATORIO:");
		System.out.println("Lucro abaixo de 10%: " + lucroAb);
		System.out.println("Lucro entre 10% e 20%: " + lucroEn);
		System.out.println("Lucro acima de 20%: " + lucroAc);
		System.out.println("Valor total de compra: " + String.format("%.2f", totalCompra));
		System.out.println("Valor total de venda: " + String.format("%.2f", totalVenda));
		lucroTotal=totalVenda-totalCompra;
		System.out.println("Lucro total: " + String.format("%.2f", lucroTotal));
		
		sc.close();
	}

}
