package fourth_day;

public class test39 {

	public static void main(String[] args) {
		try {
			int x=1/0;
			System.out.println("try"); //������ ArithmeticException�� �߻��Ͽ� catch�� �Ѿ. ������� ����
		}catch(ArithmeticException ex) {
			System.out.println("catch ArithmeticException"); //����
		}catch(Exception ex) { 
			//�ֻ��� Exception / ���� �ٲ�� ������ ��������
			//catch�� ������ ������ ���� �����~
			System.out.println("catch Exception"); //������ catch���� �ɷ� ���� ���� ����
		}finally {
			System.out.println("finally"); //���� �߻��� ������� �����
		}
	}
}
