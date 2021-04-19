import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Entre com o nome: ");
		String sexo = JOptionPane.showInputDialog("Entre com o sexo: ");
		String estadoCivil = JOptionPane.showInputDialog("Entre com o estado civil: ");

		if (sexo.equals("f") && estadoCivil.equals("casada")) {
			int tempoCasada = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de casada: "));
			JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nSexo: " + sexo.toUpperCase() + "\nEstado Civil: " + estadoCivil
					+ "\nTempo de casada: " + tempoCasada);
		} else {
			JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nSexo: " 
					+ sexo.toUpperCase() + "\nEstado Civil: " + estadoCivil);
		}

	}
}
