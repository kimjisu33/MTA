package third_day;

public class test22 {

	public static void main(String[] args) {
		char data1=65;	//���������� char�̹Ƿ� 65�� �ƽ�Ű�ڵ�� ������ A
		System.out.println(data1);
		
		long data2=65;
		System.out.println(data2);
		
		float data3 = new Float("-65.0");
		System.out.println(data3);
		
		short data4 = new Short("65.0"); //java.lang.NumberFormatException �߻�
		//65.0�� short Ÿ���� �ƴ�
		System.out.println(data4);
				
	}

}