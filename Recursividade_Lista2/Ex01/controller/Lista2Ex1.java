package controller;

public class Lista2Ex1 {

	public int funcao (int a, int b){
		
		if( b <= 1){
			return a;
		}
		return a + funcao(a, b-1);
	}
}
