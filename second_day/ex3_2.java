//배열 리턴
package second_day;

public class ex3_2 {

	static int[] makeArray() {
		int[] temp=new int[4];
		for(int i=0 ; i<temp.length ; i++) {
			temp[i]=i;
		}
		return temp;
	}
	public static void main(String[] args) {
		int intArray[];
		intArray=makeArray();
		
		for(int i=0 ; i<intArray.length ; i++) {
			System.out.print(intArray[i]+" ");
		}
	}

}

//parse는 원시형 리턴
//valueof는 wrapper형 리턴