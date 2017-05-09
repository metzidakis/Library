class Book {

	/*                      Exercise 3 (continued)
		Class Book
		Fields:
		title, type String,
		author, type Author,
		isbn, type String,
		physicalCopies, type int,
		availableCopies, type int, and
		timesRented, type int
		Important :
	    isbn cannot change after the initialization

		Methods:
		toString, return type String. Returns the details of the book including the Author details. The Authors' details should be acquired by the proper toString method.
		rentPhysicalCopy, type void. Checks if there is an available copy for renting. If yes, then it prints a message of success. What fields should be modified upon a successful rental?
		isAvailable, return type boolean. Checks if there is at least one available physical copy of the book, and
	    hasAuthor, return type boolean. Checks if a given name is the name of this book's author
	*/

	//Instance variables
	private String name;
	private Author author;
	private final String isbn;
	private int physicalCopies;
	private int availableCopies;
	private int timesRented;

	//Constructor
	Book ( String name, Author author, String isbn, int physicalCopies, int availableCopies, int timesRented ) {
		this.name = name;
		this.author = author;
		this.isbn = isbn;
		this.physicalCopies = physicalCopies;
		this.availableCopies = availableCopies;
		this.timesRented = timesRented;
	}

	//getters
	public String getName() { return name; }
	public Author getAuthor() { return author; }
	public String getIsbn() { return isbn; }
	public int getPhysicalCopies() { return physicalCopies; }
	public int getAvailableCopies() { return availableCopies; }
	public int getTimesRented() { return timesRented; }

	//setters
	public void  setName( String name ) { this.name = name; }
	public void  setAuthor( Author author ) { this.author = author; }
	public void  setPhysicalCopies( int physicalCopies ) { this.physicalCopies = physicalCopies; }
	public void  setAvailableCopies( int availableCopies ) { this.availableCopies = availableCopies; }
	public void  setTimesRented( int timesRented ) { this.timesRented = timesRented; }

	//Returns the details of the book including the Author details. The Authors' details should be acquired by the proper toString method.
	public String toString() { return "Name: " + name + ", Author: " + author.toString() + ", ISBN :" + isbn + ", Physical Copies: " + physicalCopies + ", Available Copies: " + availableCopies + ", Times Rented: " + timesRented; }

	//Checks if there is an available copy for renting. If yes, then it prints a message of success and reduces the number of available copies by one as like the user rented the copy,
	//and increases the times rented counter by 1
	public void rentPhysicalCopy() {
		if ( this.availableCopies > 0 ) {
			System.out.println( "There are " + this.availableCopies + " copies of " + this.name + " out of a total " + this.physicalCopies + " available for renting");
			this.availableCopies = ( this.availableCopies - 1 );
			this.timesRented = ( this.timesRented + 1 );
		}else {
			System.out.println( "There are no available books for renting");
		}
	}

	//Checks if there is at least one available physical copy of the book
	public boolean isAvailable() {
		boolean a = ( this.availableCopies > 0 );
		return a;
	}


	//Checks if a given name is the name of this book's author
	public boolean hasAuthor( String proxy ) {
		Author proxy1 = this.author;
	    boolean a = ( proxy1.toString().equals( proxy ) );
		return a;
	}



}