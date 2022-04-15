import java.util.Scanner;

public class Starprinting01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("옆으로 누운 삼각형의 높이입력: ");				// 시계방향으로 90도 회전한 삼각형의 높이를
		int triangleHeight = sc.nextInt();							// 변수 triangleHeight에 입력
		
		for (int i = 1; i <=(triangleHeight*2-1); i++) {			// 별을 n번째 줄까지 출력하기 위해, for 반복문을 사용.
																	// 이때, n(삼각형의 밑변 길이)은 높이가 각각 1,2,3,4,5...일때
																	// 밑변은 1, 3, 5, 7, 9가 되므로, "n=높이*2-1" 이 됨을 알 수 있음.
			
			if (i <= triangleHeight) {								//		
				for (int j = 1; j <= i; j++)
					System.out.printf("*");
			}
			else {
				for (int j = ((triangleHeight*2)-i); j > 0; j--)	//
					System.out.printf("*");
			}
			System.out.printf("%n");
		}
	}
}