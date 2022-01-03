package first_day;

class test1 {

	public static void main(String[] args){
		double pi = Math.PI; //3.141593
		System.out.format("Pi is %.3f%n",pi);
		System.out.format("Pi is %.0f%n",pi);
		System.out.format("Pi is %09f%n",pi);
		
	}

}


/*
(답안)
Pi is 3.142 //소수점 3번째 자리에서 >>반올림<<
Pi is 3 //소수점 없이. 정수로 출력
Pi is 03.141593 //9까지의 자리까지 채우기. 앞 빈공간을 0으로 채움. 소수점'.'도 자리수에 포함
*/
