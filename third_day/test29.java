package third_day;

import java.util.ArrayList;

public class test29 {
	public static void Process(ArrayList<String> invoices) {

		System.out.println("贸府 傈 府胶飘 : "+invoices);
		
		for(int i=0 ; i<invoices.size() ; ) {
			String invoice=invoices.get(i);
			//没备辑 贸府
			System.out.println(invoices.get(i)+"力芭");
			invoices.remove(i);
			System.out.println(invoices);
		}
		

		System.out.println("贸府 饶 府胶飘 : "+invoices);
		System.out.println("贸府 饶 夸家 俺荐 : "+invoices.size());
	}
	public static void main(String[] args) {
		ArrayList<String> invoices=new ArrayList<String>();
		invoices.add("a");
		invoices.add("b");
		invoices.add("c");
		Process(invoices);
	}

}
