package second_day;

public class test12 {

	int x=25;
	public static void main(String[] args) {
		test12 app=new test12();
		{
			int x=5; //���� ������ �����
		}
		{
			int x=10; //���� ������ �����2
		}
		int x=100;
		System.out.println(x); //main�ȿ� ����� ������ 100
		System.out.println(app.x); //��ü ����
	}
	public test12() {
		int x=1; //�����ڰ� ������ �����
		System.out.println(x); //�����ھȿ��� ������ ������ 1
	}

	
}
