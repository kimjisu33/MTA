package second_day;

public class ex_for_each {
	enum Week{��, ȭ, ��, ��, ��, ��, ��}; //����ڰ� ���� ������ Ÿ��
	
	public static void main(String[] args) {
		int[] num= {1,2,3,4,5};
		int sum=0;
		for(int k:num) sum+=k;
		System.out.println("���� "+sum);
		
		String names[]= {"���","��","�ٳ���","ü��","����","����"};
		for(String s:names) System.out.print(s+" ");
		System.out.println();
		
		for(Week day: Week.values()) System.out.print(day+"���� ");
		
	}

}
