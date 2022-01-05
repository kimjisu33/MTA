package third_day;

public class test26 {

	public static void main(String[] args) {
		int a=5;
		int b=10;
		int c= ++a * b--; //6 * 10
		//a=6 / b=9
		System.out.println(c); //60
		
		int d= a-- + ++b; //6 + 10
		//a=5 / b=10
		System.out.println(d); //16
	}

}
