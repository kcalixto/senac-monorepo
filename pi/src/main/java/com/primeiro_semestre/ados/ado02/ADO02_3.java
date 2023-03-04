package pi.ado02;

import java.util.Scanner;

public class ADO02_3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		// The value is created as double because less than 1 may be 0,X
		double value = 0;

		while (value > 10 || 1 > value || value % 1 != 0) {
			System.out.print("Digite um valor inteiro de 1 at� 10: ");
			value = input.nextDouble();
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + value + " = " + (value * i));
		}

	}

}
