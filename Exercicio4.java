import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Fa�a um algoritmo que leia dois valores inteiros A e B se os valores
		 *  forem iguais dever� se
		   somar os dois, caso contr�rio multiplique A por B. Ao 
		   final de qualquer um dos c�lculos deve-se
           atribuir o resultado para uma vari�vel C e mostrar seu conte�do na tela. 
		 */
		int A = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de A: "));
		int B = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de A: "));
		int C;
		
		if(A == B) {
			C = A + B;
		} else {
			C  = A * B;
		}
		JOptionPane.showMessageDialog(null, "O valor de C �: " + C);
	}

}
