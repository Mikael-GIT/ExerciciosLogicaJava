import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que leia dois valores inteiros A e B se os valores
		 *  forem iguais deverá se
		   somar os dois, caso contrário multiplique A por B. Ao 
		   final de qualquer um dos cálculos deve-se
           atribuir o resultado para uma variável C e mostrar seu conteúdo na tela. 
		 */
		int A = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de A: "));
		int B = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de A: "));
		int C;
		
		if(A == B) {
			C = A + B;
		} else {
			C  = A * B;
		}
		JOptionPane.showMessageDialog(null, "O valor de C é: " + C);
	}

}
