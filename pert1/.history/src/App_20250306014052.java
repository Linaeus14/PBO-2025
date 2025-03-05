
// # IMPORT LIBRARY/PACKAGE
// contoh penggunaan user-defined package
import mypackage.buku;
import mypackage.pensil;

// contoh penggunaan in-build package
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

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

        // contoh penggunaan in-built package BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Buka BufferedReader

        try {
            // Input String
            System.out.print("Enter your favorite color: ");
            String color = reader.readLine();
            System.out.println("Your favorite color is " + color + ".");

            // Input integer
            System.out.print("Enter your favorite number: ");
            int favoriteNumber = Integer.parseInt(reader.readLine());
            System.out.println("Your favorite number is " + favoriteNumber + ".");

            // Input double
            System.out.print("Enter your weight in kilograms: ");
            double weight = Double.parseDouble(reader.readLine());
            System.out.println("Your weight is " + weight + " kilograms.");

            // Input boolean
            System.out.print("Do you like programming (true/false): ");
            boolean likesProgramming = Boolean.parseBoolean(reader.readLine());
            System.out.println("Likes programming: " + likesProgramming);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close(); // tutup BufferedReader agar tidak terjadi memory leak
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        // # PERCABANGAN
        // contoh penggunaan if-else
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else if (age >= 13) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are a child.");
        }

        // contoh penggunaan ternary operator
        String ageGroup = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age group: " + ageGroup);

        // contoh penggunaan switch-case
        switch (age) {
            case 18:
                System.out.println("You just became an adult!");
                break;
            case 21:
                System.out.println("You are now 21 years old.");
                break;
            default:
                System.out.println("Your age is " + age);
                break;
        }

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

        // contoh penggunaan do-while loop
        System.out.println("Counting from 1 to 5 using do-while:");
        int doCount = 1;
        do {
            System.out.println(doCount);
            doCount++;
        } while (doCount <= 5);

        // contoh penggunaan continue dan break
        System.out.println("Counting from 1 to 10, skipping 5 and stopping at 8:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // skip angka 5
            }
            if (i == 8) {
                break; // berhenti di angka 8
            }
            System.out.println(i);
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
    }
}

// # IMPORT LIBRARY/PACKAGE
// contoh penggunaan user-defined package
import mypackage.buku;
import mypackage.pensil;

// contoh penggunaan in-build package
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

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

        // contoh penggunaan in-built package BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Buka BufferedReader

        try {
            // Input String
            System.out.print("Enter your favorite color: ");
            String color = reader.readLine();
            System.out.println("Your favorite color is " + color + ".");

            // Input integer
            System.out.print("Enter your favorite number: ");
            int favoriteNumber = Integer.parseInt(reader.readLine());
            System.out.println("Your favorite number is " + favoriteNumber + ".");

            // Input double
            System.out.print("Enter your weight in kilograms: ");
            double weight = Double.parseDouble(reader.readLine());
            System.out.println("Your weight is " + weight + " kilograms.");

            // Input boolean
            System.out.print("Do you like programming (true/false): ");
            boolean likesProgramming = Boolean.parseBoolean(reader.readLine());
            System.out.println("Likes programming: " + likesProgramming);

            reader.close(); // tutup BufferedReader agar tidak terjadi memory leak
        } catch (IOException e) {
            e.printStackTrace();
        }

        // # PERCABANGAN
        // contoh penggunaan if-else
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else if (age >= 13) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are a child.");
        }

        // contoh penggunaan ternary operator
        String ageGroup = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age group: " + ageGroup);

        // contoh penggunaan switch-case
        switch (age) {
            case 18:
                System.out.println("You just became an adult!");
                break;
            case 21:
                System.out.println("You are now 21 years old.");
                break;
            default:
                System.out.println("Your age is " + age);
                break;
        }

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

        // contoh penggunaan do-while loop
        System.out.println("Counting from 1 to 5 using do-while:");
        int doCount = 1;
        do {
            System.out.println(doCount);
            doCount++;
        } while (doCount <= 5);

        // contoh penggunaan continue dan break
        System.out.println("Counting from 1 to 10, skipping 5 and stopping at 8:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // skip angka 5
            }
            if (i == 8) {
                break; // berhenti di angka 8
            }
            System.out.println(i);
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

        // # METHOD/FUNGSI/PROSEDUR
        // contoh penggunaan method
        System.out.println("Sum of 5 and 3 is: " + sum(5, 3));
        greetUser(name);
    }

    // Method untuk menjumlahkan dua angka
    public static int sum(int a, int b) {
        return a + b;
    }

    // Method untuk menyapa pengguna
    public static void greetUser(String name) {
        System.out.println("Welcome, " + name + "!");
    }
}