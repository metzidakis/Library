import java.util.ArrayList;

public class TransactionQueue  {

	
	
	/*
	    				      Exercise 3 (continued)
		Create a TransactionQueue class that serves as a Queue data structure for storing Transactions that are pending to be executed. 
		The TransactionQueue should be implemented by a data-structure of your preference (simple arrays, ArrayList, Linked-list) 
		but should provide only the methods of a Queue
		An instance variable of type TransactionQueue should be introduced in your Librarian class 
		since a librarian is responsible for serving the requests
		Every time that a book is requested, a Transaction should be created and stored in the Queue.
	 */
	
	//variable
	ArrayList <Transaction> transactionQueue;
	
	//Constructor
	TransactionQueue () {
		this.transactionQueue = new ArrayList<>();
	}
	
	//method for getting the size
	public int getSize() {
		return transactionQueue.size();
	}
	
	//method for getting the object in the i line
	public Transaction get( int i) {
		return transactionQueue.get(i);
	}
	
	//method for adding a Transaction
	public void addTransaction(Transaction transaction) {
		transactionQueue.add(transaction);
	}
	
	//method for removing a Transaction
	public void removeTransaction() {
		if (transactionQueue.get(0) != null ) {
			System.out.println("Transaction Exetuted");
			transactionQueue.remove(0);
		}else {
			System.out.println("There are no pending transactions");
		}
	}
	
}
