package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product rect = new Product();

		System.out.println("Enter rectangle width and heigth : ");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();

		System.out.printf("Rectangle area = %.2f%n", + rect.area());
		System.out.printf("Rectangle perimeter = %.2f%n", + rect.perimeter());
		System.out.printf("Rectangle diagonal = %.2f%n", + rect.diagonal());

		sc.close();
	}

}
