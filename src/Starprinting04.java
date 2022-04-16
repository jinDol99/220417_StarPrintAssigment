import java.util.Scanner;

public class Starprinting04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이 입력: ");
		int height = sc.nextInt();
		
		for(int i = 1; i <= height; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.printf("%n");
		}
	}
}
