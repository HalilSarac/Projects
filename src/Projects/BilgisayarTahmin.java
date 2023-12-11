package Projects;

import java.util.Scanner;

public class BilgisayarTahmin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int targetNumber = getTargetNumberFromUser();

		System.out.println("Oyun başlıyor! Kullanıcının tuttuğu sayı: " + targetNumber);

		int attempt = 1;
		boolean found = false;

		while (!found) {
			int computerGuess = generateRandom4DigitNumber();
			System.out.println("Bilgisayarın tahmini " + attempt + ": " + computerGuess);

			int[] result = getBullsAndCowsFromUser(targetNumber);
			printResult(result);

			if (result[0] == 4) {
				System.out.println("Bilgisayar doğru tahminde bulundu! Tahmin: " + computerGuess);
				found = true;
			} else {
				System.out.println("Doğru tahminde bulunamadı.");
				attempt++;
			}
		}
	}

	private static int getTargetNumberFromUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("4 basamaklı bir sayı tutun:");
		return scanner.nextInt();
	}

	private static int generateRandom4DigitNumber() {
		return (int) (1000 + Math.random() * 9000);
	}

	private static int[] getBullsAndCowsFromUser(int target) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bulls: ");
		int bulls = scanner.nextInt();
		System.out.println("Cows: ");
		int cows = scanner.nextInt();

		return new int[]{bulls, cows};
	}

	private static void printResult(int[] result) {
		System.out.println("Bulls: " + result[0] + ", Cows: " + result[1]);
	}
}