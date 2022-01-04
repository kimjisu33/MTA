package second_day;

public class test20 {

	public static void main(String[] args) {
		String firstName="Christopher";
		firstName=firstName.substring(0,5); //0번째부터 5개. 만약 .substring(5)이면 5번방부터 마지막 까지
		String output=String.format("%s is %d charcters long", firstName, firstName.length());
		//firstName은 String이므로 %s
		//firstName.length()은 int이므로 %d
		System.out.println(output);
	}

}
