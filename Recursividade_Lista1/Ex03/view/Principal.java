package view;

import controller.Lista1Ex3;

public class Principal {

	public static void main(String[] args) {
		Lista1Ex3 ex = new Lista1Ex3();
		
		int n = 5;
		int fat = ex.funcao(n);
		System.out.println("O fatorial de " + n + " é: " + fat);
	}
}
