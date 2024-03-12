package view;

import javax.swing.JOptionPane;
import controller.Ordenacao;

public class Principal {

	public static void main(String[] args) {
		Ordenacao ord = new Ordenacao();
		
		int [] vet1 = {74,20,74,87,81,16,25,99,44,58};
		int[] vet2 = {44,43,42,41,40,39,38};
				
		int opc;
				
		opc =Integer.parseInt(JOptionPane.showInputDialog("Escolha o Vetor \n 1 - Vetor 1 por BubbleSort \n 2 - Vetor 2 por BubbleSort \n 3 - Vetor 1 por MergeSort \n 4 - Vetor 2 por MergeSort "));
		
		switch (opc) {
		case 1:			
			vet1 = ord.funbubble(vet1);
			ord.mostrabb(vet1);
			break;
		case 2:			
			vet2 = ord.funbubble(vet2);
			ord.mostrabb(vet2);
			break;
		case 3:
			vet1 = ord.funmerge(vet1, 0, vet1.length -1);
			ord.mostramg(vet1, 0, vet1.length -1);
			break;
		case 4:			
			vet2 = ord.funmerge(vet2, 0, vet2.length -1);
			ord.mostramg(vet2, 0, vet2.length -1);
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}
	}
}
