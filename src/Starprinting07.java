import java.util.Scanner;

public class Starprinting07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ﰢ���� ���� �Է�:");
		int height = sc.nextInt();				// -height ������ �ﰢ�� ���� �Է°� ����
		
		for (int i = 0; i < height; i++) {		// ���� (height��)�� ����ϱ� ���� for���� ���
			for (int j = height; j > i; j--) {	// �� �ٿ� ���� (height��)�� ����ϱ� ���� ���� for�� ���.
				System.out.printf("*");			// �� ��, ���� for�� j�� ���۰����� height���� �����ϰ�,
			}									// i�� ��ŭ j���� �۾��������� "*" ����� ���� �ݺ���.
			
			System.out.printf("%n");			// ���� �ݺ����� ������ �ٹٲ��� ������.
		}
	}
}
