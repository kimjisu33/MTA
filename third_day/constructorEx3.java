package third_day;

class A{
	public A() {
		System.out.println("������A");
	}
}
class B extends A{
	public B() {
		System.out.println("������B");
	}
	public B(int x) {
		System.out.println("�Ű����� ������B");
	}
}
public class constructorEx3 {

	public static void main(String[] args) {
		B b;
		b=new B(5);
	}

}
//�ڽĿ��� �θ� �����ڸ� �������� �ʾ��� ��� �θ��� ����Ʈ ������ ȣ��