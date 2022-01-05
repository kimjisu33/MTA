package third_day;

class A{
	public A() {
		System.out.println("생성자A");
	}
}
class B extends A{
	public B() {
		System.out.println("생성자B");
	}
	public B(int x) {
		System.out.println("매개변수 생성자B");
	}
}
public class constructorEx3 {

	public static void main(String[] args) {
		B b;
		b=new B(5);
	}

}
//자식에서 부모 생성자를 지정하지 않았을 경우 부모의 디폴트 생성자 호출