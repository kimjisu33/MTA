//비교연산자와 논리 연산자 사용하기
package first_day;

public class ex2_7 {

	public static void main(String[] args) {
		System.out.println('a'>'b');
		System.out.println(3>=2);
		System.out.println(-1<0);
		System.out.println(3.45<=2);
		System.out.println(3==2);
		System.out.println(3!=2);
		System.out.println(!(3!=2));
		
		System.out.println((3>2)&&(3>4));
		System.out.println((3!=2)||(-1>0));
		System.out.println((3!=2)^(-1>0));
	}

}
