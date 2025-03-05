// contoh penggunaan user defined package
import mypackage.buku;
import mypackage.pensil;

public class App {
    public static void main(String[] args) {
        buku myBook = new buku();
        myBook.displayMessage();

        pensil myPen = new pensil();
        myPen.displayMessage();
    }
}