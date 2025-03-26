package model.orang.mahasiswa;

import model.orang.Mahasiswa;

public class AsistenDosen extends Mahasiswa {
    private String mataKuliah;

    // Constructor that takes a Mahasiswa object and mataKuliah
    public AsistenDosen(Mahasiswa mahasiswa, String mataKuliah) {
        super(mahasiswa.getNama(), mahasiswa.getUmur(), mahasiswa.getIdMahasiswa());
        this.mataKuliah = mataKuliah;
    }

    public void tampilkanInfoAsistenDosen() {
        System.out.println("Nama: " + getNama());
        System.out.println("Umur: " + getUmur());
        System.out.println("ID Mahasiswa: " + idMahasiswa);
        System.out.println("Mata Kuliah: " + mataKuliah);
    }
}