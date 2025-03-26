package model.orang.mahasiwa;

import interf.Pekerja;
import model.orang.Mahasiswa;

public class MhsPekerja extends Mahasiswa implements Pekerja {
    private String perusahaan;

    // Konstruktor
    public MhsPekerja(String nama, int umur, String idMahasiswa, String perusahaan) {
        super(nama, umur, idMahasiswa); // Memanggil konstruktor dari Mahasiswa
        this.perusahaan = perusahaan;
    }

    // Implementasi metode dari interface Pekerja
    @Override
    public void tampilkanInfoPekerja() {
        System.out.println("Perusahaan: " + perusahaan);
    }

    // Override metode tampilkanInfo untuk menampilkan semua informasi
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfoMahasiswa();
        System.out.println("Perusahaan: " + perusahaan);
    }
}
