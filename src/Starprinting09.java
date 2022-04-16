import java.util.Scanner;

public class Starprinting09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이 입력: ");
		int height = sc.nextInt();				// height 변수에 삼각형의 높이 입력값 저장
		
		for(int i = 1; i <= height; i++) {		// 줄을 (height값)번 출력하기 위해 for문을 사용.
			for (int j = 1; j <= (i*2-1); j++)	// 한 줄에 별을 출력하기 위해 하위 for문 사용. 이때,
				System.out.printf("*");			// i의 두배 값에서 1을 뺀 값만큼 별을 출력함.
												// 말하자면, i가 각각 1,2,3,4...일 때, j 값이
												// 각각 1,3,5,7... 인 경우를 수식으로 표현하면
												// j=i*2-1 으로 표현할 수 있음.		

			System.out.printf("%n");			// 하위 for 반복이 끝나면 줄바꿈
		}
	}

}
