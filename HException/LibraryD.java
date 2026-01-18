package HException;

class Library {

    int AvailableBooks = 5;

    public void borrowBook(int bookRequested) {
        try {
            int[] bookArray = { 101, 102, 103, 104, 105 };
            System.out.println("Book Requested:" + bookArray[bookRequested]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Book not Available");

        } finally {
            System.out.println(" finally block executed");
        }
    }

    public void setAvailableBooks(int AvailableBooks) {
        this.AvailableBooks = AvailableBooks;
    }
}

public class LibraryD {
    public static void main(String[] args) {                                                                                                        
        Library library1 = new Library();
        library1.borrowBook(6);
    }
}
