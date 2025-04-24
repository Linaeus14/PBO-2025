package model;

public class Komputer {
    // Atribut static
    public static String merk = "Lenovo";
    public String tipe = "Laptop";

    // Method static
    public static void tampilkanMerk() throws Exception {
        System.out.println("Merk komputer: " + merk);
        if (merk == null) {
            // Menggunakan Exception untuk menangani kesalahan
            throw new Exception("error code 1: Merk tidak boleh null.");
        }
    }

    public void tampilkanTipe() {
        System.out.println("Tipe barang: " + merk);
    }
}
