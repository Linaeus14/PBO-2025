
// contoh penggunaan user-defined package
import mypackage.buku;
import mypackage.pensil;

// contoh penggunaan in-build package
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // contoh penggunaan user-defined package Buku dan Pensil
        buku myBook = new buku();
        myBook.displayMessage();

        pensil myPen = new pensil();
        myPen.displayMessage();

        // # INPUT
        // contoh penggunaan in-built package Scanner
        Scanner scanner = new Scanner(System.in); // Buka scanner

        // Input String
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        // Input integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        // Input double
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        System.out.println("Your height is " + height + " meters.");

        // Input boolean
        System.out.print("Are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Student status: " + isStudent);

        scanner.close(); // tutup scanner agar tidak terjadi memory leak
    }
}