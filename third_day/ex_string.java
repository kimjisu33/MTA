package third_day;

public class ex_string {

	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		a=a.concat(b); //a�ڿ� b�� ������ ���ο� ��Ʈ�� ����
		System.out.println(a);
		a=a.trim(); //�յ� ��������
		System.out.println(a);
		a=a.replace("C#", "Java"); //C#�� Java�� �ٲٱ�
		System.out.println(a);
		
		String s[]=a.split(","); // , �� �������� ������
		for(int i = 0 ;i<s.length ; i++) System.out.print(s[i]+" ");
		System.out.println();
		
		a=a.substring(5); //5��° ����� ������
		System.out.println(a);
		char c=a.charAt(2); //�ε��� 2
		System.out.println(c);
	}

}
