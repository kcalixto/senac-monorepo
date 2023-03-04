package pi.ado06;

import java.util.Scanner;

public class ADO06_1 {
	public static void main(String[] args) {
		System.out.println("*Enunciado da questão aqui*");

		char resposta = 'a', userResponse;
		String[] alternativas = new String[] {
				"a) ",
				"b) ",
				"c) ",
				"d) ",
				"e) ",
		};

		Scanner input = new Scanner(System.in);

		do {
			for (String alternativa : alternativas) {
				System.out.println(alternativa);
			}
			System.out.print("R: ");
			userResponse = input.nextLine().charAt(0);

			if (userResponse != resposta) {
				System.out.println("-----------------------------------");
				System.out.println("Não é bem isso, tente novamente...");
			}
		} while (userResponse != resposta);

		System.out.println("Parabéns, você acertou!");

	}
}
