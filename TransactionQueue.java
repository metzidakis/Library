import java.util.ArrayList;

public class TransactionQueue  {
	
	//variable
	private ArrayList <Transaction> transactionQueue;
	
	//Constructor
	TransactionQueue () {
		this.transactionQueue = new ArrayList <> ();
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
