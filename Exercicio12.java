import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio12 {
	public static void main(String[] args) {
		/* 
		 * Escreva um algoritmo que leia o n�mero de identifica��o, as 3 notas obtidas por um aluno nas
	3 verifica��es e a m�dia dos exerc�cios que fazem parte da avalia��o, e calcule a m�dia de
	aproveitamento, usando a f�rmula:
	MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7 
		 */
		
		int numIdentifica��o = Integer.parseInt(JOptionPane.showInputDialog("Entre com o n�mero de identifica��o do aluno: "));
		Double [] notas = new Double [3];
		double me = Double.parseDouble(JOptionPane.showInputDialog("Entre com a m�dia de exerc�cios: "));
		int conceito;
		
		for(int i = 0; i < notas.length; i++) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Entre com a " + notas[i] + "� do aluno: "));
		}
		DecimalFormat df = new DecimalFormat("#,###.00");
		double mediaGeral = (notas[0] + notas[1] * 2 + notas[2] * 3 + me) / 7;
		
		if(mediaGeral >= 90) {
			JOptionPane.showMessageDialog(null, "A nota total do aluno com identifica��o: " + numIdentifica��o + " � " + df.format(mediaGeral) + " e o conceito foi A.");
		} else if (mediaGeral >= 75 && mediaGeral < 90) {
			JOptionPane.showMessageDialog(null, "A nota total do aluno com identifica��o: " + numIdentifica��o + " � " + df.format(mediaGeral) + " e o conceito foi B.");
		} else if (mediaGeral >= 60 && mediaGeral < 75) {
			JOptionPane.showMessageDialog(null, "A nota total do aluno com identifica��o: " + numIdentifica��o + " � " + df.format(mediaGeral) + " e o conceito foi C.");
		} else if (mediaGeral >= 40 && mediaGeral < 60) {
			JOptionPane.showMessageDialog(null, "A nota total do aluno com identifica��o: " + numIdentifica��o + " � " + df.format(mediaGeral) + " e o conceito foi D.");
		} else if (mediaGeral < 40) {
			JOptionPane.showMessageDialog(null, "A nota total do aluno com identifica��o: " + numIdentifica��o + " � " + df.format(mediaGeral) + " e o conceito foi E.");
		}
	}
}
