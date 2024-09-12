package controlstatement;

import java.util.Scanner;

public class Salary {
	public static double calculate_final_salary(double base_salary, String rating, int years_of_experience) {
		double bonusPercentage = 0.0;
		double salary;
		switch (rating.toLowerCase()) {
		case "excellent":
			bonusPercentage = 0.20;
			break;
		case "good":
			bonusPercentage = 0.10;
			break;
		case "average":
			bonusPercentage = 0.05;
			break;
		case "poor":
			bonusPercentage = 0.0;
			break;
		default:
			System.out.println("Invalid rating provided. No bonus will be applied.");
		}

		// Apply extra experience bonus if applicable
		if (years_of_experience > 5) {
			bonusPercentage += 0.05;
		}

		// Calculate the final salary
		salary = base_salary + (base_salary * bonusPercentage);
		return salary;

	}

	public static void main(String[] args) {
		double base_salary;
		int years_of_experience;
		String rating;
		Scanner sc = new Scanner(System.in);
		base_salary = sc.nextDouble();
		rating = sc.next();
		years_of_experience = sc.nextInt();
		System.out.println(calculate_final_salary(base_salary, rating, years_of_experience));

	}

}
