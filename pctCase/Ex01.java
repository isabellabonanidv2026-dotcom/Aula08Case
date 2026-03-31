package pctCase;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);
		int option;
		double preco = 0;
		int quantidade;

		System.out.println("Menu lanchonete");
		System.out.println("A- Cafe(R$4)");
		System.out.println("B- Suco (R$6)");
		System.out.println("C- Sanduiche (R$10)");
		System.out.println("Escolha a opção");

		option = receba.nextInt();
		System.out.println("Digite a quantidade");
		quantidade = receba.nextInt();

		switch (option) {
		case 'A':
			preco = 4 * quantidade;
			break;

		case 'B':
			preco = 6 * quantidade;
			break;

		case 'C':
			preco = 10 * quantidade;
			break;
		default:
			System.out.println("Opcao invalida");

		}
		System.out.println("total da compra R$" + preco);
		receba.close();
	}
}
