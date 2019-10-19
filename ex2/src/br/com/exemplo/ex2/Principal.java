package br.com.exemplo.ex2;

public class Principal {

	public static void main(String[] args) {
		int n1 = 0;
		int i;

		for (i = 1; i <= 100; i++) {
			if (i % 2 == 1)
				n1 = n1 + i;
		}
		System.out.println("A soma dos cem primeiros números impares é: " + n1);
	}

}
