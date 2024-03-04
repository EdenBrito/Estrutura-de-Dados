package controller;

public class Lista1Ex2 {
	
	public Lista1Ex2() {
		super();
	}
	int menor = 99999;
	public int funcao(int[] vet, int tam) {
		//Quando chegar a primeira posição do vetor, retorna o menor valor armazenado
		if (tam == 0) {
			return menor;
		} else {
						
			if (vet[tam] < menor) {
				menor = vet[tam];
			}
			
			tam = tam - 1;
			//Decrementa o tamanho do vetor até a primeira posicao e armazena o menor valor encontrado.
			return funcao(vet, tam);
		}
	}
}