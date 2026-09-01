import java.util.Scanner;

class Book {

    // Private data members
    private int bookId;
    private String title;
    private String author;

    // Method to read book details
    public void setBook() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        bookId = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Title: ");
        title = sc.nextLine();

        System.out.print("Enter Author: ");
        author = sc.nextLine();
    }

    // Getter methods
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class BookUtility {

    // Static method
    public static void displayBook(Book b) {

        System.out.println("\nBook Details");
        System.out.println("Book ID : " + b.getBookId());
        System.out.println("Title   : " + b.getTitle());
        System.out.println("Author  : " + b.getAuthor());
    }
}

public class Question2 {

    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();

        System.out.println("Enter Details of Book 1");
        book1.setBook();

        System.out.println("\nEnter Details of Book 2");
        book2.setBook();

        BookUtility.displayBook(book1);
        BookUtility.displayBook(book2);
    }
}