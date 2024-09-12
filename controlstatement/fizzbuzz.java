package controlstatement;

public class fizzbuzz {

	public static boolean isPrime(int i) {

		if (i <= 1) {
			return false;
		}
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

	public static void fizzBuzzVariation() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (isPrime(i) == true) {
				System.out.println("prime number");
			} else {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		fizzBuzzVariation();
	}

}
