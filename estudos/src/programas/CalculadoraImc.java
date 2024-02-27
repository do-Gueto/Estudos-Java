/*Programa que calcula o imc baseado nas informações fornecidas pelo o usuário.*/
package programas;

import javax.swing.JOptionPane;

public class CalculadoraImc {

	public static void main(String[] args) {
		
		String sPeso = JOptionPane.showInputDialog("Digite seu peso:");
		double peso = Double.parseDouble(sPeso);
		String sAltura = JOptionPane.showInputDialog("Digite sua altura: ");
		double altura = Double.parseDouble(sAltura);
		double imc = peso / (Math.pow(altura, 2));
		if (imc <= 18.5) {
			JOptionPane.showMessageDialog(null, "IMC: " + String.format("%.2f", imc) + ".\nSituação: ABAIXO DO PESO.");
		} else if (imc > 18.5 && imc <= 25) {
			JOptionPane.showMessageDialog(null, "IMC: " + String.format("%.2f", imc) + "\nSituação: PESO NORMAL.");
		} else if (imc > 25 && imc <= 30) {
			JOptionPane.showMessageDialog(null, "IMC: " + String.format("%.2f", imc) + "\nSituação: ACIMA DO PESO.");
		} else if (imc > 30 && imc <= 40) {
			JOptionPane.showMessageDialog(null, "IMC: " + String.format("%.2f", imc) + "\nSituação: OBESIDADE.");
		} else {
			JOptionPane.showMessageDialog(null, "IMC: " + String.format("%.2f", imc) + "\nSituação: OBESIDADE MÓRBIDA. ");
		}
	}
}