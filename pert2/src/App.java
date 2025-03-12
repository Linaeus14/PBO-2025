// Kelas Mahasiswa di dalam paket model
import model.Mahasiswa;
import model.MataKuliah;

public class App {
    public static void main(String[] args) throws Exception {
        // Membuat objek dari kelas Mahasiswa dan Matakuliah
        Mahasiswa mhs = new Mahasiswa("Budi", 12345);
        MataKuliah matkul = new MataKuliah("MTK", 67890);

        // Menampilkan informasi mahasiswa
        mhs.tampilkanInfo();
        matkul.tampilkanInfo();
    }
}
