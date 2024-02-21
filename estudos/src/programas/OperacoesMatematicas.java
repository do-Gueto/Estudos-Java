package programas;


import javax.swing.JOptionPane;

import java.lang.Math;

public class OperacoesMatematicas {
	
	public static void main (String[] args) {
		String sn1;
		double n1;
		double dobro;
		double triplo;
		double raiz;
		
		sn1 = JOptionPane.showInputDialog("Digite um valor: ");
		n1 = Double.parseDouble(sn1);
		dobro = (n1 * 2);
		triplo = (n1 * 3);
		raiz = Math.pow(n1, 0.5);
		JOptionPane.showMessageDialog(null, "O dobro de " + n1 + " é: " + dobro + ".\n"
		+ "O triplo de " + n1 + " é: " + triplo + ".\n" + "A raiz quadrada de " + n1 + " é: " + raiz + ".");
		
	}
}
