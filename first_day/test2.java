package first_day;

public class test2 {
	private int id=3;
	
	public static void main(String[] args) {
		test2 customer=new test2();
		customer.id=5;
		customer.showId();
	}
	protected  void showId(){
		System.out.println(id);
	}
}

//���� Ŭ�������� ����, �޼ҵ��̱� ������ public�� �ƴ� ���������ڸ� ����ص� ������ �߻����� �ʴ´�.
//main�޼ҵ尡 static �̱� ������ static ����鸸 ��밡��
//customer. �� �߰����� �������� id�� showId()�� static �ο��ϱ�
