package second_day;

public class test12 {

	int x=25;
	public static void main(String[] args) {
		test12 app=new test12();
		{
			int x=5; //블럭이 끝나면 사라짐
		}
		{
			int x=10; //블럭이 끝나면 사라짐2
		}
		int x=100;
		System.out.println(x); //main안에 선언된 변수인 100
		System.out.println(app.x); //객체 변수
	}
	public test12() {
		int x=1; //생성자가 끝나면 사라짐
		System.out.println(x); //생성자안에서 생성된 변수인 1
	}

	
}
