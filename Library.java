public class Library {

	/*
	Class Library
	Methods:
	printAvailableBooks, type void. Prints books that have at least one available physical copy. Hint: Use the isAvailable and the toString methods from the Book class
    printBookDetails (Searches for a book based on a given title. If the book exists then its details should be printed, otherwise an error message should be displayed)
    printBooksFromAuthor, type void. Prints only the books that have an author that matches a given name
    printTheMostPopularBook, type void. Prints the book with the highest number of the timesRented field.
    */

	//Instance variables
	private BookList bookList;
	private TransactionHistory transactionHistory;


	//constructor
	Library ( BookList booklist) {
		this.bookList = booklist;
	}

	//Prints all books that have at least one available physical copy.
	public void printAvailableBooks() {
		bookList.printAllAvailableBooks();
	}

	//Searches for a book based on a given title. If the book exists then its details should be printed,
	//otherwise an error message should be displayed
	public void printBookDetails( String proxy ) {
		bookList.printBookDetails (proxy);
	}

	//Prints only the books that have an author that matches a given name
	public void printBooksFromAuthor( String authorName) {
		bookList.printBooksFromAuthor(authorName);
	}

	//Prints the book with the highest number of the timesRented field.
	public void printTheMostPopularBook() {
		bookList.printTheMostPopularBook();
	}
	
	//remove book if it exists
	public void removeBook( String bookName) {
		bookList.removeBook(bookList.BookWithTitleIs(bookName));
	}
	
	//method for adding book if it does not exist
	public void addBook( Book book ) {
		bookList.addBook(book);
	}
	
	//Searches for a book based on a given title. Returning the book
	public Book bookWithTitleIs(String bookName) {
		return bookList.BookWithTitleIs(bookName);
	}
	
	//Checks if there is at least one available physical copy of the book
	public boolean isAvailable(String bookName) {
		return bookList.isAvailable(bookName);
	}
	
	//rent physical copy of  book if it exists and if there are physical copies
	public void rentPhysicalCopy(String bookName) {
		bookList.rentPhysicalCopy(bookName);
	}
	
	//method for printing all pending transactions
	public void printPendingTransactions() {
		System.out.println("-----------------------------------Transaction History-----------------------------------");
		for ( int i = 0; i < TransactionHistory.transactionHistory.size(); i++ ) {
			System.out.println(TransactionHistory.transactionHistory.get(i).toString());
		}
	}
	



}