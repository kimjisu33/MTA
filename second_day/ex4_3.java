package second_day;

public class ex4_3 {
	int radius;
	String name;
	
	public ex4_3() {
		this.radius=1;
		this.name="";
	}
	public ex4_3(int r, String n) {
		this.radius=r;
		this.name=n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		ex4_3 pizza=new ex4_3(10,"�ڹ�����");
		
		double area=pizza.getArea();
		System.out.println(pizza.name+"�� ������ "+area);
		
		ex4_3 donut=new ex4_3();
		donut.name="��������";
		area=donut.getArea();
		System.out.println(donut.name+"�� ������ "+area);
		
	}

}
