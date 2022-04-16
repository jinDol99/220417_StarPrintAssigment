import java.util.Scanner;

public class Starprinting03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이 입력: ");
		int triangleHeight = sc.nextInt();				// triangleHeight 변수에 삼각형의 높이 입력값 저장
		
		for(int i = 0; i < triangleHeight; i++) {		// 줄을 (triangleHeight값)번 출력하기 위해 for문을 사용.
			for(int j = 0; j < triangleHeight; j++) {	// 한 줄에 별을 triangleHeight값)번 출력하기 위해 하위 for문 사용.

				if(i > j) {								// 이때, i값이 j값보다 크다면. 즉, i값이 각각 1,2,3,4,5... 인 경우
														// j값이 각각 0, 0~1, 0~2, 0~3, 0~4... 일 때라면
					System.out.printf(" ");				// 공백을 출력함.
				}
				else {									//그렇지 않고, i값이 각각 1,2,3,4,5... 인 경우 j값이 각각
														// 1이상, 2이상, 3이상, 4이상, 5이상... 일때라면
					System.out.printf("*");				// "*"을 출력함.
				}
			}
			System.out.printf("%n");					// 하위 for 반복이 끝나면 줄바꿈
		}
	}
}
