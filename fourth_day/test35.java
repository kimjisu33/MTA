package fourth_day;

public class test35 {

	public static void main(String[] args) {
		String s1="Hello World";
		String s2="Hello World";
		String s3=s2;
		String s4=new String("Hello World"); //new�� ���� ��ü�� �������� ����
		
		if(s1==s2)System.out.println("s1 �� s2�� �޸𸮿��� ���� ��ü�� �����մϴ�. (��)");
		
		if(s2==s3)System.out.println("s2 �� s3�� �޸𸮿��� ���� ��ü�� �����մϴ�. (��)");
		
		if(s2==s4)System.out.println("s2 �� s4�� �޸𸮿��� ���� ��ü�� �����մϴ�. (��)");
		
		
		s1="aaaaa";
		s2="bbbbb";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
