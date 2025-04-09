package model.orang.mahasiswa;

import model.orang.Mahasiswa;

// Subclass tingkat 2
public class AsistenDosen extends Mahasiswa {
    private String mataKuliah;

    // Constructor that takes a Mahasiswa object and mataKuliah
    public AsistenDosen(Mahasiswa mahasiswa, String mataKuliah) {
        super(mahasiswa.getNama(), mahasiswa.getUmur(), mahasiswa.getIdMahasiswa());
        this.mataKuliah = mataKuliah;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + super.getNama());
        System.out.println("Umur: " + super.getUmur());
        System.out.println("ID Mahasiswa: " + super.getIdMahasiswa());
        System.out.println("Mata Kuliah: " + mataKuliah);
    }
}
