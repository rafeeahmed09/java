package HException;

class Throw {
    int AvailableBooks = 5;

    public void borrowBook(int bookRequested) {
        try {
           if(bookRequested > AvailableBooks){
                throw new ArrayIndexOutOfBoundsException("not enough books available");
           }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Book not Available");

        } finally {
            System.out.println(" finally block executed");
        }
    }
}

public class ThrowD {
    public static void main(String[] args) {
        Throw library1 = new Throw();
        library1.borrowBook(10);
    }
}
