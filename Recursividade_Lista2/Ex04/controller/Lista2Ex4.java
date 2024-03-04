package controller;

public class Lista2Ex4 {

	public int funcao (int a){
		if (a <= 1){
			return 1;
		}
		return a * funcao(a - 2);
	}

}
