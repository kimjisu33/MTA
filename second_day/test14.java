package second_day;

class Account{
	protected int balance;
	public Account() {
		this.balance=0;
	}
	public Account(int amount) {
		this.balance=amount;
	}
}
public class test14 {

	public static void main(String[] args) {
		Account a= new Account();
	}

}
