package programas;

import javax.swing.JOptionPane;

public class ParOuImpar {

	public static void main(String[] args) {
		String sn;
		int n;
		sn = JOptionPane.showInputDialog("Digite um número:");
		n = Integer.parseInt(sn);
		if (n % 2 == 0) {
			JOptionPane.showMessageDialog(null, n + " é um número par.");
		} else {
			JOptionPane.showMessageDialog(null, n + " é um número ímpar.");
		}
	}
}
