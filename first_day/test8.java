package first_day;

import java.util.Scanner;
public class test8 {
	public static String getBirthdate() {
		System.out.println("������ MMDDYYYY �������� �Է��Ͻʽÿ�.");
		Scanner sc=new Scanner(System.in);
		String birthdate=sc.next();
		sc.close();
		return birthdate;
	}
	public static void main(String[] args) {
		System.out.println(getBirthdate());
	}
}


//�� java.util.Scanner
//�� Scanner sc=new Scanner(System.in)
//�� sc.next();
//�� sc.close();
