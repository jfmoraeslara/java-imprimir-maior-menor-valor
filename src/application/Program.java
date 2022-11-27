package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int maior = 0;
		int menor = Integer.MAX_VALUE;

		System.out.print("Quantidades de n�meros digitados: ");
		int x = sc.nextInt();

		int num = 0;
		for (int i = 1; i <= x; i++) {
			System.out.print("n" + i + ": ");
			num = sc.nextInt();
			if (num <= menor) {
				menor = num;
			}
			if (num >= maior) {
				maior = num;
			}
		}

		System.out.println(" ");
		System.out.println("O maior n�mero � o " + maior);
		System.out.println("O menor n�mero � o " + menor);

		sc.close();
	}
}
