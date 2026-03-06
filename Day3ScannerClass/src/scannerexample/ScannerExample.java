package scannerexample;
import java.util.Scanner;



public class ScannerExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name:");
		String name = sc.nextLine();
		
		System.out.println("Enter your Mobile number:");
		long mobile = sc.nextLong();
		
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		
		System.out.println("Name :" + name);
		System.out.println("Mobile :" + mobile);
		System.out.println("Age :" + age);
		
		sc.close();
		
		
		
		
		
		
	}

}
