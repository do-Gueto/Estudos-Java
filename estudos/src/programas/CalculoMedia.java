package programas;

import javax.swing.JOptionPane;

public class CalculoMedia {
	public static void main (String[] args) {
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		double n4 = 0;
		
		for (int c = 1; c <= 4; c++) {
			String nota = JOptionPane.showInputDialog("Digite a nota " + c + " :");
			if (c == 1) {
				n1 = Double.parseDouble(nota);	
			}else if(c == 2) {
				n2 = Double.parseDouble(nota);
			}else if(c == 3) {
				n3 = Double.parseDouble(nota);
			}else if(c == 4) {
				n4 = Double.parseDouble(nota);
			}
		}
		double media = (n1 + n2 + n3 + n4) / 4;
		if (media >= 7) {
			JOptionPane.showMessageDialog(null, "Aluno aprovado com média: " + media);
		}else if(media >= 5 & media < 7) {
			JOptionPane.showMessageDialog(null, "Aluno em recuperação com média: " + media);
		}else {
			JOptionPane.showMessageDialog(null, "Aluno reprovado com média: " + media);
		}
	}
}