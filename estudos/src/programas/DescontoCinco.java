package programas;

import javax.swing.JOptionPane;

public class DescontoCinco {

	public static void main (String [] args) {
		
		String svalor;
		double valor;
		svalor = JOptionPane.showInputDialog("Digite o valor do produto: R$");
		valor = Double.parseDouble(svalor);
		valor = valor - (valor * 0.05);
		JOptionPane.showMessageDialog(null, "Com 5% de desconto, o produto custará: R$" + String.format("%.2f", valor) + ".");
	}
}
