import javax.swing.JOptionPane;

public class Exercicio8 {
	public static void main(String[] args) {
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Entre com a altura: "));
		String sexo = JOptionPane.showInputDialog("Entre com o sexo: \n F - Feminino \n M - Masculino");
		double peso = 0; 
		if(sexo == "F") {
			peso = (72.7 * altura) - 58;
		} else {
			peso = (62.1 * altura) - 44.7;	
		}
		JOptionPane.showMessageDialog(null, "Sexo: " + sexo + " Peso: " + peso);
	}
}
