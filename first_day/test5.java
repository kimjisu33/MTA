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
anum�� ������ �����̰� add(int anum)�� �Ű������� �ٸ��⶧���� ������ anum�� �������� �ʴ´�.
1. cnt�� 9�̸� anum ���� 55�Դϴ�.
2. cnt�� 7�̸� anum ���� 55�Դϴ�.

���� cnt�� for������ ����Ǿ��⶧���� �ۿ��� ����ϸ� ����
3. ���� cnt�� ������ ����ϴ�.
 */
