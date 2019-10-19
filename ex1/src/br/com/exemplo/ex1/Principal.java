package br.com.exemplo.ex1;

import java.util.Scanner;

public class Principal {

	public static void main(String args[]) {

		Calculos c = new Calculos();
		int op = 5;
		Scanner input = new Scanner(System.in);

		System.out.println("-Opções-");
		System.out.println("1. Soma");
		System.out.println("2. Subtracao");
		System.out.println("3. Multiplicacao");
		System.out.println("4. Divisao");
		System.out.println("0. Sair");
		System.out.println("Escolha uma opção");
		op = input.nextInt();

		while (op != 0) {

			if (op == 1) {
				int result = c.som(3, 4);
				System.out.println("a soma é igual a " + result);
				break;
			}
			if (op == 2) {

				int result = c.sub(5, 2);
				System.out.println("a subtração é igual a " + result);
				break;
			}
			if (op == 3) {
				int result = c.mult(5, 2);
				System.out.println("a soma é igual a " + result);
				break;
			}
			if (op == 4) {
				int result = c.div(6, 2);
				System.out.println("a soma é igual a " + result);
				break;
			} else {
				System.out.println("numero inválido");
				break;
			}

		}
	}
}