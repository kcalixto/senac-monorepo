package pi.ado03;

import java.util.Scanner;

public class ADO03_01 {

	public static void main(String[] args) {
		System.out.println("Nota* utilize v�gula e n�o ponto!");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		double value = 0;
		while (value <= 0) {
			System.out.print("Digite o valor da sua compra: ");
			value = input.nextDouble();
		}

		double discount;

		if (value >= 300) {
			discount = 20;
		} else {
			discount = 15;
		}

		System.out.println("Valor final ("+value+") com disconto de " + discount + "% : " + (value - (value * (discount / 100))));

	}

}
