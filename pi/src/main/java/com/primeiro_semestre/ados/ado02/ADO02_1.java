package pi.ado02;

import java.util.Scanner;

public class ADO02_1 {
	public static void main(String[] args) {
		System.out.println("Nota* utilize v�gula e n�o ponto!");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		double value01 = input.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		double value02 = input.nextDouble();
		
		System.out.print("Digite o terceiro valor: ");
		double value03 = input.nextDouble();
		
		double product = value01 * value02 * value03;
		
		System.out.println("Produto: " + product);
	}

}
