import java.util.Scanner;

public class Select {
	
	static PrimeN primeN;
	static Palindrom palindrom;
	
	public static void main(String[] argv) {
		
		primeN = new PrimeN();
		palindrom = new Palindrom();

		System.out.println("What you want to do?");
		System.out.println("1 - Prime number");
		System.out.println("2 - Polindrom");

		switch(input()) {
			case 1: 
			{
				primeN.start();
				break;
			}

			case 2: 
			{
				palindrom.start();
				break;
			}
		}

	}
	
	public static int input() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}