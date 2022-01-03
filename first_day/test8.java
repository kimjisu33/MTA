package first_day;

import java.util.Scanner;
public class test8 {
	public static String getBirthdate() {
		System.out.println("생일을 MMDDYYYY 형식으로 입력하십시오.");
		Scanner sc=new Scanner(System.in);
		String birthdate=sc.next();
		sc.close();
		return birthdate;
	}
	public static void main(String[] args) {
		System.out.println(getBirthdate());
	}
}


//① java.util.Scanner
//② Scanner sc=new Scanner(System.in)
//③ sc.next();
//④ sc.close();
