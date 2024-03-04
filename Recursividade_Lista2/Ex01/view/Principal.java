package view;

import controller.Lista2Ex1;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		Lista2Ex1 ex = new Lista2Ex1();
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		System.out.println(ex.funcao(n1, n2));
	}
}
