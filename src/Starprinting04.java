import java.util.Scanner;

public class Starprinting04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ﰢ���� ���� �Է�: ");
		int height = sc.nextInt();				// height ������ �ﰢ���� ���� �Է°� ����
		
		for(int i = 1; i <= height; i++) {		// ���� (height��)�� ����ϱ� ���� for���� ���.
			for (int j = 1; j <= i; j++) {		// �� �ٿ� ���� ����ϱ� ���� ���� for�� ���. �̶�,
												// i����ŭ��. ��, i�� ���� 1,2,3,4...�� ���
												// j���� ���� 1,2,3,4... �� �����
				System.out.printf("*");			// "*"�� �����.
			}
			System.out.printf("%n");			// ���� for �ݺ��� ������ �ٹٲ�
		}
	}
}