package programas;

import javax.swing.JOptionPane;

public class ConversorDolar {

	public static void main (String[] args) {
		String svalor;
		double dvalor;
		
		
		svalor = JOptionPane.showInputDialog("Digite o valor da sua carteira R$: ");
		dvalor = Double.parseDouble(svalor);
		dvalor = dvalor / 4.94;
		JOptionPane.showMessageDialog(null, "R$" + svalor + " convertido para dólar é USD$: " + String.format("%.2f", dvalor));
	}
}
