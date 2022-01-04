package second_day;

class Account1{
	double balance;
	public Account1(double startingBalance) {
		this.balance=startingBalance;
	}	
	public double getBalance() {
		return balance;
	}
}
class SavingAccount extends Account1{
	public SavingAccount(double startingBalance) {
		super(startingBalance);
	}	
	
	@Override
	public String toString() {
		return String.format("Savings Current Balance: $%.2f", this.getBalance());
	}
}

public class test13 {

	public static void main(String[] args) {
		SavingAccount s=new SavingAccount(1000);
		
		System.out.println(s.toString());
	}

}
