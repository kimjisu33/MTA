package third_day;

import java.util.ArrayList;

public class test29 {
	public static void Process(ArrayList<String> invoices) {

		System.out.println("ó�� �� ����Ʈ : "+invoices);
		
		for(int i=0 ; i<invoices.size() ; ) {
			String invoice=invoices.get(i);
			//û���� ó��
			System.out.println(invoices.get(i)+"����");
			invoices.remove(i);
			System.out.println(invoices);
		}
		

		System.out.println("ó�� �� ����Ʈ : "+invoices);
		System.out.println("ó�� �� ��� ���� : "+invoices.size());
	}
	public static void main(String[] args) {
		ArrayList<String> invoices=new ArrayList<String>();
		invoices.add("a");
		invoices.add("b");
		invoices.add("c");
		Process(invoices);
	}

}
