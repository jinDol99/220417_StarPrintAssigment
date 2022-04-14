import java.util.Scanner;

public class Starprinting01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ют╥б: ");
		int a = sc.nextInt();
		
		for (int i = 1; i <=(a*2-1); i++) {
			System.out.print("*");
		}
	}
}