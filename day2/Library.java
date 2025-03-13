package week1.day2;

public class Library {

			
		String addBook (String bookTitle) {
System.out.println("Book added Succesfully");
		return bookTitle;
		
	}
		public void issueBook() {
			System.out.println("Book issued Successfully");
			
			public static void main(String[] args) {
				Library lib = new Library();
				String bookName = lib.addBook("Digital Signal Processing");
				System.out.println("The Book Name is"+ bookName);
				lib.issueBook();
			}
		}

}
