package first_day;

public class test9 {

	public static void main(String[] args) {
		int age=22;
		int income=25000;
		if(age>65&&income>=10000 || age>=21&&income>25000){
			System.out.println("Approved");
		}
		else{
			System.out.println("Declined");
		}
	}

}

/*
65�� �ʰ� ������̸� �ּ� ���� �ҵ��� 10000 �̻�
21�� �̻��̸� ���� �ҵ��� 25,000 �ʰ�

if(age>65&&income>=10000 || age>=21&&income>25000){
	System.out.println("Approved");
}
else{
	System.out.println("Declined");
}
*/