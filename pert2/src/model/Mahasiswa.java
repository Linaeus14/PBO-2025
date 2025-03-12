package model;

// Definisi kelas Mahasiswa
public class Mahasiswa {
    // Atribut
    String nama;
    int nim;

    // Konstruktor
    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Metode untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
    }
}

// Penjelasan:
// 1. Kelas `Mahasiswa` memiliki dua atribut: `nama` dan `nim`.
// 2. Konstruktor `Mahasiswa` digunakan untuk menginisialisasi objek
//    dengan nilai `nama` dan `nim`.
// 3. Metode `tampilkanInfo` digunakan untuk menampilkan informasi mahasiswa.
// 4. Di dalam kelas `App`, kita membuat dua objek `Mahasiswa` dengan menggunakan konstruktor
//    dan menampilkan informasi mereka dengan memanggil metode `tampilkanInfo`.
// 5. Kita menggunakan `import model.Mahasiswa` untuk mengimpor kelas `Mahasiswa`
//    ke dalam kelas `App`. Dengan demikian, kita dapat membuat objek
//    dari kelas `Mahasiswa` di dalam kelas `App`.
