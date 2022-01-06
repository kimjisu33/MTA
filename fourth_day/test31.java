package fourth_day;

public class test31 {
	public static void convertStringToNumber(String numberAsString) {
		double number=Double.parseDouble(numberAsString);
		System.out.println(number);
		number+=10;
		System.out.println(number);
	}
	public static void main(String[] args) {
		String num="3.14";
		convertStringToNumber(num);
	}

}
