package entities;

public class Product {

	private String name;
	private int accountNumber;
	private double deposit;
	
	/**
	* TODO
	*/
	public Product(String name, int accountNumber, double deposit) {

		this.name = name;
		this.accountNumber = accountNumber;
		this.deposit = deposit;
	}
	
	public Product(String name, int accountNumber) {

		this.name = name;
		this.accountNumber = accountNumber;
	}
	
	/**
	 * Returns accounts owner 
	*/
	public String getName() {
		return name;
	}

	/**
	 * Sets accounts owner
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns accounts number (Integer - ID)
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Returns accounts balance
	 *
	 * TODO: To change the attribute name 'deposit' to 'balance'
	 */
	public double getDeposit() {
		return deposit;
	}

	/**
	 * Deposit in account
	 *
	 * @param deposit deposit value to add to accounts balance
	 */
	public void in(double deposit) {
		this.deposit +=  deposit;
		
	}
	
	/**
	 * Withdraw in account
	 *
	 * @param deposit value to withdraw from accounts balance
	 */
	public void out(double deposit) {
		this.deposit -=  deposit + 5.0;
		
	}

	/**
	 * TODO
	 */
	public String toString() {
		return "Account " + accountNumber 
				+ ", Holder: " 
				+ name 
				+ ", Balance: $ " 
				+ String.format("%.2f", deposit);
	}
}
