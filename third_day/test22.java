package third_day;

public class test22 {

	public static void main(String[] args) {
		char data1=65;	//데이터형이 char이므로 65를 아스키코드로 가지는 A
		System.out.println(data1);
		
		long data2=65;
		System.out.println(data2);
		
		float data3 = new Float("-65.0");
		System.out.println(data3);
		
		short data4 = new Short("65.0"); //java.lang.NumberFormatException 발생
		//65.0은 short 타입이 아님
		System.out.println(data4);
				
	}

}
