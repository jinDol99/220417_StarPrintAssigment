import java.util.Scanner;

public class Starprinting03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ﰢ���� ���� �Է�: ");
		int triangleHeight = sc.nextInt();				// triangleHeight ������ �ﰢ���� ���� �Է°� ����
		
		for(int i = 0; i < triangleHeight; i++) {		// ���� (triangleHeight��)�� ����ϱ� ���� for���� ���.
			for(int j = 0; j < triangleHeight; j++) {	// �� �ٿ� ���� triangleHeight��)�� ����ϱ� ���� ���� for�� ���.

				if(i > j) {								// �̶�, i���� j������ ũ�ٸ�. ��, i���� ���� 1,2,3,4,5... �� ���
														// j���� ���� 0, 0~1, 0~2, 0~3, 0~4... �� �����
					System.out.printf(" ");				// ������ �����.
				}
				else {									//�׷��� �ʰ�, i���� ���� 1,2,3,4,5... �� ��� j���� ����
														// 1�̻�, 2�̻�, 3�̻�, 4�̻�, 5�̻�... �϶����
					System.out.printf("*");				// "*"�� �����.
				}
			}
			System.out.printf("%n");					// ���� for �ݺ��� ������ �ٹٲ�
		}
	}
}
