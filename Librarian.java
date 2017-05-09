class Librarian {

	/*                  Class Librarian
		Fields:
		library, type Library. The library that he manages.
		Methods:
		findMeBooksFromAuthor, type void. Receives an author name and delegates the request to the library's printBooksFromAuthor method
		findMeAvailableBooks, type void. Delegates the request to the library's printAvailableBooks method
		findMeBook, type void. Receives a book's title and delegates the request to the library's printBookDetails method
		findMostPopularBook, type void. Delegates the request to the library's printTheMostPopularBook method
		
					Exercise 3 (continued)
		Give the Librarian the ability to perform the rentPhysicalCopy functionality. 
		The librarian should retrieve the book (through the Library), create the necessary transaction and store it to his pendiong queue.
		Extend the command-line User Interface to include all newly added functionalities! (add book, remove book, execute transactions)

	*/

	//Instance variables
	Library library;
	TransactionQueue transactionQueue;


	//constructor
	Librarian ( Library library ) {
		this.library = library;
		this.transactionQueue = new TransactionQueue();
	}

	//Receives an author name and delegates the request to the library's printBooksFromAuthor method
	public void findMeBooksFromAuthor(String dump) {
		library.printBooksFromAuthor(dump);

	}

	//Delegates the request to the library's printAvailableBooks method
	public void findMeAvailableBooks() {
		library.printAvailableBooks();

	}

	//Receives a book's title and delegates the request to the library's printBookDetails method
	public void findMeBook(String proxy) {
		library.printBookDetails(proxy);

	}

	//Delegates the request to the library's printTheMostPopularBook method
	public void findMostPopularBook() {
		library.printTheMostPopularBook();

	}
	
	//method for renting a book if it exists
	public void rentPhysicalCopy(String bookName) {
		if (library.isAvailable(bookName)){
			library.rentPhysicalCopy(bookName);
			Transaction transaction = new Transaction(library.bookWithTitleIs(bookName));
			transactionQueue.addTransaction(transaction);
		}else {
			System.out.println("Book Unavailable :(");
			System.out.println("Transaction Failed :(");
		}
	}

	//method for executing all pending transactions
	public void executePendingTransactions() {
		for ( int i = 0; i < transactionQueue.getSize(); i++ ) {
			transactionQueue.get(0).setDateOfServing();
			TransactionHistory.transactionHistory.add(transactionQueue.get(0));
			transactionQueue.removeTransaction();
		}
	}
	
	//method for printing all pending transactions
	public void printPendingTransactions() {
		System.out.println("-----------------------------------Pending Transactions-----------------------------------");
		for ( int i = 0; i < transactionQueue.getSize(); i++ ) {
			System.out.println(transactionQueue.get(i).toString());
		}
	}
	
	//remove book if it exists
	public void removeBook( String bookName) {
		library.removeBook(bookName);
	}
	
	//method for adding book if it does not exist
	public void addBook( Book book ) {
		library.addBook(book);
	}
}