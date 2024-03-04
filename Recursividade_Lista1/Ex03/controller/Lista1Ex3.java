package controller;

public class Lista1Ex3 {

	public Lista1Ex3() {
		super();
	}
	
	public int funcao(int n) {
		//Retorna o valor 1 quando decrementa "n" até o valor 1
		if (n == 1) {
			return 1;
		} else {
			
			//multiplica n * (n-1)
			return n * funcao(n - 1);
		}
	}	
}
