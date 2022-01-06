package fourth_day;

public class Pickle {
	boolean isPreserved=false;
	private boolean isCreated=false;
	void preserve() {
		isPreserved=true;
	}
	public static void main(String[] args) {
		Pickle pickle=new Pickle();
		pickle.isCreated=true; //static 멤버가 아니므로 객체를 만들어야 접근 가능
		pickle.preserve();	//static 아님2
	}

}
