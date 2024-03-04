package controller;

public class Lista1Ex4 {

	public Lista1Ex4() {
		super();
	}
	
	public int funcao(int []vet, int tam) {
		//Quando chegar a primeira posicao do vetor, retorna o valor 0
		if (tam == 0) {
			return 0;
		} else {
			
			//Verifica e armazena se o elemento na posicao é negativo
			int valor = vet[tam];
			tam--;
			if (valor < 0) {
				return 1 + funcao(vet, tam);
			} else {
				return funcao(vet, tam);
			}
		}
	}	
}