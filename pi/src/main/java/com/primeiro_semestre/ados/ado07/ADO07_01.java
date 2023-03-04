package pi.ado07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ADO07_01 {
	public static void main(String args[]) {
		System.out.println("*Enunciado da questão aqui*");
		
		//Variables
		String resposta = "Alternativa 1";
		char userResponse;
		boolean isValid = false;
		Scanner input = new Scanner(System.in);

		//Filling arrays
		char[] options = new char[] { 'a', 'b', 'c', 'd', 'e' };
		ArrayList<String> alternativas = new ArrayList<String>();
		alternativas.add("Alternativa 1");
		alternativas.add("Alternativa 2");
		alternativas.add("Alternativa 3");
		alternativas.add("Alternativa 4");
		alternativas.add("Alternativa 5");

		do {
			//Printing
			Collections.shuffle(alternativas);
			for (int i = 0; i < alternativas.size(); i++) {
				System.out.println(options[i] + ") " + alternativas.get(i));
			}
			System.out.print("R: ");

			//Validating
			userResponse = input.nextLine().charAt(0);
			switch (userResponse) {
				case 'a':
					if (alternativas.get(0) == resposta){
						isValid = true;
					}
					break;
				case 'b':
					if (alternativas.get(1) == resposta){
						isValid = true;
					}
					break;
				case 'c':
					if (alternativas.get(2) == resposta){
						isValid = true;
					}
					break;
				case 'd':
					if (alternativas.get(3) == resposta){
						isValid = true;
					}
					break;
				case 'e':
					if (alternativas.get(4) == resposta){
						isValid = true;
					}
					break;
			}

			//if not valid
			if(!isValid){
				System.out.println("-----------------------------------");
				System.out.println("Resposta incorreta...");
			}
		} while (!isValid);

		System.out.println("Resposta correta!");
	}
}
