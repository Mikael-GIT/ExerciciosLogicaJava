import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog
				("Entre com o n�mero para verificar se � par ou �mpar: "));
		if(num % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O n�mero " + num + " � par.");
		}	else {
			JOptionPane.showMessageDialog(null, "O n�mero " + num + " � �mpar.");
		}
	}
}
