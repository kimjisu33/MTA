package fourth_day;

public class test42 {
	public static double safeRoot(double radicand, double index) {
		if(radicand>=0) { //radicand가 양수 이면
			return Math.pow(radicand, 1/index);
		}else {
			if(index%2==0) {//radicand가 음수이고 index가 짝수이면
				return (Double) null;
			}else{//radicand가 음수이고 index가 홀수이면
				return -Math.pow(radicand, 1/index);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
