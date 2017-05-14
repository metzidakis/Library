import java.util.Date;

public class Transaction {
	
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
