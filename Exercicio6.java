import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso 
		 * seja ímpar,
		 imprimir o resultado desta operação. 
		 */
		int num = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número: "));
		
		if(num % 2 == 0) {
			num = num + 5;
		} else {
			num = num + 8;
		}
		JOptionPane.showMessageDialog(null, "Valor atual do número: " + num);
	}
}
