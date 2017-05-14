import java.util.ArrayList;
import java.util.Arrays;

public class AuthorList {
	
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
