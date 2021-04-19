import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog
				("Entre com o número para verificar se é par ou ímpar: "));
		if(num % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O número " + num + " é par.");
		}	else {
			JOptionPane.showMessageDialog(null, "O número " + num + " é ímpar.");
		}
	}
}
