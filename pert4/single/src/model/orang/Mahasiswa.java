package model.orang;

import model.Orang;

// Subclass
public class Mahasiswa extends Orang {
    private String idMahasiswa;

    // Konstruktor
    public Mahasiswa(String nama, int umur, String idMahasiswa) {
        super(nama, umur); // Memanggil konstruktor dari superclass (Orang)
        this.idMahasiswa = idMahasiswa;
        this.tampilkanInfo();
        super.tampilkanInfo();
    }

    // Getter dan Setter untuk idMahasiswa
    public String getIdMahasiswa() {
        return idMahasiswa;
    }

    public void setIdMahasiswa(String idMahasiswa) {
        this.idMahasiswa = idMahasiswa;
    }

    // Metode untuk menampilkan detail Mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Umur: " + getUmur());
        System.out.println("ID Mahasiswa: " + idMahasiswa);
    }
}
