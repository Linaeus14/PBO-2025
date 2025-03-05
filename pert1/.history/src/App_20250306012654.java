// # IMPORT LIBRARY/PACKAGE
// contoh penggunaan user-defined package
import mypackage.buku;
import mypackage.pensil;

// contoh penggunaan in-build package
import java.util.Scanner;
import java.util.ArrayList;

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

        // # PERCABANGAN
        // contoh penggunaan if-else
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // contoh penggunaan ternary operator
        String ageGroup = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age group: " + ageGroup);

        // # PERULANGAN
        // contoh penggunaan for loop
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // contoh penggunaan while loop
        System.out.println("Counting down from 5 to 1:");
        int count = 5;
        while (count > 0) {
            System.out.println(count);
            count--;
        }

        // # ARRAYLIST
        // contoh penggunaan ArrayList
        ArrayList<String> items = new ArrayList<>();
        items.add("Book");
        items.add("Pen");
        items.add("Notebook");

        System.out.println("Items in the list:");
        for (String item : items) {
            System.out.println(item);
        }

        scanner.close(); // tutup scanner agar tidak terjadi memory leak
    }
}