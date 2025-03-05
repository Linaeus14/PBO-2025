// contoh penggunaan user-defined package
import mypackage.buku;
import mypackage.pensil;

// contoh penggunaan in-build package
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // contoh penggunaan user-defined package Buku
        buku myBook = new buku();
        myBook.displayMessage();

        pensil myPen = new pensil();
        myPen.displayMessage();

        // contoh penggunaan in-built package
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}