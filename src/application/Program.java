package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee empregado = new Employee();
		System.out.print("Name: ");
		empregado.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		empregado.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		empregado.tax = sc.nextDouble();
		System.out.println();
		
		System.out.println("Employee: " + empregado);	
		System.out.println();
		
		System.out.print("Wich percentage to increase salary?");
		double percent = sc.nextDouble();
		empregado.increaseSalary(percent);
		System.out.println("Update data: " + empregado);
		
		sc.close();
		
	}

}
