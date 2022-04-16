import java.util.Scanner;

public class Starprinting06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이 입력: ");
		int height = sc.nextInt();				// height 변수에 삼각형의 높이 입력값 저장	
		
		for(int i = 1; i <= height; i++) {		// 줄을 (height값)번 출력하기 위해 for문을 사용
			for(int j = 1; j <= height; j++) {	// 한 줄에 별을 (height값)번 출력하기 위해 하위 for문 사용.
				
				if(j <= (height - i)) {			// 만약 j값이 height 값에서 i를 뺀 값 이하라면. 즉, height가
					System.out.printf(" ");		// 5이고, i값이 각각 1,2,3,4,5 일때, j값은 각각
												// 1~4,1~3,1~2,1~1,0 범위에 있을 때, 공백을 출력함.
					
				} else {						// 그 외의 경우. 즉, height가 5이고, i값이 각각 1,2,3,4,5 일때
					System.out.printf("*");		// j값이 각각 5,4~5,3~5,2~5,1~5 범위에 있을 때, "*"을 출력함.
				}
			}
			System.out.printf("%n");			// 하위 반복이 끝나면 줄바꿈을 시행함.
		}
	}
}
