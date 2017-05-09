class Library {

	/*
	Class Library
	Methods:
	printAvailableBooks, type void. Prints books that have at least one available physical copy. Hint: Use the isAvailable and the toString methods from the Book class
    printBookDetails (Searches for a book based on a given title. If the book exists then its details should be printed, otherwise an error message should be displayed)
    printBooksFromAuthor, type void. Prints only the books that have an author that matches a given name
    printTheMostPopularBook, type void. Prints the book with the highest number of the timesRented field.
    */

	//Instance variables
	private Book[] books;

	//constructor
	Library ( Book[] books) {
		this.books = books;
	}

	//Prints all books that have at least one available physical copy.
	public void printAvailableBooks() {
		int a = 0;
		System.out.println("Books available for renting:");
		for(int i = 0; i < books.length; i++){
			if ( books[i].isAvailable() == true ) {
			    a++ ;
				System.out.println( a +". " + books[i].toString());
			}
		}
	}

	//Searches for a book based on a given title. If the book exists then its details should be printed, otherwise an error message should be displayed
	public void printBookDetails( String proxy ) {
		boolean b = false;
		int a=0;
		for(int i = 0; i < books.length; i++) {
			if ( books[i].getName().equals (proxy) ) {
				a = i;
				b = true;
			}
		}
			if ( b == true) {
				System.out.println("Book Details: " + books[a].toString());
			}else {
				System.out.println( " We are sorry but we couldn't find " + proxy + ".");
			}
	}

	//Prints only the books that have an author that matches a given name
	public void printBooksFromAuthor( String proxy) {
		System.out.println(" Books from author " + proxy + ":");
		boolean b = false;
		for(int i = 0; i < books.length; i++) {
			if ( books[i].hasAuthor( proxy ) ) {
				System.out.println( books[i].toString() );
				b = true;
			}
		}
		if ( b == false ) {
			System.out.println( "None" );
		}


	}

	//Prints the book with the highest number of the timesRented field.
	public void printTheMostPopularBook() {
		int a = books[0].getTimesRented();
		int b = 0;
		for(int i = 1; i < books.length; i++) {
			if ( books[i].getTimesRented() > a ) {
				a = books[i].getTimesRented();
				b = i;
			}

		}
		System.out.println("Most rented book until now is " + books[b].getName());
	}


}