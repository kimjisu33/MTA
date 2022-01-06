package fourth_day;

public class test39 {

	public static void main(String[] args) {
		try {
			int x=1/0;
			System.out.println("try"); //위에서 ArithmeticException이 발생하여 catch로 넘어감. 실행되지 않음
		}catch(ArithmeticException ex) {
			System.out.println("catch ArithmeticException"); //실행
		}catch(Exception ex) { 
			//최상위 Exception / 순서 바뀌면 컴파일 오류생김
			//catch는 범위가 작은것 부터 써야함~
			System.out.println("catch Exception"); //위쪽의 catch문에 걸려 실행 되지 않음
		}finally {
			System.out.println("finally"); //예외 발생에 관계없이 실행됨
		}
	}
}
