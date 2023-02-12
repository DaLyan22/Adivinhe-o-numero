import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(10);
		int guess = -1;
		Scanner scnr = new Scanner(System.in);
		while (guess != n) {
			System.out.print("Tente acertar o número: ");
			guess = scnr.nextInt();
			if (guess > n)
				System.out.println("Muito alto");
			if (guess < n)
				System.out.println("Muito baixo");
		}
		scnr.close();
		System.out.println("Parabéns,  você venceu!");
	}
}
