import model.*;

// Demonstrasi Keyword Final
final class Konstanta {
    public static final double PI = 3.14; // Variabel final (tidak bisa diubah)
}

// Error jika mencoba meng-extend final class
// class dinamika extends Konstanta {
    // class ini tidak bisa meng-extend Konstanta, karena Konstanta adalah final class
    // public void info() {
    //     System.out.println("Ini adalah kelas turunan dari Konstanta.");
    // }
// }

// Class utama
public class App {
    public static void main(String[] args) {
        // Polimorfisme dengan Abstract Class
        Kendaraan kendaraan1 = new Mobil();
        kendaraan1.info();
        kendaraan1.bergerak();

        Kendaraan kendaraan2 = new Kapal();
        kendaraan2.info();
        kendaraan2.bergerak();

        // Penggunaan Keyword Final
        System.out.println("Nilai PI: " + Konstanta.PI);

        // Error jika mencoba mengubah nilai final
        // Konstanta.PI = 3.14159; // Tidak diperbolehkan
    }
}
