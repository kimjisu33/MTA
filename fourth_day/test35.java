package fourth_day;

public class test35 {

	public static void main(String[] args) {
		String s1="Hello World";
		String s2="Hello World";
		String s3=s2;
		String s4=new String("Hello World"); //new는 같은 객체를 참고하지 않음
		
		if(s1==s2)System.out.println("s1 및 s2는 메모리에서 같은 개체를 참조합니다. (예)");
		
		if(s2==s3)System.out.println("s2 및 s3는 메모리에서 같은 개체를 참조합니다. (예)");
		
		if(s2==s4)System.out.println("s2 및 s4는 메모리에서 같은 개체를 참조합니다. (예)");
		
		
		s1="aaaaa";
		s2="bbbbb";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
