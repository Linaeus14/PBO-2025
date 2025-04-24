import model.Komputer;

public class App {
    public static void main(String[] args) throws Exception {
        // Memanggil atribut dan method static tanpa instansiasi
        System.out.println("Akses tanpa objek:");
        Komputer.tampilkanMerk();

        // Method non-static tidak bisa diakses tanpa instansiasi
        // Komputer.tampilkanTipe();

        // Mengubah nilai atribut static
        Komputer.merk = "Asus";
        Komputer.tampilkanMerk();

        // Properti non-static tidak bisa diakses tanpa instansiasi
        // Komputer.tipe = "Desktop";

        // Contoh Exception baru dari class Komputer
        // Komputer.merk = null;
        // Komputer.tampilkanMerk();

        // Contoh NullPointerException
        try {
            String teks = null;
            System.out.println(teks.length());
        } catch (NullPointerException e) {
            System.out.println("Terjadi NullPointerException: " + e.getMessage());
        }
        finally {
            System.out.println("Akhir dari blok try-catch.");
        }

        // Contoh NumberFormatException
        try {
            String angka = "abc";
            int nilai = Integer.parseInt(angka);
            System.out.println("Nilai:" + nilai);
        } catch (NumberFormatException e) {
            System.out.println("Terjadi NumberFormatException: " + e.getMessage());
        }

        // Contoh ArrayIndexOutOfBoundsException
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // Contoh IllegalArgumentException
        try {
            Thread.sleep(-1000);
        } catch (IllegalArgumentException | InterruptedException e) {
            System.out.println("Terjadi IllegalArgumentException: " + e.getMessage());
        }
    }
}
