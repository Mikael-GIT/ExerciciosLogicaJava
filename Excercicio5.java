import javax.swing.JOptionPane;

public class Excercicio5 {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor: "));	
		
		if(num > 0) {
			//int result = (int) Math.pow(num, 2);
			JOptionPane.showMessageDialog(null, "O valor é: " + Math.pow(num, 2));
		} else {
			//int result = (int) Math.pow(num, 3);
			JOptionPane.showMessageDialog(null, "O valor é: " + Math.pow(num, 3));
		}
	}
}
