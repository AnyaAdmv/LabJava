import java.util.Scanner;

class PrimeN{
	
	public static void main(String[] argv) {		
		start();		
	} 
	
	public static void start() {
		
		int N = inputN();
		for (int i = 2; i <= N; i++) {
		if (primeN(i) == 1) 
		outputN(i);
		}
	}
	
	
	public static int primeN(int i) {
		
		int q = 0;
		for(int k = 2; k <= i; k++) {
			if(i % k == 0)
			{
				q++;
			}	
		}
		return q;
	}
	
	public static int inputN() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Numbers: ");
		return scanner.nextInt();
	}

	public static void outputN(int z) {
		System.out.println(z);
	}
}