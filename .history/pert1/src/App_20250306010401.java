import mypackage.Buku;
import mypackage.Pensil;

public class App {
    public static void main(String[] args) {
        Buku myBook = new Buku();
        myBook.displayMessage();

        Pnsil myPen = new Pnsil();
        myPen.displayMessage();
    }
}