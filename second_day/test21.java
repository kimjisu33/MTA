package second_day;

public class test21 {

	public static void main(String[] args) {
		String numberString="100";
		double n=Double.parseDouble(numberString);
		//parseDouble()은 static 메소드이므로 객체 대신 클래스명 사용 -> 원시 double 리턴
		//Double.valueOf() -> 객체 wrapper Double 리턴
		System.out.println(n);
	}

}
