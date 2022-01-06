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
		switch(age) { //swtich문에서는 범위를 사용할 수 없다. 조건 3개 초과
		case 25: discount=0.50; break;
		case 24: case 23: case 22: case 21:discount=0.24;
		}
		
		//2
		String grade="A";
		String message;
		if(grade=="A") {
			message="표준 초과";
		}else if(grade=="B") {
			message="표준 충족";
		}else {
			message="개선 필요";
		}
		switch(grade) { //switch문으로 변경 가능
		case "A" : message="표준 초과"; break;
		case "B" : message="표준 충족"; break;
		default : message="개선 필요";
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
		switch(gpa) {//switch문에 실수형이 들어올 수 없음.
		case 4.0:priority=1; break;
		case 3.0:priority=2; break;
		case 2.5:priority=3; break;
		}*/
	}

}
