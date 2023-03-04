package pi.ado02;

import java.util.Scanner;

public class ADO02_2 {

	public static void main(String[] args) {
		System.out.println("Nota* utilize v�gula e n�o ponto!");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		double value = input.nextDouble();

		int multiples[] = new int[3];

		byte multipleslot = 0;
		// i = 1 because zero is, obviously, the first multiple of every number.
		for (int i = 1;; i++) {
			if (multipleslot == 3) {
				break;
			}
			//Validation if it's an integer number
			if ((i / value) % 1 == 0) {
				multiples[multipleslot] = i;
				multipleslot++;
			}
		}

		System.out.println("Primeiro m�ltiplo: " + multiples[0]);
		System.out.println("Segundo m�ltiplo: " + multiples[1]);
		System.out.println("Terceiro m�ltiplo: " + multiples[2]);

	}

}
