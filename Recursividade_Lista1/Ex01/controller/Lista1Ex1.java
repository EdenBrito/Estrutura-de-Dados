package controller;

public class Lista1Ex1 {

	public Lista1Ex1() {
		super();
	}

	public int funcao(int n) {
		//Enquanto "n" possuir valor positivo nao executará o "if", e quando "n" for igual a 0, retorna 0 na funcao	
		if (n == 0) {
			return 0;
		} else {
			//O valor de "n" é somado a função "n-1" até que "n" seja igual a 0.
			return n + funcao(n - 1);
		}
	}
}
