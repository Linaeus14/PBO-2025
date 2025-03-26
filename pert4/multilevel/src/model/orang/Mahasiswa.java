package model.orang;

import model.Orang;

// Subclass
public class Mahasiswa extends Orang {
    protected String idMahasiswa;

    // Konstruktor
    public Mahasiswa(String nama, int umur, String idMahasiswa) {
        super(nama, umur); // Memanggil konstruktor dari superclass (Orang)
        this.idMahasiswa = idMahasiswa;
    }

    // Getter dan Setter untuk idMahasiswa
    public String getIdMahasiswa() {
        return idMahasiswa;
    }

    public void setIdMahasiswa(String idMahasiswa) {
        this.idMahasiswa = idMahasiswa;
    }

    // Metode untuk menampilkan detail Mahasiswa
    public void tampilkanInfoMahasiswa() {
        System.out.println("Nama: " + getNama());
        System.out.println("Umur: " + getUmur());
        System.out.println("ID Mahasiswa: " + idMahasiswa);
    }
}
