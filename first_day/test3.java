package first_day;

public class test3 {

	public static void main(String[] args) {
		for(int i=0 ; i<args.length ; i++) {
			handleArgument(args[i]);
		}
	}

	private static void handleArgument(String string) {
		System.out.println(string);
	}
}

/*
ArrayList<String>		String 		String[]
args[i]	args[0]		args.length		args.length-1	args.length+1
args[i]		args[0]		args.charAt(i) 
*/
