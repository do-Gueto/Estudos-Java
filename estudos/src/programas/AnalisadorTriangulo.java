/*Programa que verifica se 3 segmentos podem formar um triângulo e qual tipo eles formam.*/
package programas;

import javax.swing.JOptionPane;

public class AnalisadorTriangulo {

	public static void main (String[] args) {
		
		String sR1 = JOptionPane.showInputDialog("1º segmento:");
		double r1 = Double.parseDouble(sR1);
		String sR2 = JOptionPane.showInputDialog("2º segmento:");
		double r2 = Double.parseDouble(sR2);
		String sR3 = JOptionPane.showInputDialog("3º segmento:");
		double r3 = Double.parseDouble(sR3);
		if (r1 < r2 + r3 && r2 < r1 + r3 && r3 < r1 + r2) {
			if (r1 == r2 && r2 == r3) {
				JOptionPane.showMessageDialog(null, "Os segmentos informados podem formar um triângulo EQUILÁTERO.");
			} else if (r1 != r2 && r2 != r3 && r3 != r1) {
				JOptionPane.showMessageDialog(null, "Os segmentos informados podem formar um triângulo ESCALENO.");
			} else {
				JOptionPane.showMessageDialog(null, "Os segmentos informados podem formar um triângulo ISÓCELES");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Os segmentos informados não podem formar um triângulo.");
		}
	}
}
