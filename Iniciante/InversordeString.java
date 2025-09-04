import java.util.Scanner;

public class InversordeString {
	public static void main (String[] args) {
		String str = new String();
		String invertida = "";
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe uma palavra: ");
		str = ler.nextLine();
		ler.close();
		for (int i = str.length() - 1; i >= 0; i--) {
			invertida += str.charAt(i);
		}
		
		System.out.println("String invertida: " + invertida);
		
	}
}
