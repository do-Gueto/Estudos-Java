/*Programa que faz o gerenciamento de pagamentos de uma compra, onde o usuário informa o valor e o método de pagamento.
 *Há possibilidades de pagar a vista em dinheiro ou cheque, a vista no cartão, parcelar em 2x e parcelar em 3x ou mais.
 *Quando as opções a vista são escolhidas é aplicado um desconto de 10% ou 5% no valor do produto. Quando a opção de 
 *parcelamento em 2x é escolhida não é aplicado desconto nem juros. E quando a opção de parcelamento em 3x ou mais é
 *escolhida, é aplicado o juros de 20% do valor do produto. */
package programas;

import javax.swing.JOptionPane;

public class GerenciadorPagamentos {

	public static void main(String[] args) {
		
		String sValor = JOptionPane.showInputDialog("Digite o valor das compras R$:");
		double valor = Double.parseDouble(sValor);
		String sOp = JOptionPane.showInputDialog("Escolha uma das opções:\n"
				+ "[1] À VISTA EM DINHEIRO OU CHEQUE\n"
				+ "[2] À VISTA NO CARTÃO\n"
				+ "[3] 2X NO CARTÃO DE CRÉDITO\n"
				+ "[4] 3X OU MAIS NO CARTÃO DE CRÉDITO\n");
		switch (sOp) {
			case ("1"):
				JOptionPane.showMessageDialog(null, "10% de desconto aplicado ao valor!\nSua compra custará R$" + String.format("%.2f", (valor - (valor * 0.10))));
				break;
			case ("2"):
				JOptionPane.showMessageDialog(null, "5% de desconto aplicado ao valor!\nSua compra custará R$" + String.format("%.2f", (valor - (valor * 0.05))));
				break;
			case ("3"):
				JOptionPane.showMessageDialog(null, "Nenhum desconto aplicado ao valor!\nSua compra custará R$" + String.format("%.2f", valor));
				break;
			case ("4"):
				String sPar = JOptionPane.showInputDialog(null, "Digite a quantidade de parcelas: ");
				int par = Integer.parseInt(sPar);
				JOptionPane.showMessageDialog(null, "20% de juros aplicado ao valor!\nSua compra custará R$" + (valor + (valor * 0.20)) +
						" dividida em " + par + " parcelas de R$" + String.format("%.2f", ((valor + (valor * 0.20))/ par)));
				break;
			default:
			JOptionPane.showMessageDialog(null, "Opção inválida!");
		}
		JOptionPane.showMessageDialog(null, "Programa finalizado!");
		
	}
}
