package fourth_day;

public class test42 {
	public static double safeRoot(double radicand, double index) {
		if(radicand>=0) { //radicand�� ��� �̸�
			return Math.pow(radicand, 1/index);
		}else {
			if(index%2==0) {//radicand�� �����̰� index�� ¦���̸�
				return (Double) null;
			}else{//radicand�� �����̰� index�� Ȧ���̸�
				return -Math.pow(radicand, 1/index);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
