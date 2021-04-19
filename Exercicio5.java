import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String[] args) {
		
		/*
		 * Escreva um algoritmo que lê dois valores booleanos (lógicos) e então 
		 * determina se ambos são
		   VERDADEIROS ou FALSOS. 
		 */
		boolean logico1 = Boolean.parseBoolean(JOptionPane.showInputDialog("Entre com o valor true ou false: "));
		boolean logico2 = Boolean.parseBoolean(JOptionPane.showInputDialog("Entre com o valor true ou false: "));
		
		if(logico1 == true && logico2 == true) {
			JOptionPane.showMessageDialog(null, "ambos são verdadeiros");
		} else if(logico1 == false && logico2 == false){
			JOptionPane.showMessageDialog(null, "ambos são falsos.");
		} else {
			JOptionPane.showMessageDialog(null, "um é verdadeiro e o outro falso.");
		}
	}
}
