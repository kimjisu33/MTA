package first_day;

public class test5 {
	public static void main(String[] args) {
		int anum=55;
		for(int cnt=0 ; cnt<10 ; cnt++) {
			add(anum);
			System.out.println(cnt+" "+anum);
		}
		//System.out.println(cnt);
	}
	public static void add(int anum) {
		anum++;
	}
}

/*
anum은 메인의 변수이고 add(int anum)의 매개변수와 다르기때문에 메인의 anum은 증가하지 않는다.
1. cnt가 9이면 anum 값은 55입니다.
2. cnt가 7이면 anum 값은 55입니다.

변수 cnt가 for문에서 선언되었기때문에 밖에서 출력하면 오류
3. 변수 cnt가 범위를 벗어납니다.
 */
