package second_day;

public class test20 {

	public static void main(String[] args) {
		String firstName="Christopher";
		firstName=firstName.substring(0,5); //0��°���� 5��. ���� .substring(5)�̸� 5������� ������ ����
		String output=String.format("%s is %d charcters long", firstName, firstName.length());
		//firstName�� String�̹Ƿ� %s
		//firstName.length()�� int�̹Ƿ� %d
		System.out.println(output);
	}

}
