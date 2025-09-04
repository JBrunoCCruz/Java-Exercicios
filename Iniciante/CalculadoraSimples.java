/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class CalculadoraSimples {

	/**
	 * 
	 */
	public CalculadoraSimples() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a = 0, b = 1, resultado = 0;
		char operacao;
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe um numero: ");
		a = ler.nextFloat();
		System.out.print("Informe outro numero: ");
		b = ler.nextFloat();
		System.out.print("Informe uma operação: ");
		operacao =  ler.next().charAt(0);
		ler.close();
		
		switch (operacao) {
			case '+': {
				resultado = a + b;
				break;
			}
			case '-': {
				resultado = a - b;
				break;
			}
			case '*': {
				resultado = a * b;
				break;
			}
			case '/': {
				resultado = a / b;
				break;
			}
			default:
				System.out.println("Operação inválida");
				return;
		}
		
		System.out.printf("O resultado da operação é: %.2f\n", resultado);

	}

}
