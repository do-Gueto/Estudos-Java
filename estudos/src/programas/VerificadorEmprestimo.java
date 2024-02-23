/*Programa que verifica a disponibilidade de um empréstimo baseado no valor do empréstimo,
  a quantidade de prestações e quanto a pessoa ganha.*/

package programas;

import javax.swing.JOptionPane;

public class VerificadorEmprestimo {

	public static void main(String[] args) {
		String sVe = JOptionPane.showInputDialog("Digite o valor do empréstimo R$:");
		String sSal = JOptionPane.showInputDialog("Digite o valor do seu salário R$:");
		String sTemp = JOptionPane.showInputDialog("Digite quantos anos de prestações:");
		double ve = Double.parseDouble(sVe);
		double sal = Double.parseDouble(sSal);
		double temp = Double.parseDouble(sTemp);
		double vprest = ve / (temp * 12);
		if (vprest >= sal * 0.30) {
			JOptionPane.showMessageDialog(null, "Empréstimo negado.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Empréstimo disponível.");
		}
	}
}
