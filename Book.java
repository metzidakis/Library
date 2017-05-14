
class Book {

	//Instance variables
	private String name;
	private AuthorList bookAuthors;
	private final String isbn;
	private int physicalCopies;
	private int availableCopies;
	private int timesRented;

	//Constructor
	Book ( String name, Author[] authors, String isbn, int physicalCopies, int availableCopies, int timesRented ) {
		this.name = name;
		this.bookAuthors = new AuthorList(authors) ;
		this.isbn = isbn;
		this.physicalCopies = physicalCopies;
		this.availableCopies = availableCopies;
		this.timesRented = timesRented;
	}

	//getters
	public String getName() { return name; }
	public AuthorList getBookAuthors() { return bookAuthors; }
	public String getIsbn() { return isbn; }
	public int getPhysicalCopies() { return physicalCopies; }
	public int getAvailableCopies() { return availableCopies; }
	public int getTimesRented() { return timesRented; }

	//setters
	public void  setName( String name ) { this.name = name; }
	public void  setAuthor( AuthorList bookAuthors ) { this.bookAuthors = bookAuthors; }
	public void  setPhysicalCopies( int physicalCopies ) { this.physicalCopies = physicalCopies; }
	public void  setAvailableCopies( int availableCopies ) { this.availableCopies = availableCopies; }
	public void  setTimesRented( int timesRented ) { this.timesRented = timesRented; }
	
	//method to add Author to Book
	public void addAuthorToBook(String authorName) {
		bookAuthors.addAuthor(authorName);
	}

	//Returns the details of the book including the Author details. The Authors' details should be acquired by the proper toString method.
	public String toString() { return "Name: " + name + ", Author: " + bookAuthors.toString() + "ISBN :" + isbn + ", Physical Copies: " + physicalCopies + ", Available Copies: " + availableCopies + ", Times Rented: " + timesRented; }

	//Checks if there is an available copy for renting. If yes, then it prints a message of success and reduces the number of available copies by one as like the user rented the copy,
	//and increases the times rented counter by 1
	public void rentPhysicalCopy() {
		if ( isAvailable() == true ) {
			availableCopies--;
			timesRented++;
			System.out.println( "Book succesfully rented");
		}else {
			System.out.println( "There are no available books for renting");
		}
	}

	//Checks if there is at least one available physical copy of the book
	public boolean isAvailable() {
		return ( availableCopies > 0 );
	}


	//Checks if a given name is the name of this book's author
	public boolean hasAuthor( String authorname ) {
		Author author = new Author(authorname);
		return bookAuthors.checkIfAuthorExists( author );
	}



}