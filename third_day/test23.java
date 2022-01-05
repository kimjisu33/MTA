package third_day;

public class test23 {
	public static boolean duplicate(int[] array) {
		boolean isDuplicate=false;
		for(int x=0 ; x<array.length-1 ; x++) {
			for(int y=x+1 ; y<array.length ; y++) {
				if(array[x]==array[y]) {
					isDuplicate=true;
					if(isDuplicate) break;
				}
			}
		}
		System.out.println(isDuplicate);
		return isDuplicate;
	}
	public static void main(String[] args) {
		int array[]= {1,2,3,2};
		duplicate(array); //같은 값이 있으면 true
	}

}
