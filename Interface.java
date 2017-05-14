import java.lang.String;
import java.util.Scanner;
class Interface{

	/* User interface to interact with the librarian

	Exercise 4 (BONUS!)
	Create a command-line user interface for Exercise 3, providing the user, at least, the following options:
	Welcome to the Bootcamp library.
	How do you want to proceed?
	1. Show all available books
	2. Search for a book (by book title)
	3. Display books from a specific author
	4. Show me the most popular book
	q. Quit
	>

	Create (a fully detailed) class diagram for the entities described in exercise 3.

	*/


	public static void main(String []args) {

		// load data
		/** Create Random authors */
        Author ruth = new Author("Ruth");
        Author diane = new Author("Diane");
        Author jacqueline = new Author("Jacqueline");
        Author rachel = new Author("Rachel");
        Author joan = new Author("Joan");
        Author theresa = new Author("Theresa");
        Author angela = new Author("Angela");
        Author helen = new Author("Helen");
        Author lisa = new Author("Lisa");
        
        //make a complete list of all authors
        AuthorList allAuthors = new AuthorList( new Author[]{ruth, diane, jacqueline, rachel, joan, theresa, angela, helen, lisa });

	    /** Create books with from the existing authors */
	    Book book1 = new Book("Book1",new Author[]{ruth, joan},"368777540-2",10,2,20);
	    Book book2 = new Book("Book2",new Author[]{ruth},"963099898-2",10,1,22);
	    Book book3 = new Book("Book3",new Author[]{jacqueline, rachel},"005382097-2",10,0,23);
	    Book book4 = new Book("Book4",new Author[]{theresa, angela},"538310208-2",10,3,24);
	    Book book5 = new Book("Book5",new Author[]{lisa},"562448132-2",10,4,26);
	    Book book6 = new Book("Book6",new Author[]{helen},"670364563-2",10,2,21);
	    Book book7 = new Book("Book7",new Author[]{diane, jacqueline},"466916869-2",10,5,17);
	    Book book8 = new Book("Book8",new Author[]{angela, rachel},"764674973-2",10,0,15);
	    Book book9 = new Book("Book9",new Author[]{theresa, jacqueline},"052469721-2",10,6,17);
	    Book book10 = new Book("Book10",new Author[]{angela},"609291817-2",10,3,13);
	    Book book11 = new Book("Book11",new Author[]{lisa, ruth},"451378028-2",10,8,12);
	    Book book12 = new Book("Book12",new Author[]{theresa},"142352773-2",10,6,20);
	    Book book13 = new Book("Book13",new Author[]{lisa, rachel},"115135166-2",10,0,20);
	    Book book14 = new Book("Book14",new Author[]{helen},"631942468-2",10,3,20);
	    Book book15 = new Book("Book15",new Author[]{angela, helen},"323662444-2",10,0,23);
	    Book book16 = new Book("Book16",new Author[]{rachel},"121360492-2",10,0,12);
	    Book book17 = new Book("Book17",new Author[]{theresa, jacqueline, angela},"391199302-2",10,0,20);
	    Book book18 = new Book("Book18",new Author[]{angela,lisa},"549307784-2",10,1,20);
	    Book book19 = new Book("Book19",new Author[]{theresa, helen},"368777230-2",10,23,20);
	    Book book20 = new Book("Book20",new Author[]{ruth},"793027213-2",10,0,20);

	    /** Create the BookList from the books array above **/
	    BookList books = new BookList( new Book[]{book1,book2,book3,book4,book5,book6,book7,book8,book9,book10,book11,book12,book13,book14,book15,book16,book17,book18,book19,book20} );
	    
	    /** Assign the book collection to the library */
	    Library library = new Library(books);

		// Librarian, theGuyWhoKnowsAlot, undertakes the operation of the library
		Librarian theGuyWhoKnowsAlot = new Librarian(library);

		//variables
		boolean a = true;
		String b;
		String e = "dump";
		
		System.out.println( "Welcome to the Bootcamp library." );

		//loop for interacting with the librarian
		while ( a == true ) {
			
			System.out.println( "How do you want to proceed?" );
			System.out.println( "1. Show all available books" );
			System.out.println( "2. Search for a book (by book title)" );
			System.out.println( "3. Display books from a specific author" );
			System.out.println( "4. Show me the most popular book" );
			System.out.println( "5. Add a book" );
			System.out.println( "6. Remove a book" );
			System.out.println( "7. Rent a book" );
			System.out.println( "q. Quit" );

			Scanner input = new Scanner(System.in);
            b = input.nextLine();

			switch ( b ) {
				case "1" : theGuyWhoKnowsAlot.findMeAvailableBooks();
				           System.out.println( "press any button to return to menu" );
				           Scanner input4 = new Scanner(System.in);
                           e = input4.nextLine();
                           break;
				case "2" : Scanner input1 = new Scanner(System.in);
				           System.out.println( "Enter the name of the book you are searching: " );
                           String proxy = input1.nextLine();
				           theGuyWhoKnowsAlot.findMeBook(proxy);
				           System.out.println( "press any button to return to menu" );
				           Scanner input5 = new Scanner(System.in);
                           e = input5.nextLine();
                           break;
				case "3" : System.out.println( "Enter the name of the author: " );
				           Scanner input2 = new Scanner(System.in);
                           String d = input2.nextLine();
				           theGuyWhoKnowsAlot.findMeBooksFromAuthor(d);
				           System.out.println( "press any button to return to menu" );
				           Scanner input6 = new Scanner(System.in);
                           e = input6.nextLine();
                           break;
				case "4" : theGuyWhoKnowsAlot.findMostPopularBook();
				           System.out.println( "press any button to return to menu" );
				           Scanner input7 = new Scanner(System.in);
                           e = input7.nextLine();
                           break;
				case "5" : System.out.println( "Name of the book: " );
					       Scanner input12 = new Scanner(System.in);
			               String j = input12.nextLine();
						   System.out.println( "How many authors does the book have?: " );
					       Scanner input8 = new Scanner(System.in);
			               int f = input8.nextInt();
			               Author[] authors = new Author[f];
			               for (int i = 0 ; i < f ; i++) {
			            	   System.out.println( "Enter n." + (i+1) + " author name you want to add: " );
			            	   Scanner input9 = new Scanner(System.in);
				               String g = input9.nextLine();
				               Author author = new Author(g);
				               authors[i] = author;
			               }
			               System.out.println( "Enter the isbn of the book you want to add: " );
					       Scanner input9 = new Scanner(System.in);
			               String g = input9.nextLine();
			               System.out.println( "Enter the number of physical copies the book has: " );
					       Scanner input10 = new Scanner(System.in);
			               int h = input10.nextInt();
			               System.out.println( "Enter the number of available copies the book has: " );
					       Scanner input11 = new Scanner(System.in);
			               int i = input11.nextInt();
			               Book book = new Book (j,authors,g,h,i,0);
			               System.out.println( "Book Added " );
						   theGuyWhoKnowsAlot.addBook(book);
						   System.out.println( "press any button to return to menu" );
				           Scanner input14 = new Scanner(System.in);
                           e = input14.nextLine();
						   break;
				case "6" : System.out.println( "Enter the name of the book you want to remove: " );
				           Scanner input13 = new Scanner(System.in);
		                   String k = input13.nextLine();
						   theGuyWhoKnowsAlot.removeBook(k);
						   System.out.println( "press any button to return to menu or q to quit" );
				           Scanner input15 = new Scanner(System.in);
                           e = input15.nextLine();
						   break;
				case "7" : System.out.println( "Enter the name of the book you want to rent: " );
				           Scanner input16 = new Scanner(System.in);
		                   String l = input16.nextLine();
						   theGuyWhoKnowsAlot.rentPhysicalCopy(l);
						   System.out.println( "press any button to return to menu" );
				           Scanner input17 = new Scanner(System.in);
                           e = input17.nextLine();
                           break;
				case "q" : a = false;
				           System.out.println( "Thanks for using our library." );
				           break;


			}

			


		}




	}

}