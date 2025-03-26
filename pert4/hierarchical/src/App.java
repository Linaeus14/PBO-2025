import model.hewan.*;

public class App {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing = new Kucing("Kitty", 2, "Anggora");
        System.out.println("=== Informasi Kucing ===");
        kucing.tampilkanInfo();
        kucing.suara();

        // Membuat objek Anjing
        Anjing anjing = new Anjing("Buddy", 3, "Golden Retriever");
        System.out.println("\n=== Informasi Anjing ===");
        anjing.tampilkanInfo();
        anjing.suara();
    }
}
