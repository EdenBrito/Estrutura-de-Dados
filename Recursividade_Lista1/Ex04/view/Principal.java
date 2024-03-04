package view;

import controller.Lista1Ex4;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Lista1Ex4 ex = new Lista1Ex4();
		
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
		int[] vetor = new int[tamanho];
		
		for (int i = 0; i < tamanho; i ++){
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para incluir no vetor:"));
		}
		System.out.println("Vetor com um total de " + ex.funcao(vetor, tamanho-1) + " elementos negativos!!");
		
	}
}