import mypackage.buku
 mypackage.pensil;

public class App {
    public static void main(String[] args) {
        buku myBook = new buku();
        myBook.displayMessage();

        buku myPen = new pensil();
        myPen.displayMessage();
    }
}