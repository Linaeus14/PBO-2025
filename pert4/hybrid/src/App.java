import model.orang.mahasiwa.MhsPekerja;

public class App {
    public static void main(String[] args) {
        // Membuat objek MahasiswaPekerja
        MhsPekerja MhsPekerja = new MhsPekerja("Dina", 22, "S98765", "PT Sukses Makmur");

        System.out.println("=== Informasi Mahasiswa Pekerja ===");
        MhsPekerja.tampilkanInfo();
        MhsPekerja.tampilkanInfoMahasiswa();
        MhsPekerja.tampilkanInfoPekerja();
    }
}
