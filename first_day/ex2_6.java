//증감연산자
package first_day;

public class ex2_6 {
	public static void main(String args[]) {
		int a=3, b=3, c=3;
		
		a+=3; //3+3 = 6
		b*=3; //3*3 = 9
		c%=2; //3%2 = 1
		System.out.println("a="+a+", b="+b+", c="+c);
		
		int d=3;
		a=d++; //a=3 b=4
		System.out.println("a="+a+", d="+d);
		a=++d; //a=5 b=5
		System.out.println("a="+a+", d="+d);
		a=d--; //a=5 b=4
		System.out.println("a="+a+", d="+d);
		a=--d; //a=3 b=3
		System.out.println("a="+a+", d="+d);
	}
}
