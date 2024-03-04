package view;

import controller.Lista1Ex5;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Lista1Ex5 ex = new Lista1Ex5();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
		Double serie = ex.funcao(n);
		System.out.println("Serie = " + serie);
		
	}
}