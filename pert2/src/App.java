// Kelas Mahasiswa di dalam paket model
import model.Mahasiswa;

public class App {
    public static void main(String[] args) throws Exception {
        // Membuat objek dari kelas Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Budi", 12345);
        Mahasiswa mahasiswa2 = new Mahasiswa("Siti", 67890);

        // Menampilkan informasi mahasiswa
        mahasiswa1.tampilkanInfo();
        mahasiswa2.tampilkanInfo();
    }
}
