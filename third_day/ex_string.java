package third_day;

public class ex_string {

	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		a=a.concat(b); //a뒤에 b를 덧붙인 새로운 스트링 리턴
		System.out.println(a);
		a=a.trim(); //앞뒤 공백제거
		System.out.println(a);
		a=a.replace("C#", "Java"); //C#을 Java로 바꾸기
		System.out.println(a);
		
		String s[]=a.split(","); // , 을 기준으로 나누기
		for(int i = 0 ;i<s.length ; i++) System.out.print(s[i]+" ");
		System.out.println();
		
		a=a.substring(5); //5번째 방부터 끝까지
		System.out.println(a);
		char c=a.charAt(2); //인덱스 2
		System.out.println(c);
	}

}
