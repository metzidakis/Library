import java.util.ArrayList;
import java.util.Arrays;

public class AuthorList {
	
	/*               Exercise 3 (continued)
		Create a class named AuthorList that represents a List that stores Author objects.
		An instance variable of type AuthorList should be included in your Book class. 
		From now on, each book can have more than one authors.
		The AuthorList can be implemented internally (wrap inside) by using the ArrayList data structure, 
		provided by the Java Collections Framework.
		
                      Exercise 3 (continued)
		AuthorList should implement methods that provide at least the following functionality:
		a Constructor that can initialize and populate the List from a given array of authors (AuthorList(Author authorsArray[]){...}),
		add an author, (only if he doesn't already exists,
		check if author exists,
		a toString method that returns a String with all names,
		and (optionally) any other method of your preference!
		
	*/
	
	//variable
	ArrayList < Author > authorList;
	
		
	//constructor
	AuthorList ( Author[] authorsArray ) {
		this.authorList = new ArrayList<>();
		this.authorList.addAll( Arrays.asList( authorsArray ) );
	}
	
	
	//method for checking if an author exists in list
	public boolean checkIfAuthorExists( Author author ) {
		boolean validate = false;
		for (int i = 0; i < authorList.size(); i++ ) {
		if ( author.toString().equals(authorList.get(i).toString()) ) {
			validate = true;
		}
		}
		return validate;
	}
	
	//method for adding author if he does not exist
	public void addAuthor( String authorName ) {
		Author author = new Author(authorName);
		if ( checkIfAuthorExists( author ) == true ) {
			System.out.println("This author already exist!!!");
		} else {
			authorList.add(author);
		}
	}
	
	//method toString that returns a String with all names
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Author names: ");
		for (int i=0 ; i < authorList.size(); i++ ) {
			sb.append(authorList.get(i).toString());
			sb.append(", ");
		}
		return sb.toString();
	}

}
