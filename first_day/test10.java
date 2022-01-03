package first_day;

public class test10 {

	public static void main(String[] args) {
		int number=10;
		//String text1=''+number; //String은 ''사용 못함
		String text2=""+number;
		//String text3=number.toString(); //number가 원시변수 이므로 toString 사용 불가
		String text4=String.valueOf(number);
		
		//System.out.println(text1);
		System.out.println(text2);
		//System.out.println(text3);
		System.out.println(text4);
	}

}
