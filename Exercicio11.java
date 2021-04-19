import javax.swing.JOptionPane;

public class Exercicio11 {
	public static void main(String[] args) {
		/*
		 * ) Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço
	normal deetiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir
	para ler qual acondição de pagamento escolhida e efetuar o cálculo adequado.
	Código Condição de pagamento
	1 À vista em dinheiro ou cheque, recebe 10% de desconto
	2 À vista no cartão de crédito, recebe 15% de desconto
	3 Em duas vezes, preço normal de etiqueta sem juros
	4 Em duas vezes, preço normal de etiqueta mais juros de 10% 
		 */
		double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Entre com o preço normal do produto de etiqueta: "));
		int tipoPagamento = Integer.parseInt(
				JOptionPane.showInputDialog("1 À vista em dinheiro ou cheque, recebe 10% de desconto "
						+ "\n 2 À vista no cartão de crédito, recebe 15% de desconto"
						+ "\n 3 Em duas vezes, preço normal de etiqueta sem juros"
						+ "\n 4 Em duas vezes, preço normal de etiqueta mais juros de 10%"));
		
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
