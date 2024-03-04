package view;

import controller.Lista1Ex2;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Lista1Ex2 ex = new Lista1Ex2();
		
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
		int[] vet1 = new int[tamanho];
		
		for (int i = 0; i < tamanho; i ++){
			vet1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para incluir no vetor:"));
		}
		System.out.println(ex.funcao(vet1, tamanho-1));
	}
}
