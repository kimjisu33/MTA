package third_day;

class StaticAndThis{
	int n;
	static int m;
	void f1(int x) {this.n=x;}
	void f2(int x) {this.m=x;}
	static void s1(int x) {
		//this.n=x //static �޼ҵ忡�� this ����� �� ����
	}
	static void s2(int x) {
		//this.n=x //static �޼ҵ忡�� this ����� �� ����
	}
}
public class statuc_this {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
