import java.util.Scanner;

public class Starprinting09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ﰢ���� ���� �Է�: ");
		int height = sc.nextInt();				// height ������ �ﰢ���� ���� �Է°� ����
		
		for(int i = 1; i <= height; i++) {		// ���� (height��)�� ����ϱ� ���� for���� ���.
			for (int j = 1; j <= (i*2-1); j++)	// �� �ٿ� ���� ����ϱ� ���� ���� for�� ���. �̶�,
				System.out.printf("*");			// i�� �ι� ������ 1�� �� ����ŭ ���� �����.
												// �����ڸ�, i�� ���� 1,2,3,4...�� ��, j ����
												// ���� 1,3,5,7... �� ��츦 �������� ǥ���ϸ�
												// j=i*2-1 ���� ǥ���� �� ����.		

			System.out.printf("%n");			// ���� for �ݺ��� ������ �ٹٲ�
		}
	}

}
