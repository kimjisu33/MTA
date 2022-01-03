package first_day;

import java.util.Scanner;
public class test11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner("1 탁월 2 우수 3 양호 4 불량");
		Object data1=sc.next(); //공백까지 문자열로
		Object data2=sc.next(); //공백까지 문자열로
		Object data3=sc.nextInt(); //공백까지 정수로
		Object data4=sc.nextLine(); //한줄 \n까지 
	
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
	}
}

//1

//탁월
//2
// 우수 3 양호 4 불량


