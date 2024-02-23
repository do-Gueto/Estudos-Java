package programas;

import javax.swing.JOptionPane;

public class NovoSalario {

	public static void main(String[] arms) {
		
		String sSal;
		double sal;
		double nsal;
		sSal = JOptionPane.showInputDialog("Digite o salário atual do funcionário R$:");
		sal = Double.parseDouble(sSal);
		if (sal <= 1250) {
			nsal = sal + sal * 0.15;
		}
		else {
			nsal = sal + sal * 10;
		}
		JOptionPane.showMessageDialog(null, "Quem recebia R$" + String.format("%.2f", sal)+ " agora irá receber R$"
		                                    + String.format("%.2f", nsal) + ".");
	}
}
