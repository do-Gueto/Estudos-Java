package programas;

import javax.swing.JOptionPane;

public class CalculoMulta {

	public static void main (String[] args) {
		String sv;
		int v;
		double vm;
		
		sv = JOptionPane.showInputDialog("Digite a velocidade do veículo (kmh): ");
		v = Integer.parseInt(sv);
		if (v > 80) {
			vm = (v - 80) * 7;
			JOptionPane.showMessageDialog(null, "Velocidade acima do permitido! Veículo multado em: R$" + vm + ".");
		} else {
			JOptionPane.showMessageDialog(null, "Boa viagem! Dirija com Segurança!");
		}
		
	}
}
