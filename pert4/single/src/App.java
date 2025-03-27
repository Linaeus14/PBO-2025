import model.Orang;
import model.orang.Mahasiswa;

public class App {
    public static void main(String[] args) {
        // Membuat objek Orang
        Orang orang = new Orang("John Doe", 40);
        System.out.println("=== Informasi Orang ===");
        orang.tampilkanInfo();


        // Membuat objek Mahasiswa
        System.out.println("\n=== Informasi Mahasiswa ===");
        Mahasiswa mahasiswa = new Mahasiswa("Alice", 20, "S12345");
        mahasiswa.tampilkanInfo();
    }
}
