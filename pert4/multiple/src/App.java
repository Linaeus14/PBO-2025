import model.ParuhWaktu;

public class App {
    public static void main(String[] args) {
        // Membuat objek ParuhWaktu
        ParuhWaktu ParuhWaktu = new ParuhWaktu("Eka", 25, "PT Maju Jaya", "Universitas Indonesia");

        System.out.println("=== Informasi ParuhWaktu ===");
        ParuhWaktu.tampilkanInfo();
        ParuhWaktu.tampilkanInfoPekerja();
        ParuhWaktu.tampilkanInfoPelajar();
    }
}

// Pewarisan multiple (banyak) tidak didukung secara langsung di Java karena
// Java hanya mendukung pewarisan tunggal. Namun, kita dapat menggunakan
// interface untuk mensimulasikan pewarisan multiple. Diatas adalah contoh
// implementasi pewarisan multiple menggunakan interface.

// Untuk penjelasan interface, akan dijelakan di folder modul kedepannya.
