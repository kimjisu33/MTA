package third_day;

class Shape{
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println(name);
	}
}
class Circle extends Shape{
	protected String name;
	public void draw() {
		name="Circle";
		super.name="Shape";
		super.draw();
		System.out.println(name);
	}
}

public class binding {

	public static void main(String[] args) {
		Shape b= new Circle();
		b.paint();
	}

}
