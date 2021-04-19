import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número: "));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número: "));
		
		if(num1 > num2 && num1 > num3) {
			JOptionPane.showMessageDialog(null, "O maior número é o primeiro.");
		} else if(num2 > num1 && num2 > num3) {
			JOptionPane.showMessageDialog(null, "O maior número é o segundo.");
		} else {
			JOptionPane.showMessageDialog(null, "O maior número é o terceiro.");
		}
	}

}
