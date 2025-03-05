import mypackage.buku;
import mypackage.pensil;

public class App {
    public static void main(String[] args) {
        Buku myBook = new Buku();
        myBook.displayMessage();

        pensil myPen = new pensil();
        myPen.displayMessage();
    }
}