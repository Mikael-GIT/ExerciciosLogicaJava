import javax.swing.JOptionPane;

public class Exercicio11 {
	public static void main(String[] args) {
		/*
		 * ) Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o pre�o
	normal deetiqueta e a escolha da condi��o de pagamento. Utilize os c�digos da tabela a seguir
	para ler qual acondi��o de pagamento escolhida e efetuar o c�lculo adequado.
	C�digo Condi��o de pagamento
	1 � vista em dinheiro ou cheque, recebe 10% de desconto
	2 � vista no cart�o de cr�dito, recebe 15% de desconto
	3 Em duas vezes, pre�o normal de etiqueta sem juros
	4 Em duas vezes, pre�o normal de etiqueta mais juros de 10% 
		 */
		double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Entre com o pre�o normal do produto de etiqueta: "));
		int tipoPagamento = Integer.parseInt(
				JOptionPane.showInputDialog("1 � vista em dinheiro ou cheque, recebe 10% de desconto "
						+ "\n 2 � vista no cart�o de cr�dito, recebe 15% de desconto"
						+ "\n 3 Em duas vezes, pre�o normal de etiqueta sem juros"
						+ "\n 4 Em duas vezes, pre�o normal de etiqueta mais juros de 10%"));
		
		if(tipoPagamento == 1) {
			valorProduto -= valorProduto * 10/100;
		} else if (tipoPagamento == 2) {
			valorProduto -= valorProduto * 15/100;
		} else if (tipoPagamento == 3) {
			
		} else if (tipoPagamento == 4) {
			valorProduto += valorProduto * 10/100;
		}
		JOptionPane.showMessageDialog(null, "Valor final do produto: " + valorProduto);
	}
}
