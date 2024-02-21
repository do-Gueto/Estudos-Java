package programas;

import javax.swing.JOptionPane;

public class Tabuada {
	public static void main (String[] args) {
		String sn;
		int n;
		sn = JOptionPane.showInputDialog("Digite um Valor: ");
		n = Integer.parseInt(sn);
		JOptionPane.showMessageDialog(null, n + " x " + "1 " + "= " + n * 1 + "\n"
				                          + n + " x " + "2 " + "= " + n * 2 + "\n"
				                          + n + " x " + "2 " + "= " + n * 3 + "\n"
				                          + n + " x " + "2 " + "= " + n * 4 + "\n"
				                          + n + " x " + "2 " + "= " + n * 5 + "\n"
				                          + n + " x " + "2 " + "= " + n * 6 + "\n"
				                          + n + " x " + "2 " + "= " + n * 7 + "\n"
				                          + n + " x " + "2 " + "= " + n * 8 + "\n"
				                          + n + " x " + "2 " + "= " + n * 9 + "\n"
				                          + n + " x " + "2 " + "= " + n * 10 + "\n"				                         );				                          
			
	}
}
