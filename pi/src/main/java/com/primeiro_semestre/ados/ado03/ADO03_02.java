package pi.ado03;

import java.util.Scanner;

public class ADO03_02 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do primeiro lado: ");
		String value01 = input.next();
		
		System.out.print("Digite o tamanho do segundo lado: ");
		String value02 = input.next();
		
		System.out.print("Digite o tamanho do terceiro lado: ");
		String value03 = input.next();
		
		if (value01.equals(value02) && value01.equals(value03)) {
			System.out.println("O tri�ngulo � Equil�tero!");
		}else if (value01.equals(value02) || value01.equals(value03) || value02.equals(value03)) {
			System.out.println("O tri�ngulo � Is�sceles!");
		} else {
			System.out.println("O tri�ngulo � Escaleno!");
		}

	}

}
