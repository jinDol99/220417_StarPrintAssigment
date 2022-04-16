import java.util.Scanner;

public class Starprinting01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("옆으로 누운 삼각형의 높이입력: ");				// 시계방향으로 90도 회전한 삼각형의 높이를
		int triangleHeight = sc.nextInt();							// 변수 triangleHeight에 입력
		
		for (int i = 1; i <=(triangleHeight*2-1); i++) {			// 별을 n번째 줄까지 출력하기 위해, for 반복문을 사용.
																	// 이때, n(삼각형의 밑변 길이)은 높이가 각각 1,2,3,4,5...일때
																	// 밑변은 1, 3, 5, 7, 9가 되므로, "n=높이*2-1" 이 됨을 알 수 있음.
			
			if (i <= triangleHeight) {								// 별을 입력한 높이값의 줄만큼 출력했을때를 분기점으로 if-else문을 사용
																	// 만약, i의 값이 높이값보다 같거나 작다면. 즉, 입력한 높이값보다 출력된
																	// n줄이 작은 경우라면, 아래의 코드를 실행함.
				
				for (int j = 1; j <= i; j++)						// 별을 한 줄에 n개를 출력하기 위해 for 반복문을 사용함.
					System.out.printf("*");							// j 반복이 i값이 될 때 까지. 즉, i값이 1이면 별 1개, i 값이 2면 별 2개,
			}														// i값이 3이면 별을 3개... 이런 식으로 출력하도록 설정함.
			
			else {													// 그렇지 않으면(i의 값이 높이값보다 크다면. 즉, 입력한 높이값 보다 출력된
																	// n줄이 큰 경우라면, 아래의 코드를 실행함.
				
				for (int j = ((triangleHeight*2)-i); j > 0; j--)	// 별을 한 줄에 n개를 출력하기 위해 for 반복문을 사용함.
					System.out.printf("*");							// 한줄 한줄 반복할수록 별 출력이 감소하므로, j를 0이 될 때 까지 1을
			}														// 감소시키며 반복함. 초기값으로는 최고 높이의 -1값. 즉, 높이가 5인 삼각형의
																	// i값이 6,7,8,9 일 때,j값은 4,3,2,1 이 되므로, i+j=높이값*2가 되는
																	// 것을 알 수 있음. i값을 이항하여 j값을 찾기 위한 수식은 발견하였고, 이
																	// 수식을 for문의 j 초기값으로 입력함.
																	// 이 반복문으로 삼각형의 줄어드는 구간 속 *을 출력할 수 있음.

			System.out.printf("%n");								// 상위 for 반복이 한번 끝나면 줄바꿈을 시행함.
		}
	}
}