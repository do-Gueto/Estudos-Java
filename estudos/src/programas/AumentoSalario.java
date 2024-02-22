package programas;

import javax.swing.JOptionPane;

public class AumentoSalario {

	public static void main (String[] args) {
		String spag;
		double pag;
		spag = JOptionPane.showInputDialog("Digite o Salário do funcionário: R$");
		pag = Double.parseDouble(spag);
		pag = pag + (pag * 0.15);
		JOptionPane.showMessageDialog(null, "Com aumento de 15%, o novo salário do funcionário é: R$" + String.format("%.2f", pag) + ".");
	
	}
}
