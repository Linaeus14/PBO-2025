import model.Hewan;
import model.hewan.*;
import model.Kalkulator;

public class App {
    public static void main(String[] args) {
        // Polimorfisme Dinamis (Method Overriding)
        Hewan hewan = new Hewan();
        hewan.suara(); // Output: Hewan bersuara

        Kucing hewan1 = new Kucing();
        hewan1.suara(); // Output: Kucing mengeong

        Anjing hewan2 = new Anjing();
        hewan2.suara(); // Output: Anjing menggonggong

        Sapi hewan3 = new Sapi();
        hewan3.suara(); // Output: Sapi melenguh

        // Polimorfisme Statis (Method Overloading)
        Kalkulator kalkulator = new Kalkulator();

        System.out.println("Penjumlahan bilangan bulat: " + kalkulator.tambah(5, 10)); // Output: 15
        System.out.println("Penjumlahan bilangan bulat: " + kalkulator.tambah(5, 10, 5)); // Output: 20
        System.out.println("Penjumlahan bilangan desimal: " + kalkulator.tambah(5.5, 10.5)); // Output: 16.0
        System.out.println("Penggabungan string: " + kalkulator.tambah("Halo, ", "Dunia!")); // Output: Halo, Dunia!
    }
}

// Penjelasan:
// 1. Polimorfisme Statis (Method Overloading): Metode dengan nama yang sama
// tetapi parameter yang berbeda (tipe data atau jumlah) dalam satu kelas. Kelas
// Kalkulator menunjukkan polimorfisme statis dengan metode tambah()
// yang di-overload untuk berbagai tipe data (int, double, String).
// 2. Polimorfisme Dinamis (Method Overriding): Subkelas mengubah implementasi
// metode yang diwarisi dari superclass. Ini memungkinkan perilaku yang berbeda
// untuk objek dari kelas yang berbeda saat menggunakan metode yang sama.
// Dalam contoh ini, kita memiliki kelas Hewan sebagai superclass dan Kucing,
// Anjing, dan Sapi sebagai subclass yang mengoverride metode suara() dari
// superclass Hewan.
// 3. Dalam kelas App, kita membuat objek dari subclass Hewan dan memanggil
// metode suara() untuk menunjukkan polimorfisme dinamis.
