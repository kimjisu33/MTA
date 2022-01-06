package fourth_day;

public class test33 {
	public static void traverse(String[][] board) {
		for(int x=0 ; x<board.length ; x++) {
			for(int y=0 ; y<board[x].length ; y++) {
				System.out.print(board[x][y]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		String[][] a= {
				{"1","2","3"},
				{"4","5","6"},
				{"7","8","9"}
		};
		traverse(a);

	}

}
