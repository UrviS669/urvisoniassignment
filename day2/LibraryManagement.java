package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		Library lib = new Library();
		String bookName = lib.addBook("Digital Signal Processing");
		System.out.println("The Book Name is"+bookName);
		lib.issueBook();
		
		

	}

}
