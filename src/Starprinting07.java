import java.util.Scanner;

public class Starprinting07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이 입력:");
		int height = sc.nextInt();				// -height 변수에 삼각형 높이 입력값 저장
		
		for (int i = 0; i < height; i++) {		// 줄을 (height값)번 출력하기 위해 for문을 사용
			for (int j = height; j > i; j--) {	// 한 줄에 별을 (height값)번 출력하기 위해 하위 for문 사용.
				System.out.printf("*");			// 이 때, 하위 for의 j의 시작값으로 height값을 지정하고,
			}									// i값 만큼 j값이 작아질때까지 "*" 출력을 감소 반복함.
			
			System.out.printf("%n");			// 하위 반복문이 끝나면 줄바꿈을 시행함.
		}
	}
}
