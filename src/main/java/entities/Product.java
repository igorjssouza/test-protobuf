package entities;

public class Product {
	// encapsulado usando private
	private String name;
	private int accountNumber;
	private double deposit;
	
	//=================== CONSTRUTORES ============================

	
	public Product(String name, int accountNumber, double deposit) {

		this.name = name;
		this.accountNumber = accountNumber;
		this.deposit = deposit;
	}
	
	public Product(String name, int accountNumber) {

		this.name = name;
		this.accountNumber = accountNumber;
	}
	
	//========================= DESENCAPSULADORES =======================
	// por convenção esses metodos são colocados depois dos construtores
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getDeposit() {
		return deposit;
	}


	
	
	//================ MÉTODOS ==========================
	
	public void in(double deposit) {
		this.deposit +=  deposit;
		
	}
	
	public void out(double deposit) {
		this.deposit -=  deposit + 5.0;
		
	}

	public String toString() {
		return "Account " + accountNumber 
				+ ", Holder: " 
				+ name 
				+ ", Balance: $ " 
				+ String.format("%.2f", deposit);
	}
}