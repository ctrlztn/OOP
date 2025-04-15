package activity;

public class Book {
	private static String bookname;
	
	public static void main(String[] args) {
		String a = "Noli Me Tangere";
		setName(a);
		System.out.println("Title of the book: " + getName());
	 }
	
	static void setName(String name) {
		bookname = name;
	}
	
	static String getName() {
		return bookname;
	}
}

