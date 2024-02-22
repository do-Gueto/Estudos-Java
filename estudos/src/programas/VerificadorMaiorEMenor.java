package programas;

import javax.swing.JOptionPane;

public class VerificadorMaiorEMenor {

	public static void main(String[] args) {
		String sN1 = JOptionPane.showInputDialog("Digite o 1º valor:");
		String sN2 = JOptionPane.showInputDialog("Digite o 2º valor:");
		String sN3 = JOptionPane.showInputDialog("Digite o 3º valor:");
		int n1 = Integer.parseInt(sN1);
		int n2 = Integer.parseInt(sN2);
		int n3 = Integer.parseInt(sN3);
		int maior = n1;
		if (n2 > maior) {
			maior = n2;
		}
		if (n3 > maior) {
			maior = n3;
		}
		int menor = n1;
		if (n2 < menor) {
			menor = n2;
		}
		if (n3 < menor) {
			menor = n3;
		}
		JOptionPane.showMessageDialog(null, "O maior valor digitado foi: " + maior + ".\n"
				                           +"O menor valor digitado foi: " + menor + ".");
	}
}
