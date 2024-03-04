package view;

import controller.Lista2Ex2;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		Lista2Ex2 ex = new Lista2Ex2();
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor: "));
		System.out.println("O resto eh :" + ex.funcao(n1, n2));
	}
}
