package controller;

public class Lista2Ex3 {

	public int funcao(int[] vet, int tam, int pares) {
		
		if (tam < 0){ 
			return pares;
		}

		if( vet[tam] % 2 == 0){
			pares++;
		}

		return funcao(vet, tam - 1, pares);
	}
}