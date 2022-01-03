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
65세 초과 고령자이며 최소 연간 소득이 10000 이상
21세 이상이며 연간 소득이 25,000 초과

if(age>65&&income>=10000 || age>=21&&income>25000){
	System.out.println("Approved");
}
else{
	System.out.println("Declined");
}
*/