package model;

// Polimorfisme Statis
public class Kalkulator {

    // Metode overload beda jumlah argumen
    public int tambah(int a, int b) {
        return a + b;
    }

    public int tambah(int a, double b) {
        return a + (int) b;
    }

    public int tambah(double b, int a) {
        return a + (int) b;
    }

    public int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Metode overload beda tipe data
    public double tambah(double a, double b) {
        return a + b;
    }


    public String tambah(String a, String b) {
        return a + b;
    }
}
