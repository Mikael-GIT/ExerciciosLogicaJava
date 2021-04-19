import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio12 {
	public static void main(String[] args) {
		/* 
		 * Escreva um algoritmo que leia o número de identificação, as 3 notas obtidas por um aluno nas
	3 verificações e a média dos exercícios que fazem parte da avaliação, e calcule a média de
	aproveitamento, usando a fórmula:
	MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7 
		 */
		
		int numIdentificação = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número de identificação do aluno: "));
		Double [] notas = new Double [3];
		double me = Double.parseDouble(JOptionPane.showInputDialog("Entre com a média de exercícios: "));
		int conceito;
		
		for(int i = 0; i < notas.length; i++) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Entre com a " + notas[i] + "° do aluno: "));
		}
		DecimalFormat df = new DecimalFormat("#,###.00");
		double mediaGeral = (notas[0] + notas[1] * 2 + notas[2] * 3 + me) / 7;
		
		if(mediaGeral >= 90) {
			JOptionPane.showMessageDialog(null, "A nota total do aluno com identificação: " + numIdentificação + " é " + df.format(mediaGeral) + " e o conceito foi A.");
		} else if (mediaGeral >= 75 && mediaGeral < 90) {
			JOptionPane.showMessageDialog(null, "A nota total do aluno com identificação: " + numIdentificação + " é " + df.format(mediaGeral) + " e o conceito foi B.");
		} else if (mediaGeral >= 60 && mediaGeral < 75) {
			JOptionPane.showMessageDialog(null, "A nota total do aluno com identificação: " + numIdentificação + " é " + df.format(mediaGeral) + " e o conceito foi C.");
		} else if (mediaGeral >= 40 && mediaGeral < 60) {
			JOptionPane.showMessageDialog(null, "A nota total do aluno com identificação: " + numIdentificação + " é " + df.format(mediaGeral) + " e o conceito foi D.");
		} else if (mediaGeral < 40) {
			JOptionPane.showMessageDialog(null, "A nota total do aluno com identificação: " + numIdentificação + " é " + df.format(mediaGeral) + " e o conceito foi E.");
		}
	}
}
