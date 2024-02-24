/*Programa que faz a conversão de qualquer número inteiro de escolha do usuário para binário, octal ou hexadecimal
 * conforme a vontade do usuário. O programa só é finalizado quando o usuário decidir e não é possível digitar 
 * outra opção além das 3 disponívels */
package programas;

import javax.swing.JOptionPane;

public class ConversorBasesNumericas {

	public static void main(String[] args) {
		boolean continuar = true;
		while (continuar) {
			String sn = JOptionPane.showInputDialog("Digite um número inteiro:");
			int n = Integer.parseInt(sn);
			String sEscolha;
			while (true) {
				sEscolha = JOptionPane.showInputDialog("Escoha uma das opções abaixo para conversão:"
						+ "\n[1] para binário" + "\n[2] para octal" + "\n[3] para hexadecimal");
				if (sEscolha.equals("1") | sEscolha.equals("2") | sEscolha.equals("3")) {
					break;
				}else {
					JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
				}
			}

			int escolha = Integer.parseInt(sEscolha);
			switch (escolha) {
			case 1:
				JOptionPane.showMessageDialog(null, n + " convertido para binário é: " + Integer.toBinaryString(n));
				break;

			case 2:
				JOptionPane.showMessageDialog(null, n + " convertido para octal é: " + Integer.toOctalString(n));
				break;

			case 3:
				JOptionPane.showMessageDialog(null, n + " convertido para hexadecimal é: " + Integer.toHexString(n));
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcção inválida!");
				break;
			}

			int dec = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (dec == 1) {
				continuar = false;
				break;
			} else if (dec == 2) {
				continuar = false;
				break;
			}
		}
		JOptionPane.showMessageDialog(null, "Programa finalizado.");
	}
}