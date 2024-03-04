package view;

import controller.Lista2Ex3;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		Lista2Ex3 ex = new Lista2Ex3();
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
		int[] vet1 = new int[tamanho];
		
		for (int i = 0; i < tamanho; i ++){
			vet1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para incluir no vetor:"));
		}
		
		System.out.println(ex.funcao(vet1, tamanho - 1, 0));
	}
}
