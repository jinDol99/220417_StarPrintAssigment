import java.util.Scanner;

public class Starprinting03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이 입력: ");
		int triangleHeight = sc.nextInt();
		
		for(int i = 0; i < triangleHeight; i++) {
			for(int j = 0; j < triangleHeight; j++) {
				if(i > j) {
					System.out.printf(" ");
				}
				else {
					System.out.printf("*");
				}
			}
			System.out.printf("%n");
		}
	}
}
