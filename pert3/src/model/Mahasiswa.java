package model;

// Definisi kelas Mahasiswa
public class Mahasiswa extends Data {
    private String nama;
    private int nim;

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
        this.info = "Mahasiswa";
        showInfo();
    }

    // Getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
}