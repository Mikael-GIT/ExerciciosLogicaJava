import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {
		/*
		 * Fa�a um algoritmo que leia uma vari�vel e some 5 caso seja par ou some 8 caso 
		 * seja �mpar,
		 imprimir o resultado desta opera��o. 
		 */
		int num = Integer.parseInt(JOptionPane.showInputDialog("Entre com o n�mero: "));
		
		if(num % 2 == 0) {
			num = num + 5;
		} else {
			num = num + 8;
		}
		JOptionPane.showMessageDialog(null, "Valor atual do n�mero: " + num);
	}
}
