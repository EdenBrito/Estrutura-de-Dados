package controller;

import fatec.eden.ordenacao.bubblesort.BubbleSort;
import fatec.eden.ordenacao.mergesort.MergeSort;

public class Ordenacao {

	public Ordenacao() {
		super();
	}
	
	public int [] funbubble(int[] vetor) {
		
		BubbleSort bbst = new BubbleSort();
		System.out.println(bbst);
		return bbst.bubbleSort(vetor);
	}
	
	public int [] funmerge(int[] vetor, int inicio, int fim) {

		MergeSort mgst = new MergeSort();
		System.out.println(mgst);
		return mgst.mergeSort(vetor, inicio, fim);
	}
	
	public void mostrabb(int[] vetor) {
		
		System.out.println("");
		System.out.println("========================================");
		for (int valor : vetor) {
			System.out.print(valor+" ");
		}
		System.out.println("");
		System.out.println("========================================");
	}
	
	public void mostramg(int[] vetor, int inicio, int fim) {
		
		System.out.println("");
		System.out.println("========================================");
		for (int valor : vetor) {
			System.out.print(valor+" ");
		}
		System.out.println("");
		System.out.println("========================================");
	}
}
