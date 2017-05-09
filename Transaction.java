import java.util.Date;

public class Transaction {
	
	
	/*
	                            Exercise 3 (continued)
			Create a class named Transaction that stores information related to the "renting a book", operation.
			Your class should have keep the following information
			The book for which the transaction is being performed
			The date of requesting the current transaction
			The date of serving of the current transaction
			A counter that stores how many Transactions have been made
			A unique identifier (that cannot be changed after initialization) for each Transaction created
			It should provide an overloaded Constructor and a setServedDate() method that updates the relevant instance variable
	 */
	
	// Instance variables
	private Book book;
	private Date dateOfRequesting;
	private Date dateOfServing;
	private static int transactionCounter;
	private final int identifier;
	
	//constructor
	Transaction( Book book ) {
		this.dateOfRequesting = new Date();
		this.dateOfServing = new Date();
		this.book = book;
		this.identifier = transactionCounter;
		transactionCounter++;
	}
	
	//setter
	public void setDateOfServing () { 
		this.dateOfServing = new Date(); 
	}
	
	//print details as String


}
