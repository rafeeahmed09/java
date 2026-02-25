package HException;

class Throws {
    int AvailableBooks = 5;

    public void borrowBook(int bookRequested) throws Exception {

        if (bookRequested > AvailableBooks)
            throw new ArrayIndexOutOfBoundsException("not enough books available");

    }
}

public class ThrowsD {

    public static void main(String[] args) {
        Throws library1 = new Throws();
        try {
            library1.borrowBook(6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // System.out.println("Book not Available");
        }
    }

}
