package model;

// Definisi kelas Mahasiswa
public class MataKuliah {
    // Atribut
    String subjek;
    int id;

    // Konstruktor
    public MataKuliah(String subjek, int id) {
        this.subjek = subjek;
        this.id = id;
    }

    // Metode untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Subjek: " + this.subjek);
        System.out.println("Id: " + this.id);
    }
}