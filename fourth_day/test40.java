package fourth_day;

public class test40 {

	public static void main(String[] args) {
		//1
		int age=27;
		double discount;
		if(age>=25) {
			discount=0.50;
		}else if(age>=21) {
			discount=0.25;
		}else {
			discount=0.0;
		}
		switch(age) { //swtich�������� ������ ����� �� ����. ���� 3�� �ʰ�
		case 25: discount=0.50; break;
		case 24: case 23: case 22: case 21:discount=0.24;
		}
		
		//2
		String grade="A";
		String message;
		if(grade=="A") {
			message="ǥ�� �ʰ�";
		}else if(grade=="B") {
			message="ǥ�� ����";
		}else {
			message="���� �ʿ�";
		}
		switch(grade) { //switch������ ���� ����
		case "A" : message="ǥ�� �ʰ�"; break;
		case "B" : message="ǥ�� ����"; break;
		default : message="���� �ʿ�";
		}
		
		//3
		double gpa=4.0;
		int priority;
		if(gpa==4.0) {
			priority=1;
		}else if(gpa==3.0) {
			priority=2;
		}else if(gpa>=4.0) {
			priority=3;
		}
		/*
		switch(gpa) {//switch���� �Ǽ����� ���� �� ����.
		case 4.0:priority=1; break;
		case 3.0:priority=2; break;
		case 2.5:priority=3; break;
		}*/
	}

}
