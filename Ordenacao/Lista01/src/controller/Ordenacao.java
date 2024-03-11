package controller;

import fatec.eden.ordenacao.bubblesort.BubbleSort;
import fatec.eden.ordenacao.mergesort.MergeSort;

public class Ordenacao {

	public Ordenacao() {
		super();
	}
	
	public int [] bubblesort(int[] vetor) {
		
		BubbleSort bbst = new BubbleSort();
		int [] nvetor = bbst.bubbleSort(vetor);
		System.out.println(nvetor);
		
		return nvetor;
	}
	
	public int [] mergesort(int[] vetor, int inicio, int fim) {
		
		MergeSort mgst = new MergeSort();
		int [] nvetor = mgst.mergeSort(vetor, inicio, fim);
		System.out.println(nvetor);
		
		return nvetor;
	}
}
