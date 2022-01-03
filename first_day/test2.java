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

//같은 클래스내의 변수, 메소드이기 때문에 public이 아닌 접근제어자를 사용해도 오류가 발생하지 않는다.
//main메소드가 static 이기 때문에 static 멤버들만 사용가능
//customer. 을 추가하지 않으려면 id와 showId()에 static 부여하기
