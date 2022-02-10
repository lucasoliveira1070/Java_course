package entities;

public class Account {
	private int numAccount;
	private String nameHolderAccount;
	private double ammount;
	
	private static double FEE = 5.00;
	
	public Account() {
		
	}
	
	public Account(int numAccount, String nameHolderAccount, double ammount) {
		this.numAccount = numAccount;
		this.nameHolderAccount = nameHolderAccount;
		deposit(ammount);
	}
	
	public Account(int numAccount, String nameHolderAccount) {
		this.numAccount = numAccount;
		this.nameHolderAccount = nameHolderAccount;
	}
	
	public int getnumAccount() {
		return this.numAccount;
	}
	
	public String getnameHolderAccount() {
		return this.nameHolderAccount;
	}
	
	public void setnameHolderAccount(String nameHolderAccount) {
		this.nameHolderAccount = nameHolderAccount;
	}
	
	public double getAmmount() {
		return this.ammount;
	}
	

	public void withdraw(double ammount) {
		this.ammount -= ammount + FEE;
	}
	
	public void deposit(double ammount) {
		this.ammount += ammount;
	}
	
	public String toString() {
		return "Account data: "
				+"Account: "+numAccount
				+", Holder: "
				+nameHolderAccount 
				+", Balance: $ "
				+String.format("%.2f",ammount);
	}
	
}
