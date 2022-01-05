//String 변수나 객체 변수를 비교할때
package third_day;

class Point{
	private int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x==p.x && y==p.y) return true;
		else return false;
	}
}
public class ex6_3 {

	public static void main(String[] args) {
		Point a=new Point(2, 3);
		Point b=new Point(2, 3);
		Point c=new Point(3, 4);
		
		if(a==b) //주소비교 false
			System.out.println("a==b");
		if(a.equals(b)) //true
			System.out.println("a is equal to b");
		if(a.equals(c)) //false
			System.out.println("a is equal to b");
	}

}
