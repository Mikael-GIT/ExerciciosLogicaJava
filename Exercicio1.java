import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o valor de X ");
		int x = scan.nextInt();
		System.out.println("Entre com o valor de Y");
		int y = scan.nextInt();
		System.out.println("Entre com o valor de Z");
		int z = scan.nextInt();
		
		
		if(x + y > z) {
			System.out.println("O valor de X + Y é maior do que Z");
		}
		else System.out.println("O valor de Z é maior do que X + Y");
	}
}
