package third_day;

import java.util.*;
public class ex7_3 {

	public static void main(String[] args) {
		ArrayList<String> a =new ArrayList<String>();
		
		Scanner scan=new Scanner(System.in);
		for(int i=0 ; i<4 ; i++) {
			System.out.print("�̸��� �Է��ϼ��� >> ");
			String s=scan.next();
			a.add(s);
		}
		
		for(int i=0 ; i<4 ; i++) {
			String name=a.get(i);
			System.out.print(name+" ");
		}
		
		int longestIndex=0;
		for(int i=0 ; i<4 ; i++) {
			if(a.get(longestIndex).length() < a.get(i).length()) {
				longestIndex=i;
			}
		}
		System.out.println("\n���� �� �̸��� : "+a.get(longestIndex));
		
		scan.close();
	}
	

}
