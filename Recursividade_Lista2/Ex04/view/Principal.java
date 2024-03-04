package view;

import controller.Lista2Ex4;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		Lista2Ex4 ex = new Lista2Ex4();
		int n;
		
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite o  número impar para fazer o Fatorial Duplo:"));
		}
		while ((n % 2) == 0);
		System.out.println(ex.funcao(n));
	}
}
