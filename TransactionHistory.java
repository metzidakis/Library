import java.util.ArrayList;

public class TransactionHistory {

	/*
	 							Exercise 3 (continued)
			Create a TransactionHistory class that represents a List data structure that stores executed Transactions.
			A field of type TransactionHistory should be introduced in your Library class
			Create a method executePendingTransactions() in your Librarian class. 
			When this method is called by the Librarian it should execute one by one all stored pending transactions 
			and print an indicative message for each executed transaction.
			Every executed Transaction should be removed from the pending transactions list and moved in the transaction history list of 
			the Library class.
			Add a method that prints all pending transactions in the Librarian class and all a method that prints the 
			transaction history in the Library
	 */
	
	
	//variable
	static ArrayList <Transaction> transactionHistory;
	
	//constructor
	TransactionHistory () {
		this.transactionHistory = new ArrayList<>();
	}
	
	
	
	
	
	
	
	
}
