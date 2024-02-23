package programas;

import javax.swing.JOptionPane;

public class VerificadorTriangulo {

	public static void main(String[] args) {
		
		String sR1 = JOptionPane.showInputDialog("1º segmento:");
		String sR2 = JOptionPane.showInputDialog("2º segmento:");
		String sR3 = JOptionPane.showInputDialog("3º segmento:");
		int r1 = Integer.parseInt(sR1);
		int r2 = Integer.parseInt(sR2);
		int r3 = Integer.parseInt(sR3);
		if (r1 < r2 + r3 & r2 < r1 + r3 & r3 < r1 + r2) {
			JOptionPane.showMessageDialog(null, "Os segmentos informados podem formar um triângulo.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Os segmentos informados não podem formar um triângulo.");
		}
	}
}
