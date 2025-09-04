import java.util.Scanner;

public class TabuadaComLoop {
	public static void main (String[] args) {
		int numero = 0;
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		do {			
			System.out.print("Informe um número inteiro de 1 a 10: ");
			numero = ler.nextInt();
			for (int i = 0; i <= 10; i++) {
				System.out.println(numero + " * " + i + " = "+ numero * i);
			}
			System.out.println("----------");			
			
		} while (true);
				
	}
}
