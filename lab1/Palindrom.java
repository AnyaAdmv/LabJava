import java.util.*;

class Palindrom{
	
	public static void main(String[] argv) {		
		start();		
	} 
	
	public static String inputN() {
		Scanner in = new Scanner(System.in);
		System.out.println("Word: ");
		return in.nextLine();
	}
	
	public static void outputN (boolean bool) {
		
		if (bool)
		{
			System.out.println("Palindrom");
		}
		else 
		{
			System.out.println("Not Palindrom");
		}
		
	}
	
	public static boolean testPalindrom(String S) {
		
	    char[] mass =S.toCharArray();
		for (int i = 0; i <= ((mass.length-1)/2 - 1); i++) {
			if (mass[i] != mass[mass.length-i-1])
			{
				return false;
			}			
		}
		return true;
	}
	
	public static void start() {
		
		String S = inputN();
		outputN (testPalindrom(S));		
	}
}