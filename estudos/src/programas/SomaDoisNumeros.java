package programas;

import javax.swing.JOptionPane;

public class SomaDoisNumeros{
	public static void main (String[] args) {
		String sn1;
		String sn2;
		double n1;
		double n2;
		double soma;
		
		sn1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
		sn2 = JOptionPane.showInputDialog("Digite o segundo valor: ");
		n1 = Double.parseDouble(sn1);
		n2 = Double.parseDouble(sn2);
		soma = (n1 + n2);
		JOptionPane.showMessageDialog(null, "A soma entre os dois valores é: " + soma);
	
	}

}
