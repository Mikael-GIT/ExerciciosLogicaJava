import javax.swing.JOptionPane;

public class Exercicio9 {

	public static void main(String[] args) {
		/*
		 * O IMC � Indice de Massa Corporal � um crit�rio da Organiza��o Mundial de Sa�de para dar
	uma indica��o sobre a condi��o de peso de uma pessoa adulta. A f�rmula � IMC = peso / ( altura )2

	Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua condi��o de acordo
	com a tabela abaixo.
	IMC em adultos Condi��o
	Abaixo de 18,5 Abaixo do peso
	Entre 18,5 e 25 Peso normal
	Entre 25 e 30 Acima do peso
	Acima de 30 obeso 
		 */
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Entre com a altura: "));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Entre com o peso: "));
		
		double imc = peso / Math.pow(altura, 2);
		
		if(imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Abaixo do peso.");
		} else if (imc >= 18.5 && imc < 25) {
			JOptionPane.showMessageDialog(null, "Peso normal.");
		} else if (imc >= 25 && imc <= 30) {
			JOptionPane.showMessageDialog(null, "Acima do peso.");
		}
	}

}
