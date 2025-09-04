import java.util.Scanner;

public class VerificadordeNumerosPrimos {
	
	public static boolean verificaPrimo (int a) {
		if (a < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe um número inteiro: ");
		int a = ler.nextInt();
		ler.close();
		boolean b = verificaPrimo(a);
		System.out.println("É primo? " + b);
	}

}
