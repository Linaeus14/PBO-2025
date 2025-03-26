import model.Orang;
import model.orang.Mahasiswa;
import model.orang.mahasiswa.AsistenDosen;

public class App {
    public static void main(String[] args) {
        // Membuat objek Orang
        Orang orang = new Orang("John Doe", 40);
        System.out.println("=== Informasi Orang ===");
        orang.tampilkanInfo();

        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("Alice", 20, "S12345");
        System.out.println("\n=== Informasi Mahasiswa ===");
        mahasiswa.tampilkanInfo();
        mahasiswa.tampilkanInfoMahasiswa();

        // Membuat objek AsistenDosen
        AsistenDosen asistenDosen = new AsistenDosen(mahasiswa, "Pemrograman Java");
        System.out.println("\n=== Informasi Asisten Dosen ===");
        asistenDosen.tampilkanInfo();
        asistenDosen.tampilkanInfoMahasiswa();
        asistenDosen.tampilkanInfoAsistenDosen();
    }
}
