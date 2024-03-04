package view;

import controller.Lista1Ex1;

public class Principal {

	public static void main(String[] args) {
		Lista1Ex1 ex = new Lista1Ex1();
		int n = 8;
		int soma = ex.funcao(n);
		System.out.println("Soma = " + soma);
	}
}
