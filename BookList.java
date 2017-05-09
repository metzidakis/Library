import java.util.ArrayList;
import java.util.Arrays;

public class BookList {
	
	/*
                                   Exercise 3 (continued)
		Create a class BookList that represents a List data structure that stores Book objects
		An instance variable of type BookList should be included in your Library class 
		also (replace the Book[] array from the previous implementation, if exists).
		The BookList can be implemented internally (wrap inside) by using the LinkedList data structure, 
		provided by the Java Collections Framework.
		Modify any code necessary in Library in order to delegate operation to the BookLists functionalities when needed
		
		                         Exercise 3 (continued)
		BookList should offer the following functionalities:
		exists(String title) - returns true or false if the book exists in the list
		add book(Book newBook) - adds a new book at the end of the list (only if the book doesn't exist)
		remove book - removes a book with a given title, if exists
		And also provide the following methods (previously Library's responsibilities)
		printAvailableBooks
		printBookDetails
		printBooksFromAuthor
		printTheMostPopularBook
	 */
	
	//variable
	ArrayList < Book > bookList;
	
	//constructor
	BookList ( Book[] booksArray ) {
		this.bookList = new ArrayList<>();
		this.bookList.addAll( Arrays.asList( booksArray ) );
	}
	
	//method for printing all available books
	public void printAllAvailableBooks() {
		int a = 0;
		System.out.println("Books available for renting:");
		for(int i = 0; i < bookList.size(); i++){
			if ( bookList.get(i).isAvailable() == true ) {
			    a++ ;
				System.out.println( a +". " + bookList.get(i).toString());
			}
		}
	}
	
	//Searches for a book based on a given title. Returning a boolean true or false respectively
	public boolean doesBookExist(String bookName) {
		boolean bookExists = false;
		for (int i = 0; i < bookList.size(); i++ ) {
			if (bookList.get(i).getName().equals(bookName)) {
				bookExists = true;
			}
		}
		return bookExists;
	}
	
	//Searches for a book based on a given title. Returning the book
		public Book BookWithTitleIs(String bookName) {
			int a = 0;
			for (int i = 0; i < bookList.size(); i++ ) {
				if (bookList.get(i).getName().equals(bookName)) {
					a = i;
				}
			}
			return bookList.get(a);
		}
	
	//Print books details only if the book exists
	public void printBookDetails (String bookName) {
		if ( doesBookExist(bookName) == true ) {
			for (int i = 0; i < bookList.size(); i++ ) {
				if (bookList.get(i).getName().equals(bookName)) {
					System.out.println("Book details: " + bookList.get(i).toString());
				}
			}	
		}else {
			System.out.println("Book not found :( ");
		}
	}

	//method for adding book if it does not exist
	public void addBook( Book book ) {
		if ( doesBookExist( book.getName() ) == true ) {
			System.out.println("This book already exist!!!");
		} else {
			bookList.add(book);
		}
	}
	
	//remove book if it exists
	public void removeBook( Book book ) {
		if ( doesBookExist( book.getName() ) == true ) {
			bookList.remove(book);
		} else {
			System.out.println("This book does not exist!!!");
		}
	}
	
	//Prints only the books that have an author that matches a given name
	public void printBooksFromAuthor( String authorName) {
		System.out.println(" Books from author " + authorName + ":");
		boolean b = false;
		for(int i = 0; i < bookList.size(); i++) {
			if ( bookList.get(i).hasAuthor( authorName ) ) {
				System.out.println( bookList.get(i).toString() );
				b = true;
			}
		}
		if ( b == false ) {
			System.out.println( "None" );
		}
	}
	
	//Prints the book with the highest number of the timesRented field.
	public void printTheMostPopularBook() {
		int max = bookList.get(0).getTimesRented();
		ArrayList <Book> mostPopularBooks = new ArrayList<Book>();
		for( int i = 1; i < bookList.size(); i++) {
			if ( bookList.get(i).getTimesRented() > max ) {
				max = bookList.get(i).getTimesRented();
				mostPopularBooks.clear();
				mostPopularBooks.add(bookList.get(i));
			}else if ( bookList.get(i).getTimesRented() == max ) {
				mostPopularBooks.add(bookList.get(i));
			}
		}
		System.out.print("Most rented books until now are: ");
		for ( int i = 0; i < mostPopularBooks.size(); i++) {
			System.out.println(mostPopularBooks.get(i).getName());
		}
	}
	
	//Checks if there is at least one available physical copy of the book
	public boolean isAvailable(String bookName) {
		boolean validate = false;
		for (int i = 0; i < bookList.size(); i++ ) {
			if (bookList.get(i).getName().equals(bookName) && bookList.get(i).isAvailable()) {
				validate = true;
			}
		}
		return validate;
	}
	
	//rent physical copy of  book if it exists and if there are physical copies
	public void rentPhysicalCopy(String bookName) {
		if ( doesBookExist(bookName) == true ) {
			for (int i = 0; i < bookList.size(); i++ ) {
				if (bookList.get(i).getName().equals(bookName)) {
					bookList.get(i).rentPhysicalCopy();
				}
			}	
		}else {
			System.out.println("Book not found :( ");
		}
	}
	

}
