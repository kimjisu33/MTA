package third_day;

class StaticAndThis{
	int n;
	static int m;
	void f1(int x) {this.n=x;}
	void f2(int x) {this.m=x;}
	static void s1(int x) {
		//this.n=x //static 메소드에서 this 사용할 수 없음
	}
	static void s2(int x) {
		//this.n=x //static 메소드에서 this 사용할 수 없음
	}
}
public class statuc_this {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
