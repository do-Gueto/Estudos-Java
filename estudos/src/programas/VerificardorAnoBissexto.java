package programas;

import javax.swing.JOptionPane;

import java.time.YearMonth;

public class VerificardorAnoBissexto {

	public static void main(String[] args) {

		String sAno;
		int ano;
		sAno = JOptionPane.showInputDialog("Digite o ano para análise ou digite 0 para analisar o ano atual:");
		ano = Integer.parseInt(sAno);
		if (ano == 0) {
			
			//método usado para obter o ano do sistema do usuário como valor inteiro.
			ano = YearMonth.now().getYear();
			
		}
		if (ano % 4 == 0 & ano % 100 != 0 | ano % 400 ==0) {
			JOptionPane.showMessageDialog(null, ano + " é um ano bissexto.");
		} else {
			JOptionPane.showMessageDialog(null, ano + " não é um ano bissexto.");
		}
	}
}
