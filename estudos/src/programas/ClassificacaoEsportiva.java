/*Programa que classifica a categoria de um atleta baseada na data de nascimento informada pelo usuário.*/
package programas;

import java.time.YearMonth;

import javax.swing.JOptionPane;

public class ClassificacaoEsportiva {

	public static void main(String[] args) {
		
		String sanoN = JOptionPane.showInputDialog("Digite o ano de nascimento do atleta:");
		int anoN = Integer.parseInt(sanoN);
		int ano = YearMonth.now().getYear();
		int idade = ano - anoN;
		if (idade <= 9) {
			JOptionPane.showMessageDialog(null, "O atleta tem " + idade + " anos.\nAtleta da categoria Mirim.");
		} else if (idade > 9 && idade <= 14) {
			JOptionPane.showMessageDialog(null, "O atleta tem " + idade + " anos.\nAtleta da categoria Infantil.");
		} else if (idade > 14 && idade <= 19) {
			JOptionPane.showMessageDialog(null, "O atleta tem " + idade + " anos.\nAtleta da categoria Junior.");
		} else if (idade > 19 && idade <= 25) {
			JOptionPane.showMessageDialog(null, "O atleta tem " + idade + " anos.\nAtleta da categoria Sênior.");
		} else {
			JOptionPane.showMessageDialog(null, "O atleta tem " + idade + " anos.\nAtleta da categoria Master.");
		}
	}
}