import java.util.Scanner;

public class PrimeNumber {

	/* Return true if a number is prime otherwise return false */
	private Boolean isPrimeNumber(int num) {
		boolean bol = true;
		int[] primeDivisor = { 2, 3, 5, 7 };
		int i;
		try {
			for (i = 0; i < primeDivisor.length; i++) {
				// if number has any remainder after dividing by prime divisor then it is a
				// prime number
				if (num % primeDivisor[i] != 0) {
					bol = true;
				} else {
					if (primeDivisor[i] != num)
						bol = false;
					break;
				}
			}
			return bol;
		} catch (ArithmeticException aEx) {
			System.out.println(aEx.getMessage());
			return false;
		}
	}

	public static void main(String[] args) {
		int loopIndex = 0;
		int counter = 0;

		try {

			Scanner input = new Scanner(System.in);

			// Enter starting and ending range of numbers
			System.out.println("Enter Starting Positive Number: ");
			int startNumber = input.nextInt();

			System.out.println("");

			System.out.println("Enter End Positive Number: ");
			int endNumber = input.nextInt();

			if (startNumber < 2 || endNumber < 2) {
				System.out.println("Invalid Input Numbers.");
				return;
			}

			PrimeNumber clsPrimeNumber = new PrimeNumber();

			System.out.println("");
			System.out.println("Printing Prime Numbers Between " + startNumber + " and " + endNumber + ": ");
			System.out.println("");

			// Check every numbers between the input range and if number is prime then print
			for (loopIndex = startNumber; loopIndex <= endNumber; loopIndex++) {
				if (clsPrimeNumber.isPrimeNumber(loopIndex)) {
					System.out.println(loopIndex);
					counter++;
					
					
				}

			}
			if (counter == 0)
				System.out.println("NO PRIME NUMBERS ARE FOUND");
			else {
				System.out.println("");
				System.out.println(
						"Total " + counter + " prime numbers are found between " + startNumber + " and " + endNumber);
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
