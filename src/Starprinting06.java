import java.util.Scanner;

public class Starprinting06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ﰢ���� ���� �Է�: ");
		int height = sc.nextInt();				// height ������ �ﰢ���� ���� �Է°� ����	
		
		for(int i = 1; i <= height; i++) {		// ���� (height��)�� ����ϱ� ���� for���� ���
			for(int j = 1; j <= height; j++) {	// �� �ٿ� ���� (height��)�� ����ϱ� ���� ���� for�� ���.
				
				if(j <= (height - i)) {			// ���� j���� height ������ i�� �� �� ���϶��. ��, height��
					System.out.printf(" ");		// 5�̰�, i���� ���� 1,2,3,4,5 �϶�, j���� ����
												// 1~4,1~3,1~2,1~1,0 ������ ���� ��, ������ �����.
					
				} else {						// �� ���� ���. ��, height�� 5�̰�, i���� ���� 1,2,3,4,5 �϶�
					System.out.printf("*");		// j���� ���� 5,4~5,3~5,2~5,1~5 ������ ���� ��, "*"�� �����.
				}
			}
			System.out.printf("%n");			// ���� �ݺ��� ������ �ٹٲ��� ������.
		}
	}
}
