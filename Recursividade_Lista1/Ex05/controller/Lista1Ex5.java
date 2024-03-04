package controller;

public class Lista1Ex5 {

	public Lista1Ex5() {
		super();
	}
	
	public Double funcao(int n) {
		//Decrementa ate "n" chegar ao valor 0, e retorna a soma
		if (n == 0) {
			return (double) 0;
		} else {
			//Decrementa "n" e soma o valor na funcao
			return (double) 1 / n + funcao(n - 1);
		}
	}	
}
