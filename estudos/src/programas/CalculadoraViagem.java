package programas;

import javax.swing.JOptionPane;

public class CalculadoraViagem {

	public static void main(String[] args) {

		String sdist;
		double dist;
		double valor;
		sdist = JOptionPane.showInputDialog("Digite a distância de sua viagem: (Km)");
		dist = Double.parseDouble(sdist);
		if (dist < 200) {
			valor = dist * 0.50;
		} else {
			valor = dist * 0.45;
		}
		JOptionPane.showMessageDialog(null, "Você está prestes a iniciar uma viagem de " + dist + "Km.\n"
				                          + "Valor a ser cobrado: R$ " + String.format("%.2f", valor));
	}
}
