package third_day;

import java.util.*;
public class ex7_3 {

	public static void main(String[] args) {
		ArrayList<String> a =new ArrayList<String>();
		
		Scanner scan=new Scanner(System.in);
		for(int i=0 ; i<4 ; i++) {
			System.out.print("이름을 입력하세요 >> ");
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
		System.out.println("\n가장 긴 이름은 : "+a.get(longestIndex));
		
		scan.close();
	}
	

}
