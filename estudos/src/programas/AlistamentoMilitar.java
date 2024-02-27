/*Programa que calcula a situação militar baseada no ano de nascimento do usuário. */
package programas;

import java.time.YearMonth;

import javax.swing.JOptionPane;

public class AlistamentoMilitar {

	public static void main(String[] args) {
		
		String sAnoN = JOptionPane.showInputDialog("Digite o ano de nascimento:");
		int anoN = Integer.parseInt(sAnoN);
		int ano = YearMonth.now().getYear();
		int idade = ano - anoN;
		if(idade == 18) {
			JOptionPane.showMessageDialog(null, "Seu ano de alistamento é: " + (anoN + 18) + ".\nSe aliste imediatamente!");
		} else if(idade < 18) {
			JOptionPane.showMessageDialog(null, "Seu ano de alistamento será: " + (anoN + 18) + ".\nFaltam " + (18 - idade) + " ano(s) para o alistamento.");
		} else {
			JOptionPane.showMessageDialog(null, "Seu ano de alistamento foi: " + (anoN + 18) + ".\nSe passaram " + (ano - (anoN + 18)) + " anos do seu ano de alistamento.\nProcure a junta militar mais próxima!");
		}
	}
}
