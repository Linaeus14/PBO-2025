package model;

public abstract class Kendaraan {
    // Abstract Method (harus diimplementasikan oleh subclass)
    public abstract void bergerak();

    // Concrete Method (bisa langsung digunakan oleh subclass)
    public void info() {
        System.out.println("Ini adalah kendaraan.");
    }
}
