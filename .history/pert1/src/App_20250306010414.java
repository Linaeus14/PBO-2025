import mypackage.Buku;
import mypackage.Pensil;

public class App {
    public static void main(String[] args) {
        Buku myBook = new Buku();
        myBook.displayMessage();

        Pensil myPen = new Pensil();
        myPen.displayMessage();
    }
}