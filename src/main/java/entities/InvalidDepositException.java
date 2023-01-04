package entities;

public class InvalidDepositException extends RuntimeException{
	public InvalidDepositException(){
		super("Invalid Deposit Error: Only positive values are allowed for deposits!");
	}
}