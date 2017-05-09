class Librarian {

	/*                  Class Librarian
		Fields:
		library, type Library. The library that he manages.
		Methods:
		findMeBooksFromAuthor, type void. Receives an author name and delegates the request to the library's printBooksFromAuthor method
		findMeAvailableBooks, type void. Delegates the request to the library's printAvailableBooks method
		findMeBook, type void. Receives a book's title and delegates the request to the library's printBookDetails method
		findMostPopularBook, type void. Delegates the request to the library's printTheMostPopularBook method

	*/

	//Instance variables
	Library library;

	//constructor
	Librarian ( Library library ) {
		this.library = library;
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

}