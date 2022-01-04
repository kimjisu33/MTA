package second_day;

public class ex4_5 {
	String title;
	String author;
	void show() {System.out.println(title+" "+author);}
	
	public ex4_5() {
		this("","");
		System.out.println("생성자 호출됨");
	}
	public ex4_5(String title) {
		this(title,"작자미상");
	}
	public ex4_5(String title, String author) {
		this.title=title;
		this.author=author;
	}
	
	public static void main(String[] args) {
		ex4_5 littlePrince=new ex4_5("어린왕자","생텍쥐페리");
		ex4_5 loveStory=new ex4_5("춘향전");
		ex4_5 emptyBook=new ex4_5(); //기본생성자 호출
		loveStory.show();
	}

}
