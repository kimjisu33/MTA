package fourth_day;

public class Pickle {
	boolean isPreserved=false;
	private boolean isCreated=false;
	void preserve() {
		isPreserved=true;
	}
	public static void main(String[] args) {
		Pickle pickle=new Pickle();
		pickle.isCreated=true; //static ����� �ƴϹǷ� ��ü�� ������ ���� ����
		pickle.preserve();	//static �ƴ�2
	}

}
