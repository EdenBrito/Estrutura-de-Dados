package controller;

public class Lista2Ex2 {

	public int funcao (int a, int b){
		
		if( b > a){
			return a;
		}
		a = a - b;
		return funcao(a, b);
	}
}
