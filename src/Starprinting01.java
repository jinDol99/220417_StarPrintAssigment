import java.util.Scanner;

public class Starprinting01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� �ﰢ���� �����Է�: ");				// �ð�������� 90�� ȸ���� �ﰢ���� ���̸�
		int triangleHeight = sc.nextInt();							// ���� triangleHeight�� �Է�
		
		for (int i = 1; i <=(triangleHeight*2-1); i++) {			// ���� n��° �ٱ��� ����ϱ� ����, for �ݺ����� ���.
																	// �̶�, n(�ﰢ���� �غ� ����)�� ���̰� ���� 1,2,3,4,5...�϶�
																	// �غ��� 1, 3, 5, 7, 9�� �ǹǷ�, "n=����*2-1" �� ���� �� �� ����.
			
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